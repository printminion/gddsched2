package com.kupriyanov.android.apps.gddsched;

import java.util.Locale;
import java.util.TimeZone;

import com.google.android.apps.iosched2.util.ParserUtils;

public class SetupCZ implements ISetup {

	// http://spreadsheets.google.com/feeds/worksheets/0Akgh73WhU1qHdHJmSUlSb0JIckowX1ZiQkhsYmdkdkE/public/basic

	// public static final String WORKSHEETS_URL =
	// "http://spreadsheets.google.com/feeds/worksheets/0An8ZzsaUDpaudDRhQmRZdVRXemIwMzRPcGNlQV93a1E/public/basic";

	public static final String WORKSHEETS_URL = "";// "http://spreadsheets.google.com/feeds/worksheets/0Akgh73WhU1qHdHJmSUlSb0JIckowX1ZiQkhsYmdkdkE/public/basic";

	public static TimeZone CONFERENCE_TIME_ZONE = TimeZone.getTimeZone("Europe/Prague");

	//http://snipplr.com/view/23131/timezone-enum/
	public static final String TIME_ZONE = "-0300"; // RFC 822 - time zone
	public static final String TIME_ZONE_SPLITTED = "-03:00"; // RFC 822 - time
																// zone

	public static final long CONFERENCE_START_MILLIS_DAY1 = ParserUtils.parseTime("2011-08-18T08:00:00.000-03:00");
	public static final long CONFERENCE_END_MILLIS_DAY1 = ParserUtils.parseTime("2011-08-18T23:00:00.000-03:00");

	public static final long CONFERENCE_START_MILLIS_DAY2 = ParserUtils.parseTime("2011-10-19T08:00:00.000-03:00");
	public static final long CONFERENCE_END_MILLIS_DAY2 = ParserUtils.parseTime("2011-10-19T23:00:00.000-03:00");
	
	/*
	 * http://www.herongyang.com/JDK/Locale-java-util-Local-Localization.html
	 */
	public static final Locale LOCALE = new Locale("cs", "CZ");
	
	//public static final Locale LOCALE = Locale.US;
	//public static final Locale LOCALE = Locale.GERMANY;
	
	public static final String EVENT_YEAR = "2011";
	// public static final String DATETIME_FORMAT = "EEEE MMM d yyyy h:mma Z";
	public static final String DATETIME_FORMAT = "dd.MM.yyyy HH:mm Z";
	//public static final String CONFERNCE_URL = "http://www.google.com/events/developerday/2011/";
	public static final String CONFERNCE_URL = "http://www.google.com/events/developerday/2011/prague/";
	
	public static final String CONFERENCE_HASHTAG = "#gdd11";

	public static final boolean FEATURE_VENDORS_ON = false;
	public static final boolean FEATURE_OFFICEHOURS_ON = false;
	public static final boolean FEATURE_MAP_ON = false;
	public static final boolean FEATURE_ANNOUNCEMENTS_ON = true;

	public static final String ANNOUNCEMENT_URL = "http://www.google.com/events/developerday/2011/prague/faq.html";
	
	public static final int CONFERENCE_DAYS = 1;

	public static final String EVENT_PREFIX = "cz_";

	public static final String CONTENT_AUTHORITY = "com.google.android.apps.gddsched";// com.kupriyanov.android.apps.gddsched";

	public static final String ANALYTICS_CODE = "UACODE"; //INSERT_YOUR_ANALYTICS_UA_CODE_HERE

}