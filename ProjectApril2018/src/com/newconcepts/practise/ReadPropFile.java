package com.newconcepts.practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {

	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fl = new FileInputStream("C:\\Users\\ss00359827\\git\\SeleniumShabhash\\ProjectApril2018\\src\\com\\newconcepts\\practise\\Config.properties");
		prop.load(fl);
		System.out.println(prop.getProperty("shabha "+"shabhash"));
	}
	

}
