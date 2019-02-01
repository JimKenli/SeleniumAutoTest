package com.lzq.selenium.imoocTest.business;

import com.lzq.selenium.imoocTest.base.DriverBase;
import com.lzq.selenium.imoocTest.handle.SureOrderHandle;

public class SureOrderPagePro {
	DriverBase driver;
	SureOrderHandle sureOrderHandle;
	public SureOrderPagePro(DriverBase driver){
		this.driver = driver;
		sureOrderHandle = new SureOrderHandle(driver);
	}
	
	/*
	 * 提交订单
	 */
	public void sureOrder() throws Exception{
		sureOrderHandle.clickSureOrderButton();
	}

}
