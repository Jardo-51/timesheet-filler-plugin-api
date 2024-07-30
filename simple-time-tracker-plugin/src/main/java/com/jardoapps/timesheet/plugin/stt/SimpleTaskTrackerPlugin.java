package com.jardoapps.timesheet.plugin.stt;

import com.jardoapps.timesheet.plugin.api.TimesheetFillerPlugin;

public class SimpleTaskTrackerPlugin implements TimesheetFillerPlugin {

	@Override
	public boolean supportsLoading() {
		return true;
	}

	@Override
	public boolean supportsTransforming() {
		return false;
	}

	@Override
	public boolean supportsSaving() {
		return false;
	}

	@Override
	public String getName() {
		return "Simple Task Tracker App";
	}

	@Override
	public String getDescription() {
		return "Loads records exported from Simple Task Tracker application.";
	}

	@Override
	public RecordLoader getLoader() {
		return new SttRecordLoader();
	}

	@Override
	public RecordTransformer getTransformer() {
		throw new UnsupportedOperationException("SimpleTaskTrackerPlugin does not support transforming.");
	}

	@Override
	public RecordSaver getSaver() {
		throw new UnsupportedOperationException("SimpleTaskTrackerPlugin does not support saving.");
	}

}
