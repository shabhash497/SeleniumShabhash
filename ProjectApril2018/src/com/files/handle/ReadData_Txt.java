package com.files.handle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadData_Txt {

	public static void main(String[] args) throws IOException {
		String filename  = "D:\\Selenium2018downloads\\Files\\first.txt";
		FileReader fr = new FileReader(filename);
		BufferedReader br = new BufferedReader(fr);
		String firstline  = br.readLine();
		while(firstline!=null){
			System.out.println(firstline);
			firstline = br.readLine();
		}
	}

}
