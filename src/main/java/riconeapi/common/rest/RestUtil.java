package riconeapi.common.rest;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

import java.util.Date;

/*
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.7.1
 * @since 6/21/2018
 */

/**
 * Utility class for REST requests.
 */
class RestUtil {
    /**
     * Convert a Date value to an ISO8601 date/timestamp String value
     * @param date Date value.
     * @return An ISO8601 String date/timestamp
     */
     static String toISO8601(Date date) {
        DateTime dt = new DateTime(date);
        DateTimeFormatter fmt = ISODateTimeFormat.dateTime();
        return fmt.print(dt);
    }
}
