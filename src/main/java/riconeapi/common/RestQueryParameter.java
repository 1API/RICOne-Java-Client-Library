package riconeapi.common;

import org.springframework.util.StringUtils;

/**
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version x.x.x
 * @since 4/16/2018
 */
public class RestQueryParameter {
    private String opaqueMarker;
    private AUPPEnum aupp;

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

    public boolean hasOpaqueMarker() {
        return !StringUtils.isEmpty(this.getOpaqueMarker());
    }

    public boolean isCreateUsers() {
        if(this.aupp != null) {
            return this.aupp.equals(AUPPEnum.CREATE);
        }
        return false;
    }

    public boolean isDeleteUsers() {
        if(this.aupp != null) {
            return this.aupp.equals(AUPPEnum.DELETE);
        }
        return false;
    }

    public boolean isGetUsers() {
        if(this.aupp != null) {
            return this.aupp.equals(AUPPEnum.GET);
        }
        return false;
    }
}
