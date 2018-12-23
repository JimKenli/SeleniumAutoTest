package com.lzq.selenium.imoocTest.testCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.lzq.selenium.imoocTest.base.DriverBase;
import com.lzq.selenium.imoocTest.business.LoginPro;

public class Login extends CaseBase{
	public DriverBase driver;
	public LoginPro loginpro;
	public Login(){
		this.driver = initDriver("chrome");
		loginpro = new LoginPro(driver);
	}
	
	@Test
	public void getLoginHome(){
		driver.get("http://www.imooc.com");
		driver.findElement(By.id("js-signin-btn")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test(dependsOnMethods={"getLoginHome"})
	public void testLogin() throws Exception{
		loginpro.login("495534487@qq.com", "2179mkw");
	}

}
