package com.coolwi.km.user.test;

import com.coolwi.km.user.taketest.mydemo;

import android.app.Activity;
import android.view.View;

public class myOperationFun extends mydemo {
	public myOperationFun() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int screenshotCounter = 0;
	
	
	public void autoScreenshot(){
		solo.sleep(1);
		String screenshotName = Thread.currentThread().getStackTrace()[3].getMethodName() + "_" + String.valueOf(screenshotCounter);
		solo.takeScreenshot(screenshotName);
		System.out.println(screenshotName);
	}
	

}
