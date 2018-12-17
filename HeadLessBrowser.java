package examples;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser 
{	
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumSamples\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		 //D:\\SeleniumSamples\\chromedriver.exe
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://orangehrm.qedgetech.com");
		System.out.println("url lunched");
		
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("DD_HH_SS");
		String name = format.format(date);
		
		TakesScreenshot camera =(TakesScreenshot) driver;
		File screens = camera.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\chprasad\\Desktop\\New folder (2)\\samples\\screens\\headLess_"+name+".jpg");
		FileUtils.copyFile(screens, destFile);
		
		
		
	}
}
