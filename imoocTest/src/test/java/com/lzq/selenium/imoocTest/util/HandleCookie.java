package com.lzq.selenium.imoocTest.util;



import java.util.Date;
import java.util.Set;

import org.openqa.selenium.Cookie;

import com.lzq.selenium.imoocTest.base.DriverBase;

public class HandleCookie {
	
	public DriverBase driver;
	public ProUtil proutil;
	public HandleCookie(DriverBase driver){
		this.driver = driver;
		proutil = new ProUtil("cookie.properties");
		
	}
	
	public void setCookie(){
		String value = proutil.getPro("apsid");
		String domain = ".imooc.com";
		//Cookie cookie = new Cookie("apsid", value,domain);
		//Date d1 = null;
		Cookie cookie = new Cookie("apsid", value, domain, "/", null);
		driver.setCookie(cookie);
		System.out.println("设置cookie成功");
	}
	/**
	 * 获取登录状态cookie
	 */
	public void writeLoginStatusCookie(){
		Set<Cookie> cookies = driver.getCookie();
		for(Cookie cookie:cookies){
			if(cookie.getName().equals("apsid")){
				proutil.writePro(cookie.getName(), cookie.getValue());
			}
		}
		
	}

}
