package riconeapi.common;

import org.springframework.util.StringUtils;

/**
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version x.x.x
 * @since 4/16/2018
 */
public class RestHeader {
    private Integer navigationPage;
    private Integer navigationPageSize;
    private String idType;
    private String id;
    private Integer schoolYear;

    public RestHeader() {
    }

    public RestHeader(Integer schoolYear) {
        this.schoolYear = schoolYear;
    }

    public RestHeader(Integer navigationPage, Integer navigationPageSize) {
        this.navigationPage = navigationPage;
        this.navigationPageSize = navigationPageSize;
    }

    public RestHeader(String idType, String id) {
        this.idType = idType;
        this.id = id;
    }

    public RestHeader(Integer navigationPage, Integer navigationPageSize, Integer schoolYear) {
        this.navigationPage = navigationPage;
        this.navigationPageSize = navigationPageSize;
        this.schoolYear = schoolYear;
    }

    public RestHeader(String idType, String id, Integer schoolYear) {
        this.idType = idType;
        this.id = id;
        this.schoolYear = schoolYear;
    }

    public RestHeader(Integer navigationPage, Integer navigationPageSize, String idType, String id) {
        this.navigationPage = navigationPage;
        this.navigationPageSize = navigationPageSize;
        this.idType = idType;
        this.id = id;
    }

    public RestHeader(Integer navigationPage, Integer navigationPageSize, String idType, String id, Integer schoolYear) {
        this.navigationPage = navigationPage;
        this.navigationPageSize = navigationPageSize;
        this.idType = idType;
        this.id = id;
        this.schoolYear = schoolYear;
    }

    public String getNavigationPage() {
        return String.valueOf(this.navigationPage);
    }

    public void setNavigationPage(Integer navigationPage) {
        this.navigationPage = navigationPage;
    }

    public String getNavigationPageSize() {
        return String.valueOf(this.navigationPageSize);
    }

    public void setNavigationPageSize(Integer navigationPageSize) {
        this.navigationPageSize = navigationPageSize;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchoolYear() {
        return String.valueOf(this.schoolYear);
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }

    public boolean hasPaging() {
        if(this.navigationPage != null && this.navigationPageSize != null) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean hasIdType() {
        return !StringUtils.isEmpty(this.getIdType()) && !StringUtils.isEmpty(this.getId());
    }

    public boolean hasSchoolYear() {
        return !StringUtils.isEmpty(this.getSchoolYear());
    }
}
