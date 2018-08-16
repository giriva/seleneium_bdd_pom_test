package managers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
 private String propertyFile = "configs\\config.properties";
 private Properties props = null;
 BufferedReader reader;
 
 public  ConfigFileReader(){
	  try {
		reader = new BufferedReader(new FileReader(propertyFile));
		props = new Properties();
		props.load(reader);
		
	} catch (FileNotFoundException e) {
		throw new RuntimeException("file not found" + propertyFile);
	} catch (IOException e) {
		e.printStackTrace();
	}
 }
 public String getDriverPath(){ 
	String driverPath =  props.getProperty("driverPath");
	if(driverPath != null)
	return driverPath;
	else throw new RuntimeException("driverpath not found");	
 }
 public String getURl(){
	 String url = props.getProperty("url");
	 if(url !=null)
	return url;
	 else throw new RuntimeException("url not found");	
 }
 
 public long getSeconds(){
	 String seconds = props.getProperty("seconds");
	 if(seconds !=null)
	return Long.parseLong(seconds) ;
	 else throw new RuntimeException("url not found");	
 }
 
}
