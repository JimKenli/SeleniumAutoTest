package com.lzq.selenium.imoocTest.business;

import com.lzq.selenium.imoocTest.base.DriverBase;
import com.lzq.selenium.imoocTest.handle.OrderPayPageHandle;

public class OrderPayPagePro {
	public DriverBase driver;
	public OrderPayPageHandle orderPayPageHandle;
	public OrderPayPagePro(DriverBase driver){
		this.driver = driver;
		orderPayPageHandle = new OrderPayPageHandle(driver);
	}
	
	/*
	 * 根据课程、订单判断跳转到支付页面
	 */
	public void orderPayPro() throws Exception{
		String orderName = orderPayPageHandle.getOrderName();
		String orderCourseName = orderPayPageHandle.getOrderCourseName();
		if(!orderName.equals(null)&& !orderCourseName.equals(null)){
			orderPayPageHandle.clickAliPay();
			orderPayPageHandle.clickPayElement();
		}
	}

}
