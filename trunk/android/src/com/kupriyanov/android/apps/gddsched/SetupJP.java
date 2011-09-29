package com.kupriyanov.android.apps.gddsched;

import gdd11.app.R.xml;

import java.util.Locale;
import java.util.TimeZone;

import com.google.android.apps.iosched2.util.ParserUtils;

public class SetupJP implements ISetup {

	public static int BLOCKS_XML = xml.jp_blocks;
	public static int ROOMS_XML = xml.jp_rooms;

	public static final String WORKSHEETS_URL = "http://spreadsheets.google.com/feeds/worksheets/0An8ZzsaUDpaudGJjMG00UDRDVHcyNHhpU0RxNkNTRkE/public/basic";
	public static TimeZone CONFERENCE_TIME_ZONE = TimeZone.getTimeZone("Asia/Tokyo");
	public static String BLOCK_TITLE_BREAKOUT_SESSIONS = "セッション";
	
	
	/*
	 * http://snipplr.com/view/23131/timezone-enum/
	 */
	public static final String TIME_ZONE = "+0900"; // RFC 822 - time zone
	public static final String TIME_ZONE_SPLITTED = "+09:00"; // RFC 822 - time

	public static final long CONFERENCE_START_MILLIS_DAY1 = ParserUtils.parseTime("2011-11-01T08:00:00.000+09:00");
	public static final long CONFERENCE_END_MILLIS_DAY1 = ParserUtils.parseTime("2011-11-01T18:00:00.000+09:00");

	/*
	 * http://www.herongyang.com/JDK/Locale-java-util-Local-Localization.html
	 */
	public static final Locale LOCALE = new Locale("ja", "JP");

	public static final String CONFERNCE_URL = "http://www.google.com/events/developerday/2011/tokyo/";

	public static final String CONFERENCE_HASHTAG = "#gdd11 #gdd11jp";
	public static final String EVENT_ID_SELECTED_NAME = "JP";
	

	public static final boolean FEATURE_VENDORS_ON = false;
	public static final boolean FEATURE_OFFICEHOURS_ON = false;
	public static final boolean FEATURE_MAP_ON = false;
	public static final boolean FEATURE_ANNOUNCEMENTS_ON = false;
	public static final String ANNOUNCEMENT_URL = "http://www.google.com/events/developerday/2011/tokyo/faq.html";

	public static final String EVENT_PREFIX = "jp_";

}