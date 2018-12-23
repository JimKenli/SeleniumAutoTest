package com.lzq.selenium.imoocTest.business;

import com.lzq.selenium.imoocTest.base.DriverBase;
import com.lzq.selenium.imoocTest.handle.LoginPageHandle;

public class LoginPro {
	public LoginPageHandle lph;
	public LoginPro(DriverBase driver){
		lph = new LoginPageHandle(driver);
	}
	
	public void login(String username, String password) throws Exception{
		if(lph.assertLoginPage()){
			lph.sendKeysUser(username);
			lph.sendKeysPassword(password);
			lph.clickAutoSigninButton();
			lph.clickLoginButton();
		}else{
			System.out.println("页面不存在或者状态不正确");
		}
		
	}

}
