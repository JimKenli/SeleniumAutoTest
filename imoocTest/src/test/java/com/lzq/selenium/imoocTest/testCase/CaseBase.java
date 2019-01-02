package com.lzq.selenium.imoocTest.testCase;

import com.lzq.selenium.imoocTest.base.DriverBase;

public class CaseBase {
	public DriverBase initDriver(String browser){
		DriverBase driver = new DriverBase(browser);
		return driver;
	}

} 
