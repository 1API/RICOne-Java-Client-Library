package riconeapi.library.client.request;

/**
 * @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version 2.0.0
 * @since 1/14/2021
 */

/**
 * <p>Supported id types in RIC One API xPress data model.
 * </p>
 */
public enum IdType {
    REFID("refId"),
    LOCAL("local"),
    STATE("state"),
    BEDS("beds");

    private final String value;

    IdType(String value) {
        this.value = value;
    }

    String getValue() { return value; }
}
