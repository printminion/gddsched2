package com.kupriyanov.android.apps.gddsched;

import java.util.Locale;
import java.util.TimeZone;

import com.google.android.apps.gddsched.R.xml;
import com.google.android.apps.iosched2.util.ParserUtils;

public class SetupAR implements ISetup {

	public static int BLOCKS_XML = xml.ar_blocks;
	public static int ROOMS_XML = xml.ar_rooms;

	public static final String WORKSHEETS_URL = "http://spreadsheets.google.com/feeds/worksheets/0An8ZzsaUDpaudEJrbHRILWg3T3VJTDUtNnY5aXQ1YkE/public/basic";
	public static TimeZone CONFERENCE_TIME_ZONE = TimeZone.getTimeZone("America/Buenos_Aires");
	public static String BLOCK_TITLE_BREAKOUT_SESSIONS = "Breakout sessions";
	
	/*
	 *  http://snipplr.com/view/23131/timezone-enum/
	 */
	public static final String TIME_ZONE = "-0300"; // RFC 822 - time zone
	public static final String TIME_ZONE_SPLITTED = "-03:00"; // RFC 822 - time

	public static int CONFERENCE_DAYS = 2;
	public static final long CONFERENCE_START_MILLIS_DAY1 = ParserUtils.parseTime("2011-09-19T08:15:00.000-03:00");
	public static final long CONFERENCE_END_MILLIS_DAY1 = ParserUtils.parseTime("2011-09-19T18:20:00.000-03:00");

	public static final long CONFERENCE_START_MILLIS_DAY2 = ParserUtils.parseTime("2011-09-20T08:15:00.000-03:00");
	public static final long CONFERENCE_END_MILLIS_DAY2 = ParserUtils.parseTime("2011-09-20T13:00:00.000-03:00");

	
	/*
	 * http://www.herongyang.com/JDK/Locale-java-util-Local-Localization.html
	 */
	public static final Locale LOCALE = new Locale("es", "AR");

	public static final String CONFERNCE_URL = "http://www.google.com/intl/es/events/developerday/2011/buenos-aires/";

	public static final String CONFERENCE_HASHTAG = "#gdd11 #gddar";

	public static final boolean FEATURE_VENDORS_ON = false;
	public static final boolean FEATURE_OFFICEHOURS_ON = false;
	public static final boolean FEATURE_MAP_ON = false;
	public static final boolean FEATURE_ANNOUNCEMENTS_ON = false;
	public static final String ANNOUNCEMENT_URL = "http://www.google.com/intl/es/events/developerday/2011/buenos-aires/faq.html";

	public static final String EVENT_PREFIX = "ar_";

}