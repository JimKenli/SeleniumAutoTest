package com.lzq.selenium.imoocTest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.lzq.selenium.imoocTest.base.DriverBase;

public class BasePage {
	public DriverBase driver;
	public BasePage(DriverBase driver){
		this.driver = driver;
		
	}
	
	/**
	 * 
	 * 封装Element
	 * @param By by
	 * */
	public WebElement element(By by){
		WebElement element = driver.findElement(by);
		return element;
	}
	
	/**
	 * 封装点击
	 * */
	public void click(WebElement element){
		if(element != null){
			element.click();
		}else{
			System.out.println("元素定位失败，点击失败");
		}		
	}
	
	/**
	 * 封装输入
	 * */
	public void sendKeys(WebElement element, String value){
		if (element != null){
			element.sendKeys(value);
		}else{
			System.out.println("元素定位失败，输入失败");
		}		
	}
	
	/**
	 * 判断元素是否显示
	 * */
	public boolean assertElementIs(WebElement element){
		return element.isDisplayed();
	}
	


}
