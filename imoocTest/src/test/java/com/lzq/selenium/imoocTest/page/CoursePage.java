package com.lzq.selenium.imoocTest.page;

import org.openqa.selenium.WebElement;

import com.lzq.selenium.imoocTest.base.DriverBase;
import com.lzq.selenium.imoocTest.util.getByLocator;

public class CoursePage extends BasePage{

	public CoursePage(DriverBase driver) {
		super(driver);
	}
	
	/*
	 * 获取立即购买按钮element
	 */
	public WebElement getBuyTriggerElement() throws Exception{
		return element(getByLocator.getLocator("buyNow"));
	}
	/*
	 * 获取添加购物车element
	 */
	public WebElement getAddCartElement() throws Exception{
		return element(getByLocator.getLocator("addCart"));
	}
	/*
	 * 获取右上角购物车element
	 */
	public WebElement getShopCartElement() throws Exception{
		return element(getByLocator.getLocator("shopCart"));
	}
	/*
	 * 获取购物车数量element
	 */
	public WebElement getShopCarNumElement() throws Exception{
		return element(getByLocator.getLocator("cartNum"));
	}
	/*
	 * 获取课程详情页面左上角课程名element
	 */
	public WebElement getCourseNameElement() throws Exception{
		return nodeElement(getByLocator.getLocator("courseInfo"),getByLocator.getLocator("courseInfoText"));
	}
	/*
	 * 通过子父节点定位已购买弹窗确定按钮
	 */
	public WebElement getAlreadyBuy() throws Exception{
		return nodeElement(getByLocator.getLocator("alreadyBuySure"), getByLocator.getLocator("alreadyBuySureNode"));
	}
	

}
