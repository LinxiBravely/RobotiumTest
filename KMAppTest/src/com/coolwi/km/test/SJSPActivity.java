package com.coolwi.km.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

@SuppressWarnings("rawtypes")
public class SJSPActivity extends ActivityInstrumentationTestCase2 {
  	private Solo solo;
  	
  	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.coolwi.km.activity.StartActivity";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
        }
    }
  	
  	@SuppressWarnings("unchecked")
    public SJSPActivity() throws ClassNotFoundException {
        super(launcherActivityClass);
    }

  	public void setUp() throws Exception {
        super.setUp();
		solo = new Solo(getInstrumentation());
		getActivity();
  	}
  
   	@Override
   	public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
  	}
   	
   	public void test(){


		//click on 上架商品
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_sjsp"));
		//click on 添加商品 com.coolwi.km:id/ib_add
		solo.clickOnView(solo.getView("com.coolwi.km:id/ib_add"));
		//click on 添加商品图片com.coolwi.km:id/iv_logo
		solo.clickOnView(solo.getView("com.coolwi.km:id/iv_logo"));
	    //click on 拍照
		solo.clickOnView(solo.getView("com.coolwi.km:id/bt_camear"));
		
		//click on 商品名称
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_name"));
		// Enter the text: 单品名称
		solo.clearEditText((android.widget.EditText) solo.getView("com.coolwi.km:id/et_name"));
		solo.enterText((android.widget.EditText) solo.getView("com.coolwi.km:id/et_name"), "单品名称");
		
		//click on 进入商品描述
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_spjs"));
		//?
		//click on 商品份数
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_fs"));
		// Enter the text: 商品份数
		solo.clearEditText((android.widget.EditText) solo.getView("com.coolwi.km:id/et_fs"));
		solo.enterText((android.widget.EditText) solo.getView("com.coolwi.km:id/et_fs"), "100");
		
		//click on 商品单价
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_dj"));
		// Enter the text: 商品份数
		solo.clearEditText((android.widget.EditText) solo.getView("com.coolwi.km:id/et_dj"));
		solo.enterText((android.widget.EditText) solo.getView("com.coolwi.km:id/et_dj"), "10");
		
		//click on 兑换截止日期
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_yxq"));
		//?
		//click on价格管理
		solo.clickOnView(solo.getView("com.coolwi.km:id/checkBox"));
		//click on 添加价格管理com.coolwi.km:id/ib_add
		solo.clickOnView(solo.getView("com.coolwi.km:id/ib_add"));
		//click on 起始日期
		solo.clickOnText("23");
		//click on 确定
		solo.clickOnView(solo.getView("com.coolwi.km:id/bt_ok"));
		//click on 结束日期
		solo.clickOnText("30");
		//click on 确定
		solo.clickOnView(solo.getView("com.coolwi.km:id/bt_ok"));
		//click on 折扣
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_jgzk"));
		// Enter the text: 商品份数
		solo.clearEditText((android.widget.EditText) solo.getView("com.coolwi.km:id/et_jgzk"));
		solo.enterText((android.widget.EditText) solo.getView("com.coolwi.km:id/et_jgzk"), "9.9");
		//click on 保存com.coolwi.km:id/bt_save
		solo.clickOnView(solo.getView("com.coolwi.km:id/bt_save"));
		
		//click on 确定添加商品
		solo.clickOnView(solo.getView("com.coolwi.km:id/bt_ok"));
		
		//click on组合套餐com.coolwi.km:id/radio1
		solo.clickOnView(solo.getView("com.coolwi.km:id/radio1"));
		//click on组合套餐com.coolwi.km:id/radio2
		solo.clickOnView(solo.getView("com.coolwi.km:id/radio2"));
   	}
   	
}