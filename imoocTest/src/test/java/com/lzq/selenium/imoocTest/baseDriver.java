package com.lzq.selenium.imoocTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseDriver {
    WebDriver driver;
	public baseDriver(){
		//公司台式电脑的chromedriver.exe路径
		System.setProperty("webdriver.chrome.driver", "E:\\autotest\\chromedriver\\chromedriver.exe");
		//笔记本的chromedriver.exe路径
		//System.setProperty("webdriver.chrome.driver", "D:\\AutoTest\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	/**
	 *截图
	 **/
	public void takeScreenShot(){
		long date = System.currentTimeMillis();
		String path = String.valueOf(date);
		String curPath = System.getProperty("user.dir");
		path = path + ".png";
		String screenPath = curPath +"/"+ path;
		System.out.println(screenPath);
		File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screen, new File(screenPath));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
