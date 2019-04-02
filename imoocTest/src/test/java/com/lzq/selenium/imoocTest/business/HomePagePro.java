package com.lzq.selenium.imoocTest.business;

import com.lzq.selenium.imoocTest.base.DriverBase;
import com.lzq.selenium.imoocTest.handle.HomePageHandle;

public class HomePagePro {
	public HomePageHandle hph;
	public HomePagePro(DriverBase driver){
		hph =new HomePageHandle(driver);
	}
	/**
	 * 点击登陆按钮
	 * @throws Exception 
	 * */
	public void clickLoginButton() throws Exception{
		hph.clickLogin();
	}
	/**
	 * 点击实战按钮
	 * @throws Exception 
	 * */
	public void clickCodingLink() throws Exception{
		hph.clickCoding();
	}
	/**
	 * 根据用户名判断登陆信息是否正确
	 * @throws Exception 
	 * */
	public Boolean AssertLogin(String username) {
		if(hph.getUserName().equals(username)){
			return true;
		}
		return false;
	}
}

