package org.cleartrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NITHYA\\eclipse-workspace\\ClearTrip\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.cleartrip.com/trains");
			
 WebElement txtFrom = driver.findElement(By.xpath("//input[@type='text'])[1]"));
txtFrom.sendKeys("chennai Beach");
				
WebElement txtTo = driver.findElement(By.xpath("//input[@type='text'])[1]"));
txtTo.sendKeys("Coimbatore");
				
				
WebElement searchTrain = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
searchTrain.click();			
		}
}
