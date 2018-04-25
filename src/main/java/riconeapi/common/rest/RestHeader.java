package riconeapi.common.rest;

import org.springframework.util.StringUtils;

/**
 * @author andrew.pieniezny <andrew.pieniezny@neric.org>
 * @version 1.7
 * @since 4/20/2018
 */
@SuppressWarnings("unused")
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

    public String getSchoolYear() { return String.valueOf(this.schoolYear); }

    public void setSchoolYear(Integer schoolYear) {
        this.schoolYear = schoolYear;
    }

    boolean hasPaging() {
        return this.navigationPage != null && this.navigationPageSize != null;
    }

    boolean hasIdType() {
        return !StringUtils.isEmpty(this.getIdType()) && !StringUtils.isEmpty(this.getId());
    }

    boolean hasSchoolYear() {
        return this.schoolYear != null;
    }

    @Override
    public String toString() {
        return "RestHeader{" +
                "navigationPage=" + navigationPage +
                ", navigationPageSize=" + navigationPageSize +
                ", idType='" + idType + '\'' +
                ", id='" + id + '\'' +
                ", schoolYear=" + schoolYear +
                '}';
    }
}