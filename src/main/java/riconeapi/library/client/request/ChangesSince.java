package riconeapi.library.client.request;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version 2.0.0
 * @since 1/13/2021
 */
// Class that converts the LocalDateTime value to and ISO date/time format.
class ChangesSince {
    private LocalDateTime opaqueMarker;

    public ChangesSince(LocalDateTime opaqueMarker) {
        this.opaqueMarker = opaqueMarker;
    }

    public LocalDateTime getOpaqueMarker() {
        return opaqueMarker;
    }

    String toISO8601() {
        return opaqueMarker.format(DateTimeFormatter.ISO_DATE_TIME);
    }
}
