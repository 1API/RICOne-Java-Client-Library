package riconeapi.library.client.request;

/*
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 2.0.0
 * @since 1/8/2021
 */

/**
 * Used to classify the type of service path. These are defined as follows:
 * <p>
 *     <ul>
 *         <li>OBJECT - describes root service paths i.e. /xLeas</li>
 *         <li>SINGLE - describes single service paths i.e. /xLeas/{refId} </li>
 *         <li>PREDICATE - describes predicate service paths i.e. /xLeas/{refId}/xSchools</li>
 *     </ul>
 */
public enum ServicePathType {
    OBJECT(),
    SINGLE(),
    PREDICATE()
}
