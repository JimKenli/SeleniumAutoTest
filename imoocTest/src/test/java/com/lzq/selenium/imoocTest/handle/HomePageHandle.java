package com.lzq.selenium.imoocTest.handle;

import com.lzq.selenium.imoocTest.base.DriverBase;
import com.lzq.selenium.imoocTest.page.HomePage;

public class HomePageHandle {
	public DriverBase driver;
	public HomePage hp;
	public HomePageHandle(DriverBase driver){
		this.driver = driver;
		hp = new HomePage(driver);
	}
	/**
	 * 点击登陆按钮
	 * @throws Exception 
	 * */
	public void clickLogin() throws Exception{
		hp.click(hp.getLoginElement());
	}
	
	/**
	 * 点击实战按钮
	 * @throws Exception 
	 * */
	public void clickCoding() throws Exception{
		hp.click(hp.getCodingElement());
	}
	/**
	 * 获取用户名
	 * @throws Exception 
	 * */
	public String getUserName() {
		String username = hp.getText(hp.getUserNameElement());
		return username;
	}

	
}
