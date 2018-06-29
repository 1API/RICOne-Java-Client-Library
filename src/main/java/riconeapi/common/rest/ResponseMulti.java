package riconeapi.common.rest;

import java.util.ArrayList;
import java.util.List;

/*
 * @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version 1.7.1
 * @since Jun 21, 2018
 */
@SuppressWarnings("unused")
public class ResponseMulti<T> {
    private List<T> data;
    private int statusCode;
    private String header;
    private String message;

    public ResponseMulti() {
        data = new ArrayList<>();
    }

    /**
     * @return the data from the service path
     */
    public List<T> getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(List<T> data) {
        this.data = data;
    }

    /**
     * @return the statusCode of the response
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * @param statusCode the statusCode to set
     */
    void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * @return the headers of the response
     */
    public String getHeader() {
        return header;
    }

    /**
     * @param header the headers to set
     */
    void setHeader(String header) {
        this.header = header;
    }

    /**
     * @return the error message of the response
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    void setMessage(String message) {
        this.message = message;
    }
}
