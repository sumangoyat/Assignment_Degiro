package com.solaredge.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElements {
	
	private static WebElement element = null;
	
	public static WebElement textbox_name(WebDriver driver) {
		element = driver.findElement(By.id("edit-name"));
		return element;
	}

	public static WebElement textbox_emailaddress(WebDriver driver) {
		element = driver.findElement(By.id("edit-mail"));
		return element;
	}
	
	public static WebElement textbox_subj(WebDriver driver) {
		element = driver.findElement(By.id("edit-subject-0-value"));
		return element;
	}
	
	public static WebElement textbox_message(WebDriver driver) {
		element = driver.findElement(By.id("edit-message-0-value"));
		return element;
	}
	
	public static WebElement textbox_cnaam(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"edit-field-client-address-0-address-given-name\"]"));
		return element;
	}
	
	public static WebElement textbox_csurnaam(WebDriver driver) {
		element = driver.findElement(By.id("edit-field-client-address-0-address-family-name"));
		return element;
	}
	
	public static WebElement textbox_compnaam(WebDriver driver) {
		element = driver.findElement(By.id("edit-field-client-address-0-address-organization"));
		return element;
	}
	
	public static WebElement textbox_compadd(WebDriver driver) {
		element = driver.findElement(By.id("edit-field-client-address-0-address-address-line1"));
		return element;
	}
	
	public static WebElement textbox_compdropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"edit-field-client-address-0-address-country-code--2\"]"));
		//return element;
	}
	
	public static WebElement textbox_compdropdownSelect(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"edit-field-client-address-0-address-country-code--2\"]"));
		return element;
	}
	
	public static WebElement textbox_complocal(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@data-drupal-selector= 'edit-field-client-address-0-address-locality']"));
		return element;
	}
	
	public static WebElement textbox_comppost(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@data-drupal-selector='edit-field-client-address-0-address-postal-code']"));
		return element;
	}
	
	public static WebElement textbox_calc(WebDriver driver) {
		element = driver.findElement(By.id("edit-field-number-0-value"));
		return element;
	}
	
	public static WebElement textbox_compphone(WebDriver driver) {
		element = driver.findElement(By.id("edit-field-phone-0-value"));
		return element;
	}
	
	public static WebElement textbox_stateelement(WebDriver driver) {
		element = driver.findElement(By.xpath("//select[@data-drupal-selector= 'edit-field-client-address-0-address-administrative-area']"));
		return element;
	}
	
	public static WebElement textbox_succmessage(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
		return element;
	}
	
	public static WebElement textbox_submit(WebDriver driver) {
		element = driver.findElement(By.id("edit-submit"));
		return element;
	}
	
}
