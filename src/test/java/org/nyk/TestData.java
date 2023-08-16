package org.nyk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.baseclass.BaseClassMethods;

public class TestData extends BaseClassMethods {

	public static File file;
	public static FileInputStream fis;
	public static Properties prop;

	public static Properties getAPropertyFile() throws IOException {

		file = new File(
				"C:\\Users\\Harish\\eclipse-workspace\\NykaaMaster\\src\\test\\java\\org\\nyk\\config.properties");
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
		return prop;

	}

	public  String getABrowser() throws IOException {

		return getAPropertyFile().getProperty("browser");

	}

	public  String getAUrl() throws IOException {

		return getAPropertyFile().getProperty("url");

	}

	public  String getATitle() throws IOException {

		return getAPropertyFile().getProperty("powderpagetitle");

	}
	
	public  String getAHimalayaPageTitle() throws IOException {

		return getAPropertyFile().getProperty("himalayapagetitle");

	}
	
	public  String getWeight() throws IOException {

		return getAPropertyFile().getProperty("weight");

	}

}
