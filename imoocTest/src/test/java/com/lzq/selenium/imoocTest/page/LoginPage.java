package com.lzq.selenium.imoocTest.page;

import org.openqa.selenium.WebElement;

import com.lzq.selenium.imoocTest.base.DriverBase;
import com.lzq.selenium.imoocTest.util.getByLocator;

public class LoginPage extends BasePage {

	public LoginPage(DriverBase driver) {
		super(driver);
	}
	
	/*
	 * 获取用户名输入框
	 */
	public WebElement getUserElement() throws Exception {
		return element(getByLocator.getLocator("username"));
	}
	
	/*
	 * 获取密码输入框
	 */
	public WebElement getPasswordElement() throws Exception{
		return element(getByLocator.getLocator("userPassword"));
	}
	/*
	 * 获取登录按钮
	 */
	public WebElement getLoginButtonElement() throws Exception{
		return element(getByLocator.getLocator("loginButtons"));
	}
	/*
	 * 获取自动登录按钮
	 */
	public WebElement getAutoSigninElement() throws Exception{
		return element(getByLocator.getLocator("autoLoginButton"));
	}

}
