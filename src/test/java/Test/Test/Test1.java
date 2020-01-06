package Test.Test;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.annotations.Test;

public class Test1 {
	public static WebDriver driver;
	@Test
	public void test() throws Exception {
		System.out.println("Test");
		

		//System.setProperty("webdriver.gecko.driver","D:\\ArcSelenium\\DriverFiles\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver","/opt/Katalon_Studio/Katalon_Studio_Linux_64-6.1.1/configuration/resources/drivers/firefox_linux64/geckodriver");
		Thread.sleep(2000);
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
		
		   FirefoxProfile profile = new FirefoxProfile();
		
		   profile.setPreference("browser.download.folderList", 2);
		   profile.setPreference("browser.download.dir", System.getProperty("user.dir")  + File.separator +"Downloads" + File.separator );
		   profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		   profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/msword, application/csv, application/ris, text/csv, image/png, application/pdf, text/html, text/plain, application/zip, application/x-zip, application/x-zip-compressed, application/download, application/octet-stream, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet,application/excel");
		   profile.setPreference("browser.download.manager.showWhenStarting", false);
		   profile.setPreference("browser.download.manager.focusWhenStarting", false);  
		   profile.setPreference("browser.download.useDownloadDir", true);
		   profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		   profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		   profile.setPreference("browser.download.manager.closeWhenDone", true);
		   profile.setPreference("browser.download.manager.showAlertOnComplete", false);
		   profile.setPreference("browser.download.manager.useWindow", false);
		   profile.setPreference("services.sync.prefs.sync.browser.download.manager.showWhenStarting", false);
		   profile.setPreference("pdfjs.disabled", true);

			FirefoxOptions option = new FirefoxOptions();
			option.setProfile(profile);
			driver = new FirefoxDriver(option);
			driver.get("https://www.google.com/");
			System.out.println("Test Pass");
	}

}
