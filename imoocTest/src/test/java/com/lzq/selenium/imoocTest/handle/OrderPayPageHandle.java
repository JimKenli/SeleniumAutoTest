package com.lzq.selenium.imoocTest.handle;

import com.lzq.selenium.imoocTest.base.DriverBase;
import com.lzq.selenium.imoocTest.page.OrderPayPage;

public class OrderPayPageHandle {
	DriverBase driver;
	public OrderPayPage orderPayPage;
	public OrderPayPageHandle(DriverBase driver){
		this.driver = driver;
		orderPayPage = new OrderPayPage(driver);
	}
	
	/*
	 * 获取订单文字
	 */
	public String getOrderName() throws Exception{
		return orderPayPage.getText(orderPayPage.getOrderNumElement());
	}
	/*
	 * 获取课程名称
	 */
	public String getOrderCourseName() throws Exception{
		return orderPayPage.getText(orderPayPage.getOrderCourseNameElement());
	}
	/*
	 * 点击支付宝支付
	 */
	public void clickAliPay() throws Exception{
		orderPayPage.click(orderPayPage.getAlipayElement());
	}
	/*
	 * 点击立即支付
	 */
	public void clickPayElement() throws Exception{
		orderPayPage.click(orderPayPage.getOrderPayElement());
	}
	

}
