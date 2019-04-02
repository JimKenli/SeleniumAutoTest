package com.lzq.selenium.imoocTest.testCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.lzq.selenium.imoocTest.base.DriverBase;
import com.lzq.selenium.imoocTest.business.CoursePagePro;
import com.lzq.selenium.imoocTest.business.OrderPayPagePro;
import com.lzq.selenium.imoocTest.business.SureOrderPagePro;
import com.lzq.selenium.imoocTest.util.HandleCookie;


public class SuiteTestBuy extends CaseBase {
	public DriverBase driver;
	public CoursePagePro cpp;
	public SureOrderPagePro sopp;
	public OrderPayPagePro oppp;
	public HandleCookie handleCookie;
	
	@BeforeClass
	public void beforeClass(){
		this.driver = initDriver("chrome");
		driver.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		cpp = new CoursePagePro(driver);
		handleCookie = new HandleCookie(driver);
		driver.get("https://coding.imooc.com/class/102.html");
		handleCookie.setCookie();
		//Cookie c1 = new Cookie("apsid", "M2NzE0NjZhNzkxZmYxZWRlODc2YjBjZmQxYjcyZDYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAMTM2MTE3MwAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA0OTU1MzQ0ODdAcXEuY29tAAAAAAAAAAAAAAAAAAAAADEwNWM5MTg5YjkzYzQ2NjAyNDUzODRiODU3MGJiYmFk0gl4XOyB7Fo%3DM2");
	    //driver.driver.manage().addCookie(c1);
		driver.refresh();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//proutil = new ProUtil("loginTest.properties");
		//driver.get(proutil.getPro("url"));
	
	}
	
	@Test
	public void testBuy(){

			cpp.buyNow();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String currentUrl = driver.driver.getCurrentUrl();
			System.out.println("当前网址："+ currentUrl);
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("跑完了");
		//driver.close();
	}

}
