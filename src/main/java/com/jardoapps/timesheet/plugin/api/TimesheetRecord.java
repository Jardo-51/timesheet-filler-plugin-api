package com.jardoapps.timesheet.plugin.api;

import java.time.Duration;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public final class TimesheetRecord {
	private String project;
	private LocalDateTime timeStarted;
	private LocalDateTime timeEnded;
	private String comment;
	private String categories;
	private String tags;
	private Duration duration;
}
