package com.lzq.selenium.imoocTest.page;

import org.openqa.selenium.WebElement;

import com.lzq.selenium.imoocTest.base.DriverBase;
import com.lzq.selenium.imoocTest.util.getByLocator;

public class OrderPayPage extends BasePage{

	public OrderPayPage(DriverBase driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	/*
	 * 获取订单号
	 */
	public WebElement getOrderNumElement() throws Exception{
		return element(getByLocator.getLocator("orderText"));
	}
	/*
	 * 返回课程名称element
	 */
	public WebElement getOrderCourseNameElement() throws Exception{
		return nodeElement(getByLocator.getLocator("orderCourse"), getByLocator.getLocator("orderCourseNode"));
	}
	
	/*
	 * 返回支付宝element
	 */
	public WebElement getAlipayElement() throws Exception{
		return element(getByLocator.getLocator("alipay"));
	}
	/*
	 * 获取点击立即支付element
	 */
	public WebElement getOrderPayElement() throws Exception{
		return element(getByLocator.getLocator("orderPay"));
	}

}
