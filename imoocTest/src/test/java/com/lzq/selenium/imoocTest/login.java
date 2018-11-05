package com.lzq.selenium.imoocTest;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Listeners({TestngListenerScreenShot.class})
public class login extends baseDriver {
	//public WebDriver driver;
	@Test
	public void initDriver() throws Exception{
		//System.setProperty("webdriver.chrome.driver", "D:\\AutoTest\\chromedriver_win32\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver.get("http://www.imooc.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("js-signin-btn")).click();
		Thread.sleep(2000);
	}
	@Test(dependsOnMethods = {"initDriver"})
	public void loginScript() throws Exception{
		//this.initDriver();
	
		WebElement user = this.element(this.byStr("username"));
		WebElement password = this.element(this.byStr("userPassword"));
		WebElement autoLoginButton = this.element(this.byStr("autoLoginButton"));
		List<WebElement> loginButtons = this.elements(this.byStr("loginButtons"));
		
		System.out.println(user.isDisplayed());
		System.out.println(password.isDisplayed());		
		System.out.println(autoLoginButton.isDisplayed());
		System.out.println(loginButtons.size());
		
		//user.sendKeys(username);
		//password.sendKeys(userPassword);
		user.sendKeys("495534487@qq.com");
		password.sendKeys("2179mkw");
		//校验复选框是否被选中
		System.out.println(autoLoginButton.isSelected());
		if(autoLoginButton.isSelected()){
			autoLoginButton.click();
		}
		//System.out.println(loginButtons.get(1).getAttribute("value"));//输出该元素的value属性值
		loginButtons.get(1).click();
		Thread.sleep(3000);
		
		WebElement header = this.element(this.byStr("header"));
		Actions actions = new Actions(driver);
		actions.moveToElement(header).perform();
		String userInfo = this.element(this.byStr("userInfo")).getText();
		System.out.println(userInfo);
		if (userInfo.equals("lizhq")){
			System.out.println("登陆成功");
			this.takeScreenShot();
		}
		else{
			System.out.println("登录失败");
		}
		
	}
	
	/**
	 * By方法的封装
	 * @throws Exception 
	 */
	public By byStr(String username) throws Exception{
		ProUtil properties = new ProUtil("element.properties");
		String locator = properties.getPro(username);
		String locatorType = locator.split(">")[0];
		String locatorValue = locator.split(">")[1];
		
		if (locatorType.equals("id")){
			return By.id(locatorValue);
		}else if (locatorType.equals("name")){
			return By.name(locatorValue);
		}else if (locatorType.equals("className")){
			return By.className(locatorValue);
		}else{
			return By.xpath(locatorValue);
		}
		
	}
	
	/**
	 * 封装Element
	 */
	public WebElement element(By by){
		WebElement ele = driver.findElement(by);
		return ele;
	}
	public List<WebElement> elements(By by){
		List<WebElement> eles = driver.findElements(by);
		return eles;
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
	
/*	public static void main(String[] args) throws Exception{
		login login = new login();
		//login.loginScript("495534487@qq.com","2179mkw");
		*//**
		 * key-value
		 * username-password
		 *//*
		HashMap<String ,String> user = new HashMap<String,String>();
		user.put("495534487@qq.com", "2179mkw");
		user.put("13824480907", "test");
		Iterator us = user.entrySet().iterator();
		while(us.hasNext()){
			Map.Entry entry = (Map.Entry) us.next();
			String username = entry.getKey().toString();
			String password = entry.getValue().toString();
			//System.out.println(username+"密码："+password);
			login.loginScript(username,password);
		}
	}*/
}
