package riconeapi.common.rest;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version 1.7
 * @since Apr 20, 2018
 */
@SuppressWarnings("unused")
public class ResponseMulti<T> {
    private List<T> data;
    //	private String json;
//	private String xml;
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
//	/**
//	 * @return the json
//	 */
//	public String getJson()
//	{
//		return json;
//	}
//	/**
//	 * @param json the json to set
//	 */
//	public void setJson(String json)
//	{
//		this.json = json;
//	}
//	/**
//	 * @return the xml
//	 */
//	public String getXml()
//	{
//		return xml;
//	}
//	/**
//	 * @param xml the xml to set
//	 */
//	public void setXml(String xml)
//	{
//		this.xml = xml;
//	}

    /**
     * @return the statusCode of the response
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * @param statusCode the statusCode to set
     */
    public void setStatusCode(int statusCode) {
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
    public void setHeader(String header) {
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
    public void setMessage(String message) {
        this.message = message;
    }
}
