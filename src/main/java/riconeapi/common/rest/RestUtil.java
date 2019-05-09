package riconeapi.common.rest;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/*
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.8.0
 * @since 5/7/2019
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
         OffsetDateTime odt = OffsetDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
         return DateTimeFormatter.ISO_DATE_TIME.format(odt);
    }
}
