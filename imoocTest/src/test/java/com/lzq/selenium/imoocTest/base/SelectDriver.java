package com.lzq.selenium.imoocTest.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDriver {
	public WebDriver driverName(String browser){
		if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe" );
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
		}else{
			//公司台式电脑的chromedriver.exe路径
			System.setProperty("webdriver.chrome.driver", "E:\\autotest\\chromedriver\\chromedriver.exe");
			//笔记本的chromedriver.exe路径
			//System.setProperty("webdriver.chrome.driver", "D:\\AutoTest\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		}
		
	}

}
