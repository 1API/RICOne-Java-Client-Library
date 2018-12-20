package riconeapi.common.rest;

import org.springframework.util.StringUtils;

import java.util.Date;

/*
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.8
 * @since 12/13/2018
 */
@SuppressWarnings("unused")
public class RestQueryParameter {
    private String opaqueMarker;
    private Date opaqueMarkerDate;
    private AUPPEnum aupp;

    public RestQueryParameter() {
    }

    public RestQueryParameter(String opaqueMarker) {
        this.opaqueMarker = opaqueMarker;
    }

    public RestQueryParameter(Date opaqueMarkerDate) {
        this.opaqueMarkerDate = opaqueMarkerDate;
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

    public Date getOpaqueMarkerDate() {
        return opaqueMarkerDate;
    }

    public void setOpaqueMarkerLong(Date opaqueMarkerDate) {
        this.opaqueMarkerDate = opaqueMarkerDate;
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

    boolean hasOpaqueMarkerDate() {
        return opaqueMarkerDate != null;
    }

    boolean hasChangesSince(){
        if(this.opaqueMarker != null || this.opaqueMarkerDate !=null){
            return true;
        }
        return false;
    }

    boolean hasAUPP() {
        if(this.aupp != null){
            return true;
        }
        return false;
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

    boolean isDeleteUsernamesPasswords() {
        if(this.aupp != null) {
            return  this.aupp.equals(AUPPEnum.DELETEUSERNAMESPASSWORDS);
        }
        return false;
    }

    boolean isGetUsers() {
        if(this.aupp != null) {
            return this.aupp.equals(AUPPEnum.GET);
        }
        return false;
    }

    @Override
    public String toString() {
        return "RestQueryParameter{" +
                "opaqueMarker='" + opaqueMarker + '\'' +
                ", opaqueMarkerDate=" + opaqueMarkerDate +
                ", aupp=" + aupp +
                '}';
    }
}
