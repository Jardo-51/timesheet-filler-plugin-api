module com.jardoapps.timesheet.plugin.api {

	requires org.pf4j;

	requires static lombok;

	opens com.jardoapps.timesheet.plugin.api;

	exports com.jardoapps.timesheet.plugin.api;
	exports com.jardoapps.timesheet.plugin.api.testing;
}