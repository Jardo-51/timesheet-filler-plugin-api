package com.jardoapps.timesheet.plugin;

import static org.assertj.core.api.Assertions.assertThat;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.pf4j.DefaultPluginManager;
import org.pf4j.PluginManager;

import com.jardoapps.timesheet.plugin.api.TimesheetFillerExtension;

class PluginTest {

	/**
	 * Verify that the built plugins can be loaded correctly.
	 */
	@Test
	void testPluginLoad() {

		List<Path> pluginPaths = List.of(Paths.get("../simple-time-tracker-plugin/target/"));

		PluginManager pluginManager = new DefaultPluginManager(pluginPaths);
		pluginManager.loadPlugins();
		pluginManager.startPlugins();

		List<String> pluginNames = pluginManager.getExtensions(TimesheetFillerExtension.class)
				.stream()
				.map(TimesheetFillerExtension::getName)
				.toList();

		assertThat(pluginNames).containsExactlyInAnyOrder("Simple Task Tracker App");
	}
}
