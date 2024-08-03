package com.jardoapps.timesheet.plugin.api.testing;

import java.nio.file.Path;
import java.util.Map;
import java.util.Set;

import org.pf4j.ExtensionFinder;
import org.pf4j.JarPluginManager;
import org.pf4j.LegacyExtensionFinder;
import org.pf4j.PluginManager;

/**
 * Plugin manager to be used in plugin integration tests.
 */
public class TestingPluginManager extends JarPluginManager {

	public TestingPluginManager(Path... pluginsRoots) {
		super(pluginsRoots);
	}

	/**
	 * Only load extensions from plugins, ignore the class path.
	 */
	@Override
	protected ExtensionFinder createExtensionFinder() {
		return new PluginOnlyExtensionFinder(this);
	}

	private static class PluginOnlyExtensionFinder extends LegacyExtensionFinder {

		public PluginOnlyExtensionFinder(PluginManager pluginManager) {
			super(pluginManager);
		}

		@Override
		public Map<String, Set<String>> readClasspathStorages() {
			// ignore class path storages
			return Map.of();
		}
	}
}
