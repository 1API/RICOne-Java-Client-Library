package riconeapi.common.rest;

import org.springframework.http.MediaType;

/*
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.7.1
 * @since 6/20/2018
 */

/**
 * Supported return media types are JSON and XML.
 */
public enum MediaTypeEnum {
    /**
     * Request data in application/json.
     */
    JSON(MediaType.APPLICATION_JSON),
    /**
     * Request data in application/xml.
     */
    XML(MediaType.APPLICATION_XML);

    private final MediaType value;

    public MediaType getValue() {
        return value;
    }

    MediaTypeEnum(MediaType value) {
        this.value = value;
    }
}
