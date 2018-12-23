package com.lzq.selenium.imoocTest.handle;

import com.lzq.selenium.imoocTest.base.DriverBase;
import com.lzq.selenium.imoocTest.page.LoginPage;

public class LoginPageHandle {
	public DriverBase driver;
	public LoginPage lp;
	public LoginPageHandle(DriverBase driver){
		this.driver = driver;
		lp = new LoginPage(driver);
	}
	/*
	 * 输入用户名
	 */
	public void sendKeysUser(String username) throws Exception{
		lp.sendKeys(lp.getUserElement(), username);
	}
	/*
	 * 输入密码
	 */
	public void sendKeysPassword(String password) throws Exception{
		lp.sendKeys(lp.getPasswordElement(),password);
	}
	/*
	 * 点击登录
	 */
	public void clickLoginButton() throws Exception{
		lp.click(lp.getLoginButtonElement());
	}
	/*
	 * 点击自动登录按钮
	 */
	public void clickAutoSigninButton() throws Exception {
		lp.click(lp.getAutoSigninElement());
	}
	/*
	 * 
	 */
	public boolean assertLoginPage() throws Exception{
		return lp.assertElementIs(lp.getUserElement());
	}

}
