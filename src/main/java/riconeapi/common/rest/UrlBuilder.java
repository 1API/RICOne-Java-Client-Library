package riconeapi.common.rest;

import org.springframework.web.util.UriComponentsBuilder;

import static riconeapi.common.rest.RestUtil.toISO8601;

/**
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.8
 * @since 12/13/2018
 */
class UrlBuilder {
    static String urlBuildler(RestProperties rp) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(rp.getEndpoint().getHref());
        if(rp.getServicePath().getType().equals(ServicePathType.OBJECT)) {
            builder.path(rp.getServicePath().getValue());
        }
        else if(rp.getServicePath().getType().equals(ServicePathType.SINGLE) && !rp.getRestHeader().hasIdType()
                || rp.getServicePath().getType().equals(ServicePathType.PREDICATE)) {
            refIdBuilder(builder, rp);
        }

        if(rp.getRestQueryParameter().hasChangesSince()) {
            changesSinceBuilder(builder, rp);
        }
        if(rp.getRestQueryParameter().hasAUPP()) {
            auppBuilder(builder, rp);
        }
        if(rp.getRestHeader().hasIdType()) {
            otherIdTypeBuilder(builder, rp);
        }
        return builder.build().toUriString();
    }

    private static void changesSinceBuilder(UriComponentsBuilder builder, RestProperties rp){
        if (rp.getRestQueryParameter().hasOpaqueMarker()) {
            builder.queryParam("changesSinceMarker", rp.getRestQueryParameter().getOpaqueMarker());
        }
        else if(rp.getRestQueryParameter().hasOpaqueMarkerDate()) {
            builder.queryParam("changesSinceMarker", toISO8601(rp.getRestQueryParameter().getOpaqueMarkerDate()));
        }
    }

    private static void auppBuilder(UriComponentsBuilder builder, RestProperties rp){
        if(rp.getRestQueryParameter().hasAUPP()) {
            //todo this can be removed at some point. Deprecated as of v1.8.
            if(rp.getRestQueryParameter().isCreateUsers()) {
                builder.queryParam("createUsers", "true");
            }
            //todo this can be removed at some point. Deprecated as of v1.8.
            else if(rp.getRestQueryParameter().isDeleteUsers()) {
                builder.queryParam("deleteUsers", "true");
            }
            //todo this can be removed at some point. Deprecated as of v1.8.
            else if(rp.getRestQueryParameter().isDeleteUsernamesPasswords()) {
                builder.queryParam("deleteUsers", "true");
                builder.queryParam("usernames", "true");
            }
            else if(rp.getRestQueryParameter().isGetUsers()) {
                builder.queryParam("getUsers", "true");
            }
        }
    }

    private static void otherIdTypeBuilder(UriComponentsBuilder builder, RestProperties rp){
        String tempUrl = rp.getServicePath().getValue();
        tempUrl = tempUrl.replaceAll("\\{[^}]*}", rp.getRestHeader().getId());
        builder.path(tempUrl);
    }

    private static void refIdBuilder(UriComponentsBuilder builder, RestProperties rp) {
        String tempUrl = rp.getServicePath().getValue();
        tempUrl = tempUrl.replaceAll("\\{[^}]*}", rp.getRefId());
        builder.path(tempUrl);
    }
}
