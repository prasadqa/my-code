package examples;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://cms.softpal.com/");
		driver.findElement(By.xpath("//input[@id='Wuc_pskin1_ctl00_ctl01_txtUid']")).sendKeys("manideep");
		driver.findElement(By.xpath("//input[@id='Wuc_pskin1_ctl00_ctl01_txtpwd']")).sendKeys("soft");
		driver.findElement(By.xpath("//input[@id='Wuc_pskin1_ctl00_ctl01_imglogin']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='hideinscandet']")).click();
		/*driver.findElement(By.xpath("//input[@id='txtOrgshort']")).sendKeys("vjd");
		driver.findElement(By.xpath("//input[@id='txtOrgshort']")).clear();
		*/
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_END);
		Thread.sleep(5000);
		/*driver.findElement(By.xpath("//input[@id='txtOrgshort']")).clear();
		Thread.sleep(5000);*/
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='txtOrgshort']")).sendKeys("VJD");
		
		/*robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		*/
		driver.findElement(By.xpath("//input[@id='txtDstshort']")).clear();
		driver.findElement(By.xpath("//input[@id='txtDstshort']")).sendKeys("nzb");

		
		/*robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);*/
		/*robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		/*robot.keyRelease(KeyEvent.VK_END);
		Thread.sleep(2000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);*/
		
		
		
		
		
	}

}
