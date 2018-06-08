package com.wd.basics;

import java.util.concurrent.TimeUnit;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikulliSample {
	public static void main(String[] args) throws FindFailed{
		Screen scr = new Screen();
		Pattern pt = new Pattern("D:/Selenium Jars/Sikuli setup/Close.JPG");
		scr.wait(pt,2000);
		scr.click();
	}
}
