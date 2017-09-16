package com.coolwi.km.user.taketest;

import com.robotium.solo.Solo;

import android.R.string;
import android.app.LauncherActivity;
import android.provider.Settings.System;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
@SuppressWarnings("rawtypes")
public class mydemo extends ActivityInstrumentationTestCase2 {
	private static final String  LAUNCHER_ACTIVITY_FULL_CLASSNAME="com.coolwi.km.user.activity.SplashActivity";
	@SuppressWarnings("unused")
	private static Class<?> launchActiviClass;
	static{
		try {
			launchActiviClass=Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);// TODO: handle exception
		}
	}
	
	@SuppressWarnings("unchecked")
	public mydemo() throws Exception{
		super(launchActiviClass);
	}
/*
	@SuppressWarnings("unchecked")
	public mydemo(Class activityClass) throws Exception {	
		super(activityClass);
		// TODO Auto-generated constructor stub
	}
*/
	protected Solo solo;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(),getActivity());
		
	}
/*	测试用例 kamo-2409: 使用账号成功登录 [版本 : 1]
	测试用例 kamo-2411: 退出账号 [版本 : 1]*/
public void testlogin() {
	//手机号登录
	if (solo.searchEditText("请输入手机号")) {
		solo.clearEditText((EditText)solo.getView ("login_num"));//清除输入的值
		solo.enterText((EditText)solo.getView("login_num"), "15088132074");
		solo.clickOnView((LinearLayout)solo.getView("delete_num"));
		solo.enterText((EditText)solo.getView("login_num"), "15088132074");
		solo.clearEditText((EditText)solo.getView ("note"));
		solo.clickOnView((TextView)solo.getView("gain_note"));
		solo.enterText((EditText)solo.getView("note"), "159753");
		solo.clickOnButton("登    录");
		solo.takeScreenshot("testlogin");
		solo.sleep(6000);
		
		//System.out.println("登录成功");
/*		solo.clickOnCheckBox(0);
		solo.clickOnCheckBox(0);
*/
		solo.takeScreenshot("1");	
		java.lang.System.out.print("登录成功");
	} else {
		java.lang.System.out.print("已登录");
	}
	//退出
	solo.clickOnView(solo.getView("id/main_rb_3"));
	//solo.clickon
	//solo.clickOnRadioButton("main_rb_3");
	solo.sleep(10);
	solo.clickOnView(solo.getView("me_rb_kamo_tc"));
	solo.sleep(10);
	
	//微信登录
	solo.clickOnView((LinearLayout)solo.getView("login_ll_wexin"));
	//solo.clickOnView((LinearLayout)solo。getView("login_ll_wexin"));
	solo.sleep(6000);
	solo.takeScreenshot("");
}	

@Override
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
		super.tearDown();
	}
}
