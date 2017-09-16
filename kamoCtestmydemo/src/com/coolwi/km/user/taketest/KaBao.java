package com.coolwi.km.user.taketest;


import java.util.ArrayList;

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
public class KaBao extends ActivityInstrumentationTestCase2 {
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
	public KaBao() throws Exception{
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
	
/*	测试用例 kamo-2427: 卡包列表刷新、加载 [版本 : 1]
	测试用例 kamo-2428: 添加卡片 [版本 : 1]		*/
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
	solo.clickOnView(solo.getView("main_rb_1"));//进入卡包
	
	solo.scrollDown();
	solo.scrollUp();
	//添加卡包
	solo.clickOnView(solo.getView("com.coolwi.km.user:id/cadr_title_iv"));
	solo.clickOnText("yyy(海岸城/保利)");
	//添加到卡包
	solo.waitForView(solo.getView("com.coolwi.km.user:id/point_text"));
	if ((solo.searchButton("添加到我的卡包"))) {
		solo.clickOnButton("添加到我的卡包");
	//	 assertTrue(solo.getString(R.string.scroll_text).toString().contains("道可道")); 
	} else {
		solo.clickOnView(solo.getView("com.coolwi.km.user:id/cardbag_shop_title_iv"));
	}
	
	//卡片分享
	//添加卡包
/*	solo.clickOnView(solo.getView("com.coolwi.km.user:id/cadr_title_iv"));
	 ArrayList<View> list = solo.getView("com.coolwi.km.user:id/cadr_title_iv");  
	 TextView tv;
     tv = (TextView)list.get(2);  */
  //   assertEquals("default text",tv.getText());  
	solo.clickOnText("yyy(海岸城/保利)");
	solo.waitForView(solo.getView("com.coolwi.km.user:id/point_text"));
	solo.clickOnView(solo.getView("com.coolwi.km.user:id/cardbag_shop_title_iv_r2"));//分享
	solo.takeScreenshot("卡包中门店详情分享");
	
	
	
	
	
	
	
	
	
	solo.clickOnView(solo.getView("id/main_rb_3"));//我的
	//solo.clickon
	//solo.clickOnRadioButton("main_rb_3");
	solo.sleep(10);
	solo.clickOnView(solo.getView("me_rb_kamo_tc"));
	solo.sleep(10);
}	


@Override
	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
		super.tearDown();
	}



}
