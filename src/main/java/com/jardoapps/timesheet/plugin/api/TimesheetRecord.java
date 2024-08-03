package com.jardoapps.timesheet.plugin.api;

import java.time.Duration;
import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public final class TimesheetRecord {
	private String project;
	private LocalDateTime timeStarted;
	private LocalDateTime timeEnded;
	private String comment;
	private String categories;
	private String tags;
	private Duration duration;
}
