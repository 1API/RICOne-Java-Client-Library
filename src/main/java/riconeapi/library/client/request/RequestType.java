package riconeapi.library.client.request;

/**
 * @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version 2.0.0
 * @since 1/8/2021
 */

/**
 * Request types in RIC One API xPress data model. Used to classify the request of each service path.
 * A service path can be classified by multiple request types.
 * <p>
 *     <ul>
 *         <li>BASIC - whether a service path supports core functions i.e. refId and paging.</li>
 *         <li>ID - whether a service path supports requests using the local or state id.</li>
 *         <li>CHANGES_SINCE - whether a service path supports changes since. </li>
 *         <li>AUPP - whether a service path supports account provisioning.</li>
 *     </ul>
 */
public enum RequestType {
    /**
     * Service path supports core functions i.e. refId and paging.
     */
    BASIC("XPressRequest"),
    /**
     * Service path supports requests using the local or state id.
     */
    ID("XPressRequestId"),
    /**
     * Service path supports changes since.
     */
    CHANGES_SINCE("XPressRequestChangesSince"),
    /**
     * Service path supports account provisioning.
     */
    AUPP("XPressRequestAUPP");

    private final String value;

    RequestType(String value) { this.value = value; }

    String getValue() { return value; }
}
