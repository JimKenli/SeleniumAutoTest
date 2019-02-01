package com.lzq.selenium.imoocTest.handle;

import com.lzq.selenium.imoocTest.base.DriverBase;
import com.lzq.selenium.imoocTest.page.SureOrderPage;

public class SureOrderHandle {
	DriverBase driver;
	SureOrderPage sureOrderPage;
	public SureOrderHandle(DriverBase driver){
		this.driver = driver;
		sureOrderPage = new SureOrderPage(driver);
	}
	
	/*
	 * 点击确认订单按钮
	 */
	public void clickSureOrderButton() throws Exception{
		sureOrderPage.click(sureOrderPage.getSubmitOrderButtonElement());
	}

}
