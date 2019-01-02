package com.lzq.selenium.imoocTest.testCase;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.lzq.selenium.imoocTest.base.DriverBase;

public class testCourseList extends CaseBase{
	public DriverBase driver;
	public testCourseList(){
		this.driver = initDriver("chrome");
	}
	@Test
	public void CourseList(){
		driver.get("https://coding.imooc.com/");
		List<String> listString = listElement();
		for(int i = 0; i < listString.size(); i++){
			driver.findElement(By.className("imv2-close")).click();
			WebElement des = driver.findElement(By.xpath("//*[contains(text(),'"+listString.get(i)+"')]"));
			//driver.executeScript("arguments[0].scrollIntoView(false);", des);
			des.click();
			driver.back();
		}
		
	}
	
	/*
	 * 获取所有课程的list
	 */
	public List<String> listElement(){
		List<String> listString = new ArrayList<String>();
		WebElement element = driver.findElement(By.className("shizhan-course-list"));
		List<WebElement> listElement = element.findElements(By.className("shizhan-course-box"));
		for(WebElement el : listElement){
			//用空格把取得的文本内容分成几部分，并取第一部分的内容，原因：存在连续空格的文本gettext之后只有一个空格导致xpth时定位不到元素
			listString.add(el.findElement(By.className("shizan-desc")).getText().split(" ")[0]);
		}
		return listString;
	}

}
