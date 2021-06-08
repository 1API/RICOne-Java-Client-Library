package riconeapi.library.client.request;

/*
 * @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version 2.0.0
 * @since 1/7/2021
 */

/**
 * Supported AUPP request types in RIC One API. Currently getting user accounts is supported.
 */
@SuppressWarnings("unused")
public enum AUPPType {
    /**
     * AUPP Create users.
     */
//    CREATE("createUsers"),
    /**
     * AUPP Delete user passwords.
     */
//    DELETE("deleteUsers"),

    /**
     * Get users query parameter.
     */
    GET("getUsers");

    private final String value;

    AUPPType(String value)
    {
        this.value = value;
    }

    String getValue() {
        return value;
    }
}
