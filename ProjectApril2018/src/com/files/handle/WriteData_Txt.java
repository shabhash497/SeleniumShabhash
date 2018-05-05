package com.files.handle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData_Txt {

	public static void main(String[] args) throws IOException {
		String filepath = "D:\\Selenium2018downloads\\Files\\write";
		File fl = new File(filepath);
		//fl.mkdirs();
		FileWriter fw = new FileWriter(fl+"\\write.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("shabhash started his carrier");
		bw.newLine();
		bw.write("Meat in 2015");
		bw.close();

	}

}
