/*
 @����ģ�飺�����˺Ź���
 @*/
package com.coolwi.km.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class SHSCListActivity extends ActivityInstrumentationTestCase2 {
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
    public SHSCListActivity() throws ClassNotFoundException {
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
  
	public void testRun() {
		// Take screenshot
		solo.takeScreenshot();
		// Wait for activity: 'com.coolwi.km.activity.StartActivity'
		solo.waitForActivity("StartActivity", 2000);
		
		// Wait for activity: 'com.coolwi.km.activity.LoginActivity'
		assertTrue("LoginActivity is not found!", solo.waitForActivity("LoginActivity"));
		// Enter the text: '15088132075'
		solo.clearEditText((android.widget.EditText) solo.getView("et_phone"));
		solo.enterText((android.widget.EditText) solo.getView("et_phone"), "13590404631");
		// Click on Empty Text View
		solo.clickOnView(solo.getView("et_pwd"));
		// Enter the text: '123456ab'
		solo.clearEditText((android.widget.EditText) solo.getView("et_pwd"));
		solo.enterText((android.widget.EditText) solo.getView("et_pwd"), "123456ab");
		// Click on ��    ¼
		solo.clickOnView(solo.getView("bt_ok"));
		// Wait for activity: 'com.coolwi.km.main.MainActivity'
		assertTrue("MainActivity is not found!", solo.waitForActivity("MainActivity"));
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Set default small timeout to 10377 milliseconds
		Timeout.setSmallTimeout(10377);
		// Click on �˺Ź���
		solo.clickOnView(solo.getView("radio4"));
		//�̻��̳ǹ������
		// Click on �̻��̳�
		solo.clickOnView(solo.getView("tv_shsc"));
		// Wait for activity: 'com.coolwi.km.main.account.shopping.SHSCListActivity'
		assertTrue("SHSCListActivity is not found!", solo.waitForActivity("SHSCListActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_ddjl"));
		// Wait for activity: 'com.coolwi.km.main.account.shopping.SHSCMyOrderActivity'
		assertTrue("SHSCMyOrderActivity is not found!", solo.waitForActivity("SHSCMyOrderActivity"));
		// Scroll to ImageView
		android.widget.ListView listView0 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 0);
		solo.scrollListToLine(listView0, 0);
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_back"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("et_search"));
		// Enter the text: '��Ī'
		solo.clearEditText((android.widget.EditText) solo.getView("et_search"));
		solo.enterText((android.widget.EditText) solo.getView("et_search"), "��Ī");
		// Take screenshot
		solo.takeScreenshot();
		// Click on ��Ī
		solo.clickOnView(solo.getView("et_search"));
		// Press search button
		solo.pressSoftKeyboardSearchButton();
		// Set default small timeout to 12368 milliseconds
		Timeout.setSmallTimeout(12368);
		// Click on ��������
		solo.clickOnView(solo.getView("bt_pay"));
		// Wait for activity: 'com.coolwi.km.main.account.shopping.SHSCWebActivity'
		assertTrue("SHSCWebActivity is not found!", solo.waitForActivity("SHSCWebActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_back"));
		// Take screenshot
		solo.takeScreenshot();
		// Take screenshot
		solo.takeScreenshot();
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_back"));
/*		
		// Wait for activity: 'com.coolwi.km.activity.WebAppActivity'
		assertTrue("WebAppActivity is not found!", solo.waitForActivity("WebAppActivity"));*/
		// Click on �̻�Э��
		solo.clickOnView(solo.getView("tv_mdxy"));
		// Take screenshot
		solo.takeScreenshot();
		// Wait for activity: 'com.coolwi.km.activity.WebAppActivity'
		assertTrue("WebAppActivity is not found!", solo.waitForActivity("WebAppActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_back"));
/*		// Click on ��֤��Ϣ
		solo.clickOnView(solo.getView("tv_rzxx"));
		// Wait for activity: 'com.coolwi.km.main.account.ZZRZActivity'
		assertTrue("ZZRZActivity is not found!", solo.waitForActivity("ZZRZActivity"));*/
		// Click on ��֤��Ϣ
		solo.clickOnView(solo.getView("tv_rzxx"));
		// Wait for activity: 'com.coolwi.km.main.account.ZZRZActivity'
		assertTrue("ZZRZActivity is not found!", solo.waitForActivity("ZZRZActivity"));
		// Take screenshot
		solo.takeScreenshot();
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_back"));
		// Click on ϵͳ����
		solo.clickOnView(solo.getView("tv_xtsz"));

		// Take screenshot
		solo.takeScreenshot();
		// Wait for activity: 'com.coolwi.km.main.account.XTSZActivity'
		assertTrue("XTSZActivity is not found!", solo.waitForActivity("XTSZActivity"));
		// Click on �޸�����
		solo.clickOnView(solo.getView("rela_xgmm"));
		// Wait for activity: 'com.coolwi.km.main.account.UpdatePwdActivity'
		assertTrue("UpdatePwdActivity is not found!", solo.waitForActivity("UpdatePwdActivity"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("et_yzm"));
		// Enter the text: '159753'
		solo.clearEditText((android.widget.EditText) solo.getView("et_yzm"));
		solo.enterText((android.widget.EditText) solo.getView("et_yzm"), "159753");
		// Click on Empty Text View
		solo.clickOnView(solo.getView("et_pwd"));
		// Enter the text: '123456ab'
		solo.clearEditText((android.widget.EditText) solo.getView("et_pwd"));
		solo.enterText((android.widget.EditText) solo.getView("et_pwd"), "123456ab");
		// Click on Empty Text View
		solo.clickOnView(solo.getView("et_confirm_pwd"));
		// Enter the text: '123456ab'
		solo.clearEditText((android.widget.EditText) solo.getView("et_confirm_pwd"));
		solo.enterText((android.widget.EditText) solo.getView("et_confirm_pwd"), "123456ab");
		// Click on ȷ    ��
		solo.clickOnView(solo.getView("bt_ok"));
		// Click on �������
		solo.clickOnView(solo.getView("rela_yjfk"));
		// Wait for activity: 'com.coolwi.km.main.account.FeedBackActivity'
		assertTrue("FeedBackActivity is not found!", solo.waitForActivity("FeedBackActivity"));
		// Take screenshot
		solo.takeScreenshot();
/*		// Click on Empty Text View
		solo.clickOnView(solo.getView("et_content"));*/
		// Click on Empty Text View
		solo.clickOnView(solo.getView("et_content"));
		// Enter the text: 'Gyg'
		solo.clearEditText((android.widget.EditText) solo.getView("et_content"));
		solo.enterText((android.widget.EditText) solo.getView("et_content"), "Gyg");
		// Click on ��    ��
		solo.clickOnView(solo.getView("bt_submit"));
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_back"));
		// Click on ʹ�ð���
		solo.clickOnView(solo.getView("tv_help"));
		// Wait for activity: 'com.coolwi.km.activity.WebAppActivity'
		assertTrue("WebAppActivity is not found!", solo.waitForActivity("WebAppActivity"));
/*		// Wait for activity: 'com.coolwi.km.activity.WebAppActivity'
		assertTrue("WebAppActivity is not found!", solo.waitForActivity("WebAppActivity"));*/
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_back"));
		// Click on �˻���ֵ
		solo.clickOnView(solo.getView("tv_zhcz"));
		// Wait for activity: 'com.coolwi.km.main.account.ZHCZActivity'
		assertTrue("ZHCZActivity is not found!", solo.waitForActivity("ZHCZActivity"));
		// Click on 100Ԫ
		solo.clickOnView(solo.getView("bt1"));
		// Enter the text: '100'
		solo.clearEditText((android.widget.EditText) solo.getView("et_amount"));
		solo.enterText((android.widget.EditText) solo.getView("et_amount"), "100");
		// Click on ImageView
		solo.clickOnView(solo.getView("ib_czjl"));
		// Wait for activity: 'com.coolwi.km.activity.WebAppActivity'
		assertTrue("WebAppActivity is not found!", solo.waitForActivity("WebAppActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_back"));
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_back"));
		// Click on �½��˵�
		solo.clickOnView(solo.getView("tv_yjzd"));
		// Take screenshot
		solo.takeScreenshot();
		// Wait for activity: 'com.coolwi.km.main.account.YJZDActivity'
		assertTrue("YJZDActivity is not found!", solo.waitForActivity("YJZDActivity"));
		
		// Scroll to ImageView
		android.widget.ListView listView1 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 0);
		solo.scrollListToLine(listView1, 0);
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_back"));
		// Click on ���ڿ�Ī
		solo.clickOnView(solo.getView("tv_about"));
		// Wait for activity: 'com.coolwi.km.main.account.AboutActivity'
		assertTrue("AboutActivity is not found!", solo.waitForActivity("AboutActivity"));
		// Click on �°汾��� ��ǰ�汾��:2.5.16-T �������°�
		solo.clickOnView(solo.getView("re_check"));
		// Click on ��ϵ���� 
		solo.clickOnView(solo.getView("re_lxwm"));
		// Wait for activity: 'com.coolwi.km.main.account.RZTSActivity'
		assertTrue("RZTSActivity is not found!", solo.waitForActivity("RZTSActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_back"));
		// Click on �����ά������� �����ά����������
		solo.clickOnView(solo.getView("re_code"));
		// Wait for activity: 'com.mob.tools.MobUIShell'
		assertTrue("MobUIShell is not found!", solo.waitForActivity("MobUIShell"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView(android.widget.TextView.class, 0));
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_back"));
		// Click on ϵͳ����
		solo.clickOnView(solo.getView("tv_xtsz"));
		// Wait for activity: 'com.coolwi.km.main.account.XTSZActivity'
		assertTrue("XTSZActivity is not found!", solo.waitForActivity("XTSZActivity"));
		// Click on �˳���¼
		solo.clickOnView(solo.getView("rela_tcdl"));
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on ȷ��
		solo.clickOnView(solo.getView("bt_confirm"));
		// Wait for activity: 'com.coolwi.km.activity.LoginActivity'
		assertTrue("LoginActivity is not found!", solo.waitForActivity("LoginActivity"));
	}
}
