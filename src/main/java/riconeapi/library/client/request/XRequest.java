package riconeapi.library.client.request;

import java.time.LocalDateTime;
import java.util.function.Consumer;

/**
 * @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version 2.0.0
 * @since 2/23/2021
 */

/**
 * The root class of a request. XRequest uses the XRequestBuilder class to append the
 * request components.
 * <p>
 *     The builder is comprised of the following methods:
 *     <ul>
 *         <li>servicePath</li>
 *         <li>id</li>
 *         <li>paging</li>
 *         <li>schoolYear</li>
 *         <li>changesSince</li>
 *         <li>accountProvisioning</li>
 *     </ul>
 *  <p>
 * At a minimum, a service path must be provided for a return.
 */
public class XRequest {
    private ServicePath servicePath;
    private String id;
    private IdType idType;
    private Paging paging;
    private Integer schoolYear;
    private ChangesSince changesSince;
    private boolean accountProvisioning;

    // set default to refid and queryparameter request to false
    private XRequest() {
        this.idType = IdType.REFID;
    }

    /**
     * Builder method that appends the components to make an XRequest.
     * @return the components of an XRequest.
     */
    public static XRequestBuilder builder() { return new XRequestBuilder(); }

    ServicePath servicePath() {
        return servicePath;
    }

    String id() {
        return id;
    }

    IdType idType() {
        return idType;
    }

    Paging paging() {
        return paging;
    }

    Integer schoolYear() {
        return schoolYear;
    }

    ChangesSince changesSince() {
        return changesSince;
    }

    boolean isAccountProvisioning() {
        return accountProvisioning;
    }

    /**
     * Builder class that appends the components to make an XRequest.
     */
    public static class XRequestBuilder {
        private final XRequest instance = new XRequest();

        /**
         * This method should be used to make a request for the desired service path. To specify
         * the service path, use the ServicePath enumerator.
         * @param servicePath the ServicePath enumerator for the request. See {@link ServicePath}.
         * @return an xPress object payload of a particular service path.
         */
        public XRequestBuilder servicePath(ServicePath servicePath) {
            instance.servicePath = servicePath;
            return this;
        }

        /**
         * Request an xPress object by id.
         * <p>
         * Default idType is RefId if not provided.
         * @param id type of Id.
         * @return an xPress object payload by refId.
         */
        public XRequestBuilder id(String id) {
            instance.id = id;
            return this;
        }

        /**
         * Request an xPress object by id and id type.
         * <p>
         * Default idType is RefId if not provided. Possible id type values can include
         * Local or BEDS for xLeas and xSchools objects. To specify the id type, use the IdType enumerator.
         * @param id id value.
         * @param idType header value for id type. See {@link IdType}.
         * @return an xPress object payload by a particular id and id type.
         */
        public XRequestBuilder id(String id, IdType idType) {
            instance.id = id;
            instance.idType = idType;
            return this;
        }

        /**
         * Request an xPress object with paging.
         * <p>
         * The default paging values are navigationPage=1 and navigationPageSize=100
         * if values not explicitly provided.
         * @return an xPress object payload with paging.
         */
        public Paging.XPagingBuilder paging() {
            Consumer<Paging> f = obj -> {instance.paging = obj;};
            return new Paging.XPagingBuilder(this, f);
        }

        /**
         * Request an xPress object by school year.
         * <p>
         * By default, the Data API will return the
         * latest school year currently available.
         * @param schoolYear the year of the requested data (i.e. 2021 for the 2020-2021 school year).
         * @return an xPress object payload with the designated school year.
         */
        public XRequestBuilder schoolYear(int schoolYear) {
            instance.schoolYear = schoolYear;
            return this;
        }

        /**
         * Request an xPress object's value changes from a given point in time. The date and time (opaque marker)
         * will be translated to an ISO8601 timestamp that indicates a point since the last changes have been requested.
         * <p>
         * <ul>
         *     <li>If the refId of a particular object in the response payload does not exist in the consumer’s data store it must be assumed to be NEW (i.e. created).</li>
         *      <li>If the refId of a particular object in the response payload does exist in the consumer’s data store it must be assumed to be UPDATED (i.e. changed). It is important to note that the full object is returned not a partial object because there is no way to indicate if the update is partial or full.</li>
         *      <li>If a particular object in the response payload contains only the refId the consumer must assume that object to be DELETED.</li>
         * </ul>
         * @param opaqueMarker The date and time since the last changes have been requested.
         * @return an xPress object payload with the object changes from given point in time.
         */
        public XRequestBuilder changesSince(LocalDateTime opaqueMarker) {
            instance.changesSince = new ChangesSince(opaqueMarker);
            return this;
        }

        /**
         * Request generated xStaffs or xStudents usernames.
         * <p>
         * This only applies to the service paths xSchools/{refId}/xStaffs and
         * xSchools/{refId}/xStudents.
         * @return an xPress object payload of user accounts.
         */
        public XRequestBuilder accountProvisioning() {
            instance.accountProvisioning = true;
            return this;
        }

        /**
         * Build an XRequest instance from the components contained in this builder.
         * @return the XRequest components.
         */
        public XRequest build() {
            return instance;
        }
    }


    boolean hasId() {
        return id() != null;
    }

    boolean hasIdType() {
        return idType() != null;
    }

    boolean hasPaging() {
        return paging() != null;
    }

    boolean hasSchoolYear() {
        return schoolYear() != null;
    }

    boolean hasChangesSince() {
        return changesSince() != null;
    }

    boolean hasAUPP() {
        return isAccountProvisioning();
    }
}
