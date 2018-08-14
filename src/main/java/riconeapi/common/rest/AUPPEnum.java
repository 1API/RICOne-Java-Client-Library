package riconeapi.common.rest;

/*
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.7.3
 * @since 8/13/2018
 */

/**
 * Supported AUPP requests of Create, Delete, and Get.
 */
@SuppressWarnings("unused")
public enum AUPPEnum {
    /**
     * AUPP Create users.
     */
    CREATE("create"),
    /**
     * AUPP Delete user passwords.
     */
    DELETE("delete"),
    /**
     * AUPP Delete user passwords.
     */
    DELETEPASSWORDS("deletePasswords"),
    /**
     * AUPP Delete usernames and passwords.
     */
    DELETEUSERNAMES("deleteUsernames"),
    /**
     * AUPP Get users.
     */
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
