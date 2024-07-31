package com.jardoapps.timesheet.plugin.api;

import java.time.Duration;
import java.time.LocalDateTime;

public final class TimesheetRecord {
	private final String project;
	private final LocalDateTime timeStarted;
	private final LocalDateTime timeEnded;
	private final String comment;
	private final String categories;
	private final String tags;
	private final Duration duration;

	@java.lang.SuppressWarnings("all")
	TimesheetRecord(final String project, final LocalDateTime timeStarted, final LocalDateTime timeEnded, final String comment, final String categories, final String tags, final Duration duration) {
		this.project = project;
		this.timeStarted = timeStarted;
		this.timeEnded = timeEnded;
		this.comment = comment;
		this.categories = categories;
		this.tags = tags;
		this.duration = duration;
	}


	@java.lang.SuppressWarnings("all")
	public static class TimesheetRecordBuilder {
		@java.lang.SuppressWarnings("all")
		private String project;
		@java.lang.SuppressWarnings("all")
		private LocalDateTime timeStarted;
		@java.lang.SuppressWarnings("all")
		private LocalDateTime timeEnded;
		@java.lang.SuppressWarnings("all")
		private String comment;
		@java.lang.SuppressWarnings("all")
		private String categories;
		@java.lang.SuppressWarnings("all")
		private String tags;
		@java.lang.SuppressWarnings("all")
		private Duration duration;

		@java.lang.SuppressWarnings("all")
		TimesheetRecordBuilder() {
		}

		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		public TimesheetRecord.TimesheetRecordBuilder project(final String project) {
			this.project = project;
			return this;
		}

		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		public TimesheetRecord.TimesheetRecordBuilder timeStarted(final LocalDateTime timeStarted) {
			this.timeStarted = timeStarted;
			return this;
		}

		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		public TimesheetRecord.TimesheetRecordBuilder timeEnded(final LocalDateTime timeEnded) {
			this.timeEnded = timeEnded;
			return this;
		}

		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		public TimesheetRecord.TimesheetRecordBuilder comment(final String comment) {
			this.comment = comment;
			return this;
		}

		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		public TimesheetRecord.TimesheetRecordBuilder categories(final String categories) {
			this.categories = categories;
			return this;
		}

		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		public TimesheetRecord.TimesheetRecordBuilder tags(final String tags) {
			this.tags = tags;
			return this;
		}

		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		public TimesheetRecord.TimesheetRecordBuilder duration(final Duration duration) {
			this.duration = duration;
			return this;
		}

		@java.lang.SuppressWarnings("all")
		public TimesheetRecord build() {
			return new TimesheetRecord(this.project, this.timeStarted, this.timeEnded, this.comment, this.categories, this.tags, this.duration);
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public java.lang.String toString() {
			return "TimesheetRecord.TimesheetRecordBuilder(project=" + this.project + ", timeStarted=" + this.timeStarted + ", timeEnded=" + this.timeEnded + ", comment=" + this.comment + ", categories=" + this.categories + ", tags=" + this.tags + ", duration=" + this.duration + ")";
		}
	}

	@java.lang.SuppressWarnings("all")
	public static TimesheetRecord.TimesheetRecordBuilder builder() {
		return new TimesheetRecord.TimesheetRecordBuilder();
	}

	@java.lang.SuppressWarnings("all")
	public String getProject() {
		return this.project;
	}

	@java.lang.SuppressWarnings("all")
	public LocalDateTime getTimeStarted() {
		return this.timeStarted;
	}

	@java.lang.SuppressWarnings("all")
	public LocalDateTime getTimeEnded() {
		return this.timeEnded;
	}

	@java.lang.SuppressWarnings("all")
	public String getComment() {
		return this.comment;
	}

	@java.lang.SuppressWarnings("all")
	public String getCategories() {
		return this.categories;
	}

	@java.lang.SuppressWarnings("all")
	public String getTags() {
		return this.tags;
	}

	@java.lang.SuppressWarnings("all")
	public Duration getDuration() {
		return this.duration;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof TimesheetRecord)) return false;
		final TimesheetRecord other = (TimesheetRecord) o;
		final java.lang.Object this$project = this.getProject();
		final java.lang.Object other$project = other.getProject();
		if (this$project == null ? other$project != null : !this$project.equals(other$project)) return false;
		final java.lang.Object this$timeStarted = this.getTimeStarted();
		final java.lang.Object other$timeStarted = other.getTimeStarted();
		if (this$timeStarted == null ? other$timeStarted != null : !this$timeStarted.equals(other$timeStarted)) return false;
		final java.lang.Object this$timeEnded = this.getTimeEnded();
		final java.lang.Object other$timeEnded = other.getTimeEnded();
		if (this$timeEnded == null ? other$timeEnded != null : !this$timeEnded.equals(other$timeEnded)) return false;
		final java.lang.Object this$comment = this.getComment();
		final java.lang.Object other$comment = other.getComment();
		if (this$comment == null ? other$comment != null : !this$comment.equals(other$comment)) return false;
		final java.lang.Object this$categories = this.getCategories();
		final java.lang.Object other$categories = other.getCategories();
		if (this$categories == null ? other$categories != null : !this$categories.equals(other$categories)) return false;
		final java.lang.Object this$tags = this.getTags();
		final java.lang.Object other$tags = other.getTags();
		if (this$tags == null ? other$tags != null : !this$tags.equals(other$tags)) return false;
		final java.lang.Object this$duration = this.getDuration();
		final java.lang.Object other$duration = other.getDuration();
		if (this$duration == null ? other$duration != null : !this$duration.equals(other$duration)) return false;
		return true;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final java.lang.Object $project = this.getProject();
		result = result * PRIME + ($project == null ? 43 : $project.hashCode());
		final java.lang.Object $timeStarted = this.getTimeStarted();
		result = result * PRIME + ($timeStarted == null ? 43 : $timeStarted.hashCode());
		final java.lang.Object $timeEnded = this.getTimeEnded();
		result = result * PRIME + ($timeEnded == null ? 43 : $timeEnded.hashCode());
		final java.lang.Object $comment = this.getComment();
		result = result * PRIME + ($comment == null ? 43 : $comment.hashCode());
		final java.lang.Object $categories = this.getCategories();
		result = result * PRIME + ($categories == null ? 43 : $categories.hashCode());
		final java.lang.Object $tags = this.getTags();
		result = result * PRIME + ($tags == null ? 43 : $tags.hashCode());
		final java.lang.Object $duration = this.getDuration();
		result = result * PRIME + ($duration == null ? 43 : $duration.hashCode());
		return result;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public java.lang.String toString() {
		return "TimesheetRecord(project=" + this.getProject() + ", timeStarted=" + this.getTimeStarted() + ", timeEnded=" + this.getTimeEnded() + ", comment=" + this.getComment() + ", categories=" + this.getCategories() + ", tags=" + this.getTags() + ", duration=" + this.getDuration() + ")";
	}
}
