package com.solaredge.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.solaredge.resources.FindElements;

import org.junit.Assert;

public class SolarEdgeQAAutomation {
	private static WebDriver driver = null;
	
	public void invokebrowser(){
		try {
			System.setProperty("webdriver.chrome.driver", "./chromedriver");
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(400, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(400, TimeUnit.SECONDS);
			driver.get("https://www.solaredge.com/contact/qa_automation_test");
			
			FindElements.textbox_name(driver).sendKeys("Alex van Jaron");
			FindElements.textbox_emailaddress(driver).sendKeys("alexjaronnew@gmail.com");
			FindElements.textbox_subj(driver).sendKeys("Computer Applications");
			FindElements.textbox_message(driver).sendKeys("Message for today");
			FindElements.textbox_cnaam(driver).sendKeys("Sydney New");
			FindElements.textbox_csurnaam(driver).sendKeys("Van Maarssen");
			FindElements.textbox_compnaam(driver).sendKeys("ABC Industries Limited");
			FindElements.textbox_compadd(driver).sendKeys("801 Industrial Building");
			FindElements.textbox_compdropdown(driver).click();
			
			Select dropdown = new Select(FindElements.textbox_compdropdown(driver));
			dropdown.selectByVisibleText("United States");
			
			Thread.sleep(400);
			
			FindElements.textbox_complocal(driver).sendKeys("Chelsea");
			FindElements.textbox_comppost(driver).sendKeys("10001");
			FindElements.textbox_calc(driver).sendKeys("4");
			FindElements.textbox_compphone(driver).sendKeys("555-555-1234");
			FindElements.textbox_stateelement(driver).click();
			
			Select statedropdown = new Select(FindElements.textbox_stateelement(driver));
			statedropdown.selectByVisibleText("New York");
			
			FindElements.textbox_submit(driver).click();
			
			
			WebElement msg = FindElements.textbox_succmessage(driver);
	        String text = msg.getText();
	        String expectedText = "×\n" +
	                "Status message\n" +
	                "Successfully submitted";
	        Assert.assertEquals(expectedText, text);
	       
	        Thread.sleep(800);
	        driver.close();	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		SolarEdgeQAAutomation qaAutomation = new SolarEdgeQAAutomation();
		qaAutomation.invokebrowser();
		
	}

}
