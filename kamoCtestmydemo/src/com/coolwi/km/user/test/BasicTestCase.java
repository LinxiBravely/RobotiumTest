package com.coolwi.km.user.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

public class BasicTestCase extends ActivityInstrumentationTestCase2  {
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
	public BasicTestCase() throws Exception{
		super(launchActiviClass);
	}
	public Solo solo;
	public UIHelper uiHelper=null;


	

	public void init() {
		// TODO Auto-generated method stub
		solo=new Solo(getInstrumentation(),getActivity());
		uiHelper=new UIHelper(solo);
		
		
	}

}
