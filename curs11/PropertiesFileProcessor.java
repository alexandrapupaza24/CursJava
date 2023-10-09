package curs11;

import java.io.FileOutputStream;
import java.io.*;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFileProcessor {

	public void writePropertiesFile() {
		try {
			OutputStream outputStream = new FileOutputStream("test.properties");
			Properties propFile =new Properties();
			propFile.setProperty("user", "TestUser");
			propFile.setProperty("email", "TestUser@test.com");
			propFile.setProperty("browser", "Chrome");
			propFile.setProperty("url", "test.com");
			propFile.store(outputStream, "Am salvat fisierul.");
			outputStream.close();
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
	}
	
	
	public void readPropertiesFile(String key) {
		try {
			InputStream inputStream = new FileInputStream("test.properties");
			Properties propFile = new Properties();
			propFile.load(inputStream);
			System.out.println(propFile.getProperty(key));
			
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
	}
	
	public void updatePropertiesFile(String key, String value) {
		
		Properties propFile = new Properties();
		
		//incarc fisierul
		try {
			InputStream inputStream = new FileInputStream("test.properties");
			propFile.load(inputStream);
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		//scriu in fisiser
		try {
			OutputStream outputStream = new FileOutputStream("test.properties");
			propFile.setProperty(key,value);
			propFile.store(outputStream, "Am salvat fisierul.");
			//outputStream.close();
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
	}
}
