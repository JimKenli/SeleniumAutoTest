package com.lzq.selenium.imoocTest.testCase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lzq.selenium.imoocTest.base.DriverBase;
import com.lzq.selenium.imoocTest.business.HomePagePro;
import com.lzq.selenium.imoocTest.business.LoginPro;
import com.lzq.selenium.imoocTest.util.HandleCookie;
import com.lzq.selenium.imoocTest.util.ProUtil;

public class SuiteTestLogin extends CaseBase{

	public DriverBase driver;
	public LoginPro loginpro;
	public HomePagePro homepagepro;
	public ProUtil proutil;
	public HandleCookie handleCookie;
	
	@BeforeClass
	public void beforeClass(){
		this.driver = initDriver("chrome");
		driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		loginpro = new LoginPro(driver);
		homepagepro = new HomePagePro(driver);
		proutil = new ProUtil("loginTest.properties");
		handleCookie = new HandleCookie(driver);
		driver.get(proutil.getPro("url"));
	
	}
	@Test
	public void testLogin(){
	
		try {
			loginpro.login(proutil.getPro("username"),proutil.getPro("passwd"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(homepagepro.AssertLogin(proutil.getPro("yq"))){
			System.out.println("登录成功"+proutil.getPro("username"));
			handleCookie.writeLoginStatusCookie();
		}
	}
	
	@AfterClass
	public void afterClass(){
	
		driver.close();
	}
	
}