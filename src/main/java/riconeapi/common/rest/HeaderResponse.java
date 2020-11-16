package riconeapi.common.rest;

/**
 * @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version 1.9.0
 * @since 11/5/2020
 */
public class HeaderResponse {
    private String header;
    private int statusCode;
    private String message;
    private int navigationLastPage;
    private int recordCount;

    /**
     * Returns the headers of the response.
     * @return String value.
     */
    public String getHeader() {
        return header;
    }

    void setHeader(String header) {
        this.header = header;
    }

    /**
     * Returns the status code of the response.
     * @return Integer value.
     */
    public int getStatusCode() {
        return statusCode;
    }

    void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * Returns the message of the response.
     * @return String value.
     */
    public String getMessage() {
        return message;
    }

    void setMessage(String message) {
        this.message = message;
    }

    /**
     * Returns the last page value for specified service path object.
     * @return Integer value.
     */
    public int getNavigationLastPage() {
        return navigationLastPage;
    }

    void setNavigationLastPage(int navigationLastPage) {
        this.navigationLastPage = navigationLastPage;
    }

    /**
     * Returns the record count for specified service path object.
     * @return Integer value.
     */
    public int getRecordCount() {
        return recordCount;
    }

    public void setRecordCount(int recordCount) {
        this.recordCount = recordCount;
    }
}
