package riconeapi.common.rest;

import org.springframework.util.StringUtils;

/**
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.7
 * @since 4/20/2018
 */
@SuppressWarnings("unused")
public class RestQueryParameter {
    private String opaqueMarker;
    private AUPPEnum aupp;

    public RestQueryParameter() {
    }

    public RestQueryParameter(String opaqueMarker) {
        this.opaqueMarker = opaqueMarker;
    }

    public RestQueryParameter(AUPPEnum aupp) {
        this.aupp = aupp;
    }

    public String getOpaqueMarker() {
        return opaqueMarker;
    }

    public void setOpaqueMarker(String opaqueMarker) {
        this.opaqueMarker = opaqueMarker;
    }

    public AUPPEnum getAupp() {
        return aupp;
    }

    public void setAupp(AUPPEnum aupp) {
        this.aupp = aupp;
    }

    boolean hasOpaqueMarker() {
        return !StringUtils.isEmpty(this.getOpaqueMarker());
    }

    boolean isCreateUsers() {
        if(this.aupp != null) {
            return this.aupp.equals(AUPPEnum.CREATE);
        }
        return false;
    }

    boolean isDeleteUsers() {
        if(this.aupp != null) {
            return this.aupp.equals(AUPPEnum.DELETE);
        }
        return false;
    }

    boolean isGetUsers() {
        if(this.aupp != null) {
            return this.aupp.equals(AUPPEnum.GET);
        }
        return false;
    }
}
