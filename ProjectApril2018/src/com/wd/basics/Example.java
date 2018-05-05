package com.wd.basics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Example {

	public static void main(String[] args) {
		SimpleDateFormat sd = new SimpleDateFormat("YYYY MM dd");
		System.out.println(sd.format(new Date()));
	}

}
