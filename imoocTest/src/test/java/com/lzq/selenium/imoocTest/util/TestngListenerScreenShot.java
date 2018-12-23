package com.lzq.selenium.imoocTest.util;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.lzq.selenium.imoocTest.baseDriver;

public class TestngListenerScreenShot extends TestListenerAdapter {
	  @Override
	  public void onTestFailure(ITestResult tr) {
		  super.onTestFailure(tr);
		  baseDriver b = (baseDriver) tr.getInstance();
		  //System.out.println(b.toString());
		  //System.out.println(b.getClass());
		  b.takeScreenShot();

	  }
	

}
