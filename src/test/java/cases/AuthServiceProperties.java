package cases;
/**
 * @author      Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version     x.x.x
 * @since       Jun 20, 2016
 * @filename	AuthenticationInfo.java
 */


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class AuthServiceProperties
{
	private static AuthServiceProperties instance = null;
	private final Properties configProp = new Properties();

	public static AuthServiceProperties getInstance()
	{
		if (instance == null)
		{
			instance = new AuthServiceProperties();
		}
		return instance;
	}
	
	private AuthServiceProperties()
	{
		InputStream in = this.getClass().getClassLoader().getResourceAsStream("ricone.auth.properties");
		
	    try 
	    {
	    	configProp.load(in);
	    } 
	    catch (IOException e) 
	    {
	    	e.printStackTrace();
	    }
	}

	public String getProperty(String key)
	{
		return configProp.getProperty(key);
	}

	public Set<String> getAllPropertyNames()
	{
		return configProp.stringPropertyNames();
	}

	public boolean containsKey(String key)
	{
		return configProp.containsKey(key);
	}
}
