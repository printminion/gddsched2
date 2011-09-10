package com.kupriyanov.android.apps.gddsched;

import java.util.Locale;
import java.util.TimeZone;

import com.google.android.apps.gddsched.R.xml;
import com.google.android.apps.iosched2.util.ParserUtils;

public class SetupDE implements ISetup {

	public static int BLOCKS_XML = xml.de_blocks;
	public static int ROOMS_XML = xml.de_rooms;

	public static final String WORKSHEETS_URL = "http://spreadsheets.google.com/feeds/worksheets/0An8ZzsaUDpaudE5DclRpTDJPLXVZS2VfT1NQZkVKU0E/public/basic";
	public static TimeZone CONFERENCE_TIME_ZONE = TimeZone.getTimeZone("Europe/Berlin");

	public static String BLOCK_TITLE_BREAKOUT_SESSIONS = "Vorträge";
	
	
	/*
	 * http://snipplr.com/view/23131/timezone-enum/
	 */
	public static final String TIME_ZONE = "+0100"; // RFC 822 - time zone
	public static final String TIME_ZONE_SPLITTED = "+01:00"; // RFC 822 - time

	public static final long CONFERENCE_START_MILLIS_DAY1 = ParserUtils.parseTime("2011-11-19T07:00:00.000+01:00");
	public static final long CONFERENCE_END_MILLIS_DAY1 = ParserUtils.parseTime("2011-11-19T20:00:00.000+01:00");

	/*
	 * http://www.herongyang.com/JDK/Locale-java-util-Local-Localization.html
	 */
	public static final Locale LOCALE = new Locale("de", "DE");

	public static final String CONFERNCE_URL = "http://www.google.com/events/developerday/2011/berlin/";

	public static final String CONFERENCE_HASHTAG = "#gdd11 #gddde";

	public static final boolean FEATURE_VENDORS_ON = false;
	public static final boolean FEATURE_OFFICEHOURS_ON = false;
	public static final boolean FEATURE_MAP_ON = false;
	public static final boolean FEATURE_ANNOUNCEMENTS_ON = false;
	public static final String ANNOUNCEMENT_URL = "http://www.google.com/events/developerday/2011/berlin/faq.html";

	public static final String EVENT_PREFIX = "de_";

}