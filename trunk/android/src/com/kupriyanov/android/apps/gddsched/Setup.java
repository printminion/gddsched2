package com.kupriyanov.android.apps.gddsched;

import java.util.Locale;
import java.util.TimeZone;

import com.google.android.apps.iosched.util.ParserUtils;

public class Setup {

	// http://spreadsheets.google.com/feeds/worksheets/0Akgh73WhU1qHdHJmSUlSb0JIckowX1ZiQkhsYmdkdkE/public/basic

	//public static final String WORKSHEETS_URL = "http://spreadsheets.google.com/feeds/worksheets/0Akgh73WhU1qHdHJmSUlSb0JIckowX1ZiQkhsYmdkdkE/public/basic";
	
	public static final String WORKSHEETS_URL = "http://spreadsheets.google.com/feeds/worksheets/0Akgh73WhU1qHdHJmSUlSb0JIckowX1ZiQkhsYmdkdkE/public/basic";
	
	public static final String EXTRA_STATUS_RECEIVER = "com.kupriyanov.android.gddsched.extra.STATUS_RECEIVER";
	public static final TimeZone CONFERENCE_TIME_ZONE = TimeZone
			.getTimeZone("Europe/Prague");

	public static final String TIME_ZONE = "+0200"; // RFC 822 - time zone

	public static final long CONFERENCE_START_MILLIS_DAY1 = ParserUtils
			.parseTime("2011-10-18T08:00:00.000+02:00");
	public static final long CONFERENCE_END_MILLIS_DAY1 = ParserUtils
			.parseTime("2011-10-18T23:00:00.000+02:00");

	public static final long CONFERENCE_START_MILLIS_DAY2 = ParserUtils
			.parseTime("2011-10-19T08:00:00.000+02:00");
	public static final long CONFERENCE_END_MILLIS_DAY2 = ParserUtils
			.parseTime("2011-10-19T23:00:00.000+02:00");

	// public static final Locale LOCALE = Locale.US;
	public static final Locale LOCALE = Locale.GERMANY;
	public static final String EVENT_YEAR = "2011";
	// public static final String DATETIME_FORMAT = "EEEE MMM d yyyy h:mma Z";
	public static final String DATETIME_FORMAT = "dd.MM.yyyy HH:mm Z";
	public static final String CONFERNCE_URL = "http://www.google.de/intl/en/events/developerday/2011/";
	public static final String CONTENT_AUTHORITY = "com.kupriyanov.android.apps.gddsched";
	public static final String CONFERENCE_HASHTAG = "#gdd11";

	public static final boolean VENDORS_ON = false;
	public static final boolean OFFICEHOURS_ON = false;
	public static final int CONFERENCE_DAYS = 1;

}