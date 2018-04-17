package riconeapi.common;

/**
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.7
 * @since 4/16/2018
 */
public enum AUPPEnum {
    CREATE("create"),
    DELETE("delete"),
    GET("get");

    protected String value;

    public String getValue() {
        return value;
    }

    AUPPEnum(String value)
    {
        this.value = value;
    }
}
