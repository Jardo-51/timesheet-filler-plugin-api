package com.jardoapps.timesheet.plugin;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.pf4j.DefaultPluginManager;
import org.pf4j.JarPluginRepository;
import org.pf4j.PluginManager;
import org.pf4j.PluginRepository;

import com.jardoapps.timesheet.plugin.api.TimesheetFillerExtension;

class PluginTest {

	/**
	 * Verify that the built plugins can be loaded correctly.
	 */
	@Test
	void testPluginLoad() {

		List<Path> pluginPaths = List.of(Paths.get("../simple-time-tracker-plugin/target/"));

		PluginManager pluginManager = new JarOnlyPluginManager(pluginPaths);
		pluginManager.loadPlugins();
		pluginManager.startPlugins();

		List<String> pluginNames = pluginManager.getExtensions(TimesheetFillerExtension.class)
				.stream()
				.map(TimesheetFillerExtension::getName)
				.toList();

		assertThat(pluginNames).containsExactlyInAnyOrder("Simple Time Tracker App");
	}

	/**
	 * Only load JAR files (ignore everything else on the specified paths).
	 * <p>
	 * The <code>DefaultPluginManager</code> tries to load every nested directory in
	 * "target" and logs unnecessary errors.
	 */
	private static class JarOnlyPluginManager extends DefaultPluginManager {

		public JarOnlyPluginManager(List<Path> pluginsRoots) {
			super(pluginsRoots);
		}

		@Override
		protected PluginRepository createPluginRepository() {
			return new JarPluginRepository(getPluginsRoots());
		}
	}
}
