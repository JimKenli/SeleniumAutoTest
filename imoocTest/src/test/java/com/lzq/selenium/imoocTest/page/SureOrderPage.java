package com.lzq.selenium.imoocTest.page;


import org.openqa.selenium.WebElement;

import com.lzq.selenium.imoocTest.base.DriverBase;
import com.lzq.selenium.imoocTest.util.getByLocator;

public class SureOrderPage extends BasePage{
	public DriverBase driver;
	public SureOrderPage(DriverBase driver) {
		super(driver);
		this.driver = driver;
	}
	
	/*
	 * 定位提交订单按钮
	 */
	public WebElement getSubmitOrderButtonElement() throws Exception {
		return element(getByLocator.getLocator("submitOrder"));
	}

}
