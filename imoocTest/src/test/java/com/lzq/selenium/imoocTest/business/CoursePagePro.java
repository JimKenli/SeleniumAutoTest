package com.lzq.selenium.imoocTest.business;

import com.lzq.selenium.imoocTest.base.DriverBase;
import com.lzq.selenium.imoocTest.handle.CoursePageHandle;

public class CoursePagePro {
	public DriverBase driver;
	public CoursePageHandle coursePageHandle;
	public CoursePagePro(DriverBase driver){
		this.driver = driver;
		coursePageHandle = new CoursePageHandle(this.driver);
	}
	/*
	 * 添加购物车
	 */
	public void addCart()throws Exception{
		int beforeNum;
		int afterNum;
		String courseNum = coursePageHandle.getShopCartNum();
		String afterCourseNum;
		try{
			beforeNum = Integer.valueOf(courseNum);
			System.out.println("beforeNum:"+beforeNum);
		}catch(Exception e){
			beforeNum = 0;
		}
		coursePageHandle.clickAddCart();
		afterCourseNum = coursePageHandle.getShopCartNum();
		try{
			afterNum = Integer.valueOf(afterCourseNum);
			System.out.println("afterNum:"+ afterNum);
		}catch(Exception e){
			afterNum = -1;
			System.out.println("添加后获取购物车数量异常");
		}
		Thread.sleep(3000);
		if (afterNum == beforeNum + 1){
			System.out.println("添加购物车成功");
		}else{
			System.out.println("添加购物车失败");
		}
	}

}