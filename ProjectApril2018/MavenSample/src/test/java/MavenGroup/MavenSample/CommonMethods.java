package MavenGroup.MavenSample;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.plaf.FileChooserUI;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;


public class CommonMethods {
	public static boolean isElementExist(WebDriver driver,By locator){
		try
		{
		driver.findElement(locator);
		return true;
		}
		catch(NoSuchElementException ne){
			return false;
		}
	}
	public static String getUniqueName(){
		SimpleDateFormat smp = new SimpleDateFormat("YYYY_MMM_dd_hh_mm_ss");
		return smp.format(new Date());
	}
	public static String getScreenShot(WebDriver driver,String errFldpath)
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File fl = ts.getScreenshotAs(OutputType.FILE);
		String imgpath = errFldpath+"\\ohrm"+getUniqueName()+".jpg";
		try {
			Files.copy(fl,new File(imgpath));
			return imgpath;
		} catch (IOException e) {
			System.out.println("File not found");
			return null;
		}
	}
}
