package com.lzq.selenium.imoocTest.testCase;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.lzq.selenium.imoocTest.base.DriverBase;
import com.lzq.selenium.imoocTest.business.CoursePagePro;
import com.lzq.selenium.imoocTest.business.LoginPro;
import com.lzq.selenium.imoocTest.business.OrderPayPagePro;
import com.lzq.selenium.imoocTest.business.SureOrderPagePro;
import com.lzq.selenium.imoocTest.util.SendEmail;
import com.lzq.selenium.imoocTest.util.getByLocator;

public class Login extends CaseBase{
	public DriverBase driver;
	public LoginPro loginpro;
	public CoursePagePro cpp;
	public SureOrderPagePro sopp;
	public OrderPayPagePro oppp;
	static Logger logger = Logger.getLogger(Login.class);
	public Login(){
		this.driver = initDriver("chrome");
		loginpro = new LoginPro(driver);
		cpp = new CoursePagePro(driver);
		sopp = new SureOrderPagePro(driver);
		oppp = new OrderPayPagePro(driver);
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
		logger.debug("第一次使用log4j打印日志");
		loginpro.login("495534487@qq.com", "2179mkw");
		Thread.sleep(3000);
		driver.get("https://coding.imooc.com/class/203.html");
		Thread.sleep(3000);
	}
	/*
	 * 添加购物车
	 */
//	@Test(dependsOnMethods={"testLogin"})
//	public void TestAddCart() throws Exception{
//		cpp.addCart();
//	}
	/*
	 * 立即购买
	 */
	@Test(dependsOnMethods={"testLogin"})
	public void testBuyNow() throws Exception{
		cpp.buyNow();
	}
	/*
	 * 提交订单
	 */
	@Test(dependsOnMethods={"testBuyNow"})
	public void testSureOrder() throws Exception{
		sopp.sureOrder();
		Thread.sleep(3000);
	}
	/*
	 * 跳转支付页面
	 */
	@Test(dependsOnMethods={"testSureOrder"})
	public void TestGoPay() throws Exception{
		oppp.orderPayPro();
		SendEmail.sendToEmail("跑完了");
	}
	
	
	
	
	
	
	
	/*
	 * 下单流程
	 */
//	@Test(dependsOnMethods={"testLogin"})
//	public void downOrder() throws Exception{
//		driver.get("https://coding.imooc.com/class/106.html");
//		String currentText = this.buyCourseNow();
//		System.out.println("当前课程信息："+currentText);
//		this.sureOrder();
//		this.getOrder();
//		String orderCourseText = this.getOrderCourse();
//		System.out.println("订单页面课程信息："+orderCourseText);
//		if(currentText.equals(orderCourseText) ){
//			System.out.println("下单成功");
//		}
//		
//	}
	
	
	
	
	/*
	 * 下单流程
	 */
//	@Test(dependsOnMethods={"testLogin"})
//	public void buyCourse(){ 
//		driver.get("https://coding.imooc.com/class/105.html");
//		String courseDetail = driver.findElement(By.className("path")).findElement(By.tagName("span")).getText();
//		driver.findElement(By.id("buy-trigger")).click();
//		driver.findElement(By.linkText("提交订单")).click();
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		String orderText = driver.findElement(By.className("order")).getText();
//		if(orderText !=null){
//			String orderString = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/ul/li/div[1]/dl/a/dt")).getText();
//			Assert.assertEquals(courseDetail, orderString,"购买的商品信息不一样");
//		}
//	}
	
//	public WebElement getElement(By by){
//		return driver.findElement(by);
//	}
//	/*
//	 * 获取父节点的子节点元素
//	 */
//	public WebElement getElement(WebElement element, By by){
//		return element.findElement(by);
//	}
//	
//	/*
//	 * 获取课程信息
//	 */
//	public String getCourseText(WebElement element){
//		return element.getText();
//	}
//	/*
//	 * 立即购买，然后返回课程信息
//	 */
//	public String buyCourseNow() throws Exception{
//		WebElement element = this.getElement(getByLocator.getLocator("courseInfo"));
//		WebElement elementText = this.getElement(element, getByLocator.getLocator("courseInfoText"));
//		String currentText = this.getCourseText(elementText);
//		driver.click(this.getElement(getByLocator.getLocator("buyNow")));
//		return currentText;
//	}
//	
//	/*
//	 * 点击确认订单
//	 */
//	public void sureOrder() throws Exception{
//		driver.click(this.getElement(getByLocator.getLocator("sureOrder")));	
//	}
//	/*
//	 * 获取订单号
//	 */
//	public String getOrder() throws Exception{
//		 Thread.sleep(3000);
//		 String orderText = this.getCourseText(this.getElement(getByLocator.getLocator("order")));
//		 return orderText;
//	}
//	
//	/*
//	 * 获取支付中心商品信息
//	 */
//	public String getOrderCourse() throws Exception{
//		WebElement element = this.getElement(this.getElement(getByLocator.getLocator("orderCourse")), getByLocator.getLocator("orderCourseNode"));
//		return this.getCourseText(element);
//	}
}
