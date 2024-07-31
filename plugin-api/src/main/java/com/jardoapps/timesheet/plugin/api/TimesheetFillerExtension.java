package com.jardoapps.timesheet.plugin.api;

import java.util.List;
import java.util.Map;

import org.pf4j.ExtensionPoint;

public interface TimesheetFillerExtension extends ExtensionPoint {

	boolean supportsLoading();

	boolean supportsTransforming();

	boolean supportsSaving();

	String getName();

	String getDescription();

	RecordLoader getLoader();

	RecordTransformer getTransformer();

	RecordSaver getSaver();

	public interface RecordLoader {
		List<ParamInfo> getParamInfos();
		List<TimesheetRecord> loadRecords(Map<String, String> params) throws Exception;
	}

	public interface RecordTransformer {
		List<ParamInfo> getParamInfos();
		List<TimesheetRecord> transformRecords(List<TimesheetRecord> records, Map<String, String> params);
	}

	public interface RecordSaver {
		List<ParamInfo> getParamInfos();
		void saveRecords(List<TimesheetRecord> records, Map<String, String> params);
	}

	// TODO: resolve lombok issue
	// @Value
	// @Builder
	public static class ParamInfo {
		private String id;
		private ParamType type;
		private String name;
		private String description;
		private String defaultValue;
		private boolean required;
	}

	public enum ParamType {
		STRING,
		SECRET_STRING,
		MULTILINE_STRING,
		FILE,
		DATE,
		NUMBER,
		BOOLEAN,
	}

}
