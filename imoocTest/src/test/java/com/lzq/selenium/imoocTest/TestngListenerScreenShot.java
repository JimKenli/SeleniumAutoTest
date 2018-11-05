package com.lzq.selenium.imoocTest;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

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
