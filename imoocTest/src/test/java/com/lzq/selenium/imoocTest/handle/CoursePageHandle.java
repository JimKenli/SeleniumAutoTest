package com.lzq.selenium.imoocTest.handle;


import com.lzq.selenium.imoocTest.base.DriverBase;
import com.lzq.selenium.imoocTest.page.CoursePage;

public class CoursePageHandle {
	public DriverBase driver;
	public CoursePage coursePage;
	public CoursePageHandle(DriverBase driver){
		this.driver = driver;
		coursePage = new CoursePage(this.driver);
	}
	/*
	 * 点击立即购买按钮
	 */
	public void clickBuyNow() throws Exception{
		coursePage.click(coursePage.getBuyTriggerElement());
	}
	/*
	 * 点击添加购物车按钮
	 */
	public void clickAddCart() throws Exception{
		coursePage.click(coursePage.getAddCartElement());
	}
	/*
	 * 点击右上角购物车
	 */
	public void clickShopCart() throws Exception{
		coursePage.click(coursePage.getShopCartElement());
	}
	/*
	 * 获取购物车数量
	 */
	public String getShopCartNum() throws Exception{
		return coursePage.getText(coursePage.getShopCarNumElement());
	}
	/*
	 * 获取课程名称
	 */
	public String getCourseName() throws Exception{
		return coursePage.getText(coursePage.getCourseNameElement());
	}
	/*
	 * 点击已经购买弹窗的确定按钮
	 */
	public void clickReadyBuy() throws Exception{
		coursePage.click(coursePage.getReadyBuy());
	}

}
