package com.coolwi.km.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class StartActivityTest061602 extends ActivityInstrumentationTestCase2 {
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
    public StartActivityTest061602() throws ClassNotFoundException {
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
		// Wait for activity: 'com.coolwi.km.activity.StartActivity'
		solo.waitForActivity("StartActivity", 2000);
		// Wait for activity: 'com.coolwi.km.activity.LoginActivity'
		assertTrue("LoginActivity is not found!", solo.waitForActivity("LoginActivity"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("et_phone"));
		// Enter the text: '15088132075'
		solo.clearEditText((android.widget.EditText) solo.getView("et_phone"));
		solo.enterText((android.widget.EditText) solo.getView("et_phone"), "15088132075");
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
		// Click on �ŵ����
		solo.clickOnView(solo.getView("radio0"));
		// Click on �ŵ���Ϣ
		solo.clickOnView(solo.getView("tv_mdxx"));
		// Wait for activity: 'com.coolwi.km.main.shopmanage.shop.ShopInfoActivity'
		assertTrue("ShopInfoActivity is not found!", solo.waitForActivity("ShopInfoActivity"));
		// Click on ȷ    ��
		solo.clickOnView(solo.getView("bt_ok"));
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on Ա������
		solo.clickOnView(solo.getView("tv_yggl"));
		// Wait for activity: 'com.coolwi.km.main.shopmanage.employs.EmpManageActivity'
		assertTrue("EmpManageActivity is not found!", solo.waitForActivity("EmpManageActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_jia"));
		// Wait for activity: 'com.coolwi.km.main.shopmanage.employs.EmpEditActivity'
		assertTrue("EmpEditActivity is not found!", solo.waitForActivity("EmpEditActivity"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("et_num"));
		// Enter the text: '222'
		solo.clearEditText((android.widget.EditText) solo.getView("et_num"));
		solo.enterText((android.widget.EditText) solo.getView("et_num"), "22");
		// Click on Empty Text View
		solo.clickOnView(solo.getView("et_name"));
		// Enter the text: 'Fhj'
		solo.clearEditText((android.widget.EditText) solo.getView("et_name"));
		solo.enterText((android.widget.EditText) solo.getView("et_name"), "hj");
		// Click on Empty Text View
		solo.clickOnView(solo.getView("et_phone"));
		// Enter the text: '15088132598'
		solo.clearEditText((android.widget.EditText) solo.getView("et_phone"));
		solo.enterText((android.widget.EditText) solo.getView("et_phone"), "15088132597");
		// Click on ��ɫ 
		solo.clickOnView(solo.getView("re_js"));
		// Wait for activity: 'com.coolwi.km.main.shopmanage.employs.EmpRoleActivity'
		assertTrue("EmpRoleActivity is not found!", solo.waitForActivity("EmpRoleActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_save"));
		// Click on Ȩ�� 
		solo.clickOnView(solo.getView("re_qx"));
		// Wait for activity: 'com.coolwi.km.main.shopmanage.employs.EmpAuthActivity'
		assertTrue("EmpAuthActivity is not found!", solo.waitForActivity("EmpAuthActivity"));
		// Click on ��ֵ
		solo.clickInList(2, 0);
		// Click on ����
		solo.clickInList(3, 0);
		// Click on �˿�
		solo.clickInList(4, 0);
		// Click on ���ֶһ�
		solo.clickInList(5, 0);
		// Click on  ��/�ο� ��֤
		solo.clickInList(6, 0);
		// Click on  ��/�ο� ����
		solo.clickInList(7, 0);
		// Click on ȡ������
		solo.clickInList(8, 0);
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_save"));
		// Click on ȷ    ��
		solo.clickOnView(solo.getView("bt_ok"));
		// Click on ɾ��
		solo.clickOnText(java.util.regex.Pattern.quote("ɾ��"), 2);
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on ȷ��
		solo.clickOnView(solo.getView("bt_confirm"));
		// Click on 1 �� 15088132075 ɾ��
		solo.clickInList(2, 0);
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_back"));
		// Wait for activity: 'com.coolwi.km.main.shopmanage.employs.EmpEditActivity'
		assertTrue("EmpEditActivity is not found!", solo.waitForActivity("EmpEditActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_back"));
		// Click on �ƹ�
		solo.clickOnView(solo.getView("radio1"));
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on ��б�
		solo.clickOnView(solo.getView("tv_hdlb"));
		// Wait for activity: 'com.coolwi.km.main.promotion.HDLBActivity'
		assertTrue("HDLBActivity is not found!", solo.waitForActivity("HDLBActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_lshd"));
		// Wait for activity: 'com.coolwi.km.main.promotion.HDLSActivity'
		assertTrue("HDLSActivity is not found!", solo.waitForActivity("HDLSActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_back"));
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_back"));
		// Set default small timeout to 12085 milliseconds
		Timeout.setSmallTimeout(12085);
		// Click on ��ֵ����
		solo.clickOnView(solo.getView("tv_czjl"));
		// Wait for activity: 'com.coolwi.km.main.promotion.CZJLActivity'
		assertTrue("CZJLActivity is not found!", solo.waitForActivity("CZJLActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_jia"));
		// Wait for activity: 'com.coolwi.km.main.promotion.XZHDActivity'
		assertTrue("XZHDActivity is not found!", solo.waitForActivity("XZHDActivity"));
		// Click on ��ʼ���� �������
		solo.clickOnView(solo.getView("lin_sdate"));
		// Wait for activity: 'com.coolwi.km.activity.CalendarActivity'
		assertTrue("CalendarActivity is not found!", solo.waitForActivity("CalendarActivity"));
		// Click on ȷ    ��
		solo.clickOnView(solo.getView("bt_ok"));
		// Click on �������� �������
		solo.clickOnView(solo.getView("lin_edate"));
		// Wait for activity: 'com.coolwi.km.activity.CalendarActivity'
		assertTrue("CalendarActivity is not found!", solo.waitForActivity("CalendarActivity"));
		// Click on 23 إ��
		solo.clickInList(27, 0);
		// Click on ȷ    ��
		solo.clickOnView(solo.getView("bt_ok"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("et_czje"));
		// Enter the text: '10'
		solo.clearEditText((android.widget.EditText) solo.getView("et_czje"));
		solo.enterText((android.widget.EditText) solo.getView("et_czje"), "100");
		// Click on Empty Text View
		solo.clickOnView(solo.getView("et_jlje"));
		// Enter the text: '2'
		solo.clearEditText((android.widget.EditText) solo.getView("et_jlje"));
		solo.enterText((android.widget.EditText) solo.getView("et_jlje"), "20");
		// Click on ȷ����ӻ
		solo.clickOnView(solo.getView("bt_ok"));
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on ȷ��
		solo.clickOnView(solo.getView("bt_confirm"));
		// Wait for activity: 'com.coolwi.km.main.promotion.XZHDFXActivity'
		assertTrue("XZHDFXActivity is not found!", solo.waitForActivity("XZHDFXActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_back"));
		// Wait for activity: 'com.coolwi.km.main.promotion.CZJLActivity'
		assertTrue("CZJLActivity is not found!", solo.waitForActivity("CZJLActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("iv_back"));
		// Click on ��Ա����
		solo.clickOnView(solo.getView("radio3"));
		// Click on ��Ա����
		solo.clickOnView(solo.getView("tv_hymd"));
		// Wait for activity: 'com.coolwi.km.main.members.HYMDActivity'
		assertTrue("HYMDActivity is not found!", solo.waitForActivity("HYMDActivity"));
		// Click on ImageView
		solo.clickOnView(solo.getView("ib_hb"));
		// Wait for activity: 'com.coolwi.km.main.members.HYHBActivity'
		assertTrue("HYHBActivity is not found!", solo.waitForActivity("HYHBActivity"));
		// Click on ��ʼ���� �������
		solo.clickOnView(solo.getView("lin_sdate"));
		// Wait for activity: 'com.coolwi.km.activity.CalendarActivity'
		assertTrue("CalendarActivity is not found!", solo.waitForActivity("CalendarActivity"));
		// Click on ȷ    ��
		solo.clickOnView(solo.getView("bt_ok"));
		// Click on �������� �������
		solo.clickOnView(solo.getView("lin_edate"));
		// Wait for activity: 'com.coolwi.km.activity.CalendarActivity'
		assertTrue("CalendarActivity is not found!", solo.waitForActivity("CalendarActivity"));
		// Click on 30 ����
		solo.clickInList(34, 0);
		// Click on ȷ    ��
		solo.clickOnView(solo.getView("bt_ok"));
		// Click on Empty Text View
		solo.clickOnView(solo.getView("et_dbxf"));
		// Enter the text: '100'
		solo.clearEditText((android.widget.EditText) solo.getView("et_dbxf"));
		solo.enterText((android.widget.EditText) solo.getView("et_dbxf"), "100");
		// Enter the text: '9.'
		solo.clearEditText((android.widget.EditText) solo.getView("et_zkq"));
		solo.enterText((android.widget.EditText) solo.getView("et_zkq"), "9.");
		// Enter the text: '9.'
		solo.clearEditText((android.widget.EditText) solo.getView("et_zkq"));
		solo.enterText((android.widget.EditText) solo.getView("et_zkq"), "9.");
		// Press next button
		solo.pressSoftKeyboardNextButton();
		// Click on ȷ    ��
		solo.clickOnView(solo.getView("bt_ok"));
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Click on ȷ��
		solo.clickOnView(solo.getView("bt_confirm"));
	}
	
	private void login(){
		
	}
}
