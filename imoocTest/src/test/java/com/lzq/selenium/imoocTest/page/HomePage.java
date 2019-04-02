package com.lzq.selenium.imoocTest.page;

import org.openqa.selenium.WebElement;

import com.lzq.selenium.imoocTest.base.DriverBase;
import com.lzq.selenium.imoocTest.util.getByLocator;

public class HomePage extends BasePage{
	public HomePage(DriverBase driver){
		super(driver);
	}
	/**
	 * 获取点击登陆element
	 * @throws Exception 
	 * */
	public WebElement getLoginElement() throws Exception{
		return element(getByLocator.getLocator("login"));
	}
	/**
	 * 获取实战element
	 * @throws Exception 
	 * */
	public WebElement getCodingElement() throws Exception{
		return nodeElement(getByLocator.getLocator("tophead"),getByLocator.getLocator("coding"));
	}
	
	/**
	 * 获取用户名信息element
	 * @throws Exception 
	 * */
	public WebElement getUserNameElement() {
		action(element(getByLocator.getLocator("header")));
		return element(getByLocator.getLocator("userInfo"));
	}

	
}

