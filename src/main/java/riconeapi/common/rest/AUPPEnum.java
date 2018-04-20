package riconeapi.common.rest;

/**
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.7
 * @since 4/20/2018
 */
@SuppressWarnings("unused")
public enum AUPPEnum {
    CREATE("create"),
    DELETE("delete"),
    GET("get");

    private final String value;

    public String getValue() {
        return value;
    }

    AUPPEnum(String value)
    {
        this.value = value;
    }
}
