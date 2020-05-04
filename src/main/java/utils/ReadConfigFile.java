package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile 
{
	FileInputStream fis;
	public static Properties prop;
	public ReadConfigFile()
	{	
		try
		{
			fis=new FileInputStream("C:/Users/Coditas/eclipse-workspace/Ambrycare/src/main/java/TestData/config.properties");			
			prop=new Properties();
			prop.load(fis);			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public String getBrowser() 
	{
		if (prop.getProperty("browser") == null)
			return "";
		return prop.getProperty("browser");
	}
	public String getUrl() 
	{
		if (prop.getProperty("url") == null)
			return "";
		return prop.getProperty("url");
	}
	public String getUsername() 
	{
		if (prop.getProperty("username") == null)
			return "";
		return prop.getProperty("username");
	}
	public String getPassword() 
	{
		if (prop.getProperty("password") == null)
			return "";
		return prop.getProperty("password");
	}
	

}
