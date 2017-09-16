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


		//click on �ϼ���Ʒ
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_sjsp"));
		//click on �����Ʒ com.coolwi.km:id/ib_add
		solo.clickOnView(solo.getView("com.coolwi.km:id/ib_add"));
		//click on �����ƷͼƬcom.coolwi.km:id/iv_logo
		solo.clickOnView(solo.getView("com.coolwi.km:id/iv_logo"));
	    //click on ����
		solo.clickOnView(solo.getView("com.coolwi.km:id/bt_camear"));
		
		//click on ��Ʒ����
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_name"));
		// Enter the text: ��Ʒ����
		solo.clearEditText((android.widget.EditText) solo.getView("com.coolwi.km:id/et_name"));
		solo.enterText((android.widget.EditText) solo.getView("com.coolwi.km:id/et_name"), "��Ʒ����");
		
		//click on ������Ʒ����
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_spjs"));
		//?
		//click on ��Ʒ����
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_fs"));
		// Enter the text: ��Ʒ����
		solo.clearEditText((android.widget.EditText) solo.getView("com.coolwi.km:id/et_fs"));
		solo.enterText((android.widget.EditText) solo.getView("com.coolwi.km:id/et_fs"), "100");
		
		//click on ��Ʒ����
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_dj"));
		// Enter the text: ��Ʒ����
		solo.clearEditText((android.widget.EditText) solo.getView("com.coolwi.km:id/et_dj"));
		solo.enterText((android.widget.EditText) solo.getView("com.coolwi.km:id/et_dj"), "10");
		
		//click on �һ���ֹ����
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_yxq"));
		//?
		//click on�۸����
		solo.clickOnView(solo.getView("com.coolwi.km:id/checkBox"));
		//click on ��Ӽ۸����com.coolwi.km:id/ib_add
		solo.clickOnView(solo.getView("com.coolwi.km:id/ib_add"));
		//click on ��ʼ����
		solo.clickOnText("23");
		//click on ȷ��
		solo.clickOnView(solo.getView("com.coolwi.km:id/bt_ok"));
		//click on ��������
		solo.clickOnText("30");
		//click on ȷ��
		solo.clickOnView(solo.getView("com.coolwi.km:id/bt_ok"));
		//click on �ۿ�
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_jgzk"));
		// Enter the text: ��Ʒ����
		solo.clearEditText((android.widget.EditText) solo.getView("com.coolwi.km:id/et_jgzk"));
		solo.enterText((android.widget.EditText) solo.getView("com.coolwi.km:id/et_jgzk"), "9.9");
		//click on ����com.coolwi.km:id/bt_save
		solo.clickOnView(solo.getView("com.coolwi.km:id/bt_save"));
		
		//click on ȷ�������Ʒ
		solo.clickOnView(solo.getView("com.coolwi.km:id/bt_ok"));
		
		//click on����ײ�com.coolwi.km:id/radio1
		solo.clickOnView(solo.getView("com.coolwi.km:id/radio1"));
		//click on����ײ�com.coolwi.km:id/radio2
		solo.clickOnView(solo.getView("com.coolwi.km:id/radio2"));
   	}
   	
}