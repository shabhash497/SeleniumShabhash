package com.wd.pom;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class OhrmIntPOMRemote {
 WebDriver driver;
 public LoginPagePOM loginPage;
 public WelcomePagePOM welcomePage;
 public AddEmpPagePOM addEmpPage;
 //public DataFactory datafactrypage;
 public void openApplicationinRemote(String brName, String appUrl,String nodeURL) throws MalformedURLException {
	 switch (brName) {
	case "chrome":
		driver = new RemoteWebDriver(new URL(appUrl), DesiredCapabilities.chrome());
		break;
	case "firefox":
		driver = new RemoteWebDriver(new URL(appUrl), DesiredCapabilities.firefox());
		break;
	case "ie":
		driver = new RemoteWebDriver(new URL(appUrl), DesiredCapabilities.internetExplorer());
		break;
	default:
		System.out.println("browser name not found");
		System.exit(0);
	}
	 driver.get(appUrl);
	initPageClasses();

 }
 private  void initPageClasses(){
	 loginPage = new LoginPagePOM(driver);
     welcomePage = new WelcomePagePOM(driver);
	addEmpPage = new AddEmpPagePOM(driver);
}
 public void closeApplication(){
		driver.quit();
		System.out.println("Application is closed");
	}


}
