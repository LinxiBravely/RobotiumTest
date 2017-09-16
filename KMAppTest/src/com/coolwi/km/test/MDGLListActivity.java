/*       

 */


/*

 @����ģ�飺�����˺Ź���
 @*/

package com.coolwi.km.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class MDGLListActivity extends ActivityInstrumentationTestCase2 {
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
    public MDGLListActivity() throws ClassNotFoundException {
        super(launcherActivityClass);
    }
	@Override
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
		// Wait for activity: 'com.coolwi.km.main.MainActivity's
		assertTrue("MainActivity is not found!", solo.waitForActivity("MainActivity"));
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Set default small timeout to 10377 milliseconds
		Timeout.setSmallTimeout(10377);
       //click on �ŵ���� radio0
		solo.clickOnView(solo.getView("radio0"));
		//assertEquals("MainActivity is not found", solo.waitForActivity("MainActivity"));
		//solo.waitForDialogToOpen(5000);
		//click on �ŵ���Ϣ
		solo.clickOnView(solo.getView("tv_mdxx"));
		//assertEquals("ShopInfoActivity is not found", solo.waitForActivity("ShopInfoActivity"));
		solo.takeScreenshot();
		
		//click on Ӫҵʱ�䣬�޸�Ӫҵʱ��
		solo.clickOnView(solo.getView("tv_time"));
		//click on ����
		solo.clickOnView(solo.getView("iv_save"));
		//click on Ӫҵʱ�䣬�޸�Ӫҵʱ��
		solo.clickOnView(solo.getView("tv_time"));
		//click on ����
		solo.clickOnView(solo.getView("iv_back"));
		//assertEquals("ShopEditTimeActivity is not found", solo.waitForActivity("ShopEditTimeActivity"));
	  //click on �ŵ�绰���޸��ŵ�绰
		solo.clickOnView(solo.getView("tv_phone"));
		//assertEquals("ShopEditTimeActivity is not found", solo.waitForActivity("ShopEditTimeActivity"));
		//click on ��������
		solo.clickOnView(solo.getView("et_zjhm"));
		// Enter the text: '07508022333'
		solo.clearEditText((android.widget.EditText) solo.getView("et_zjhm"));
		solo.enterText((android.widget.EditText) solo.getView("et_zjhm"), "07508022333");
		//click on �ֻ�����
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_phone"));
		// Enter the text: '15088132074'
		solo.clearEditText((android.widget.EditText) solo.getView("et_phone"));
		solo.enterText((android.widget.EditText) solo.getView("et_phone"), "15088132074");
		solo.takeScreenshot();
		//click on ��
		solo.clickOnView(solo.getView("iv_save"));
	
		//click on �ŵ��ַ���޸��ŵ��ַ
		solo.clickOnView(solo.getView("tv_address"));
		//assertEquals("ShopEditTimeActivity is not found", solo.waitForActivity("ShopEditTimeActivity"));
		solo.takeScreenshot();
		//click on ����
		solo.clickOnView(solo.getView("com.coolwi.km:id/iv_back"));
		//click on �ŵ���ܣ��޸��ŵ����
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_mdjs"));
		//Enter the text 
		solo.clearEditText((android.widget.EditText)solo.getView("et_mdjs"));
		solo.enterText((android.widget.EditText)solo.getView("et_mdjs"), "text");
	    //click on ����
		solo.clickOnView(solo.getView("iv_save"));
		//click on �ŵ���ܣ�����
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_mdjs"));
		solo.clickOnView(solo.getView("com.coolwi.km:id/iv_back"));
		//click on ֧���˿����޸�֧���˿�
		solo.clickOnView(solo.getView("com.coolwi.km:id/slipButton"));
		//ȷ���޸� �ŵ���Ϣ
		solo.clickOnView(solo.getView("bt_ok"));
		
		//click on Ա������  
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_yggl"));
		//assertEquals("EmpManageActivity is not found", solo.waitForActivity("EmpManageActivity"));
		//click on ����Ա��
		solo.clickOnView(solo.getView("com.coolwi.km:id/iv_jia"));
		//assertEquals("EmpEditActivity is not found", solo.waitForActivity("EmpEditActivity"));
		//click on ����
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_num"));
		// Enter the text: '15088132074'
		solo.clearEditText((android.widget.EditText) solo.getView("et_num"));
		solo.enterText((android.widget.EditText) solo.getView("et_num"), "001");
		//click on ����
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_name"));
		// Enter the text: '������'
		solo.clearEditText((android.widget.EditText) solo.getView("et_name"));
		solo.enterText((android.widget.EditText) solo.getView("et_name"), "������");
		//click on �ֻ�
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_phone"));
		// Enter the text: '15088132074'
		solo.clearEditText((android.widget.EditText) solo.getView("com.coolwi.km:id/et_phone"));
		solo.enterText((android.widget.EditText) solo.getView("com.coolwi.km:id/et_phone"), "15866412536");
		//click on ��ɫ
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_js"));
		// click on ����Ա  com.coolwi.km:id/iv_save
		solo.clickOnView(solo.getView("iv_save"));

		//click on ѡ������Ա
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_js"));
		//click on ����
		solo.clickOnView(solo.getView("com.coolwi.km:id/iv_back"));
		
		//click on Ȩ��
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_qx"));
		//ѡ�����Ȩ�ޣ���
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
		//ȷ��ѡ��
		solo.clickOnView(solo.getView("com.coolwi.km:id/iv_save"));
		//click on Ȩ��
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_qx"));
		//click on ����
		solo.clickOnView(solo.getView("com.coolwi.km:id/iv_back"));
		//click on ȷ��
		solo.clickOnView(solo.getView("bt_ok"));
		//assertEquals("EmpManageActivity is not found", solo.waitForActivity("EmpManageActivity"));
		//ɾ��Ա��
		// Click on ɾ��
		solo.clickOnText(java.util.regex.Pattern.quote("ɾ��"), 1);
		//click on ����
		solo.clickOnView(solo.getView("com.coolwi.km:id/iv_back"));
	 /*   // click on �������
		solo.clickOnView(solo.getView("iv_tcsz"));
		assertEquals("TCSZActivity is not found", solo.waitForActivity("TCSZActivity"));*/
/*		
		
		//click on �豸����
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_sbgl"));
		//click on ��ӡ����
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_dysz"));
		//click on ��������
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_zxsy"));
		//click on ��������
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_jrls"));*/
		
		//click on �����˺� JSZHActivity
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_jszh"));
		//assertEquals(" JSZHActivity is not found", solo.waitForActivity(" JSZHActivity"));
		  //click on �˻�����
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_type"));
		//?click on ���幤�̻�  
		solo.clickOnText("���幤�̻�");
		//click on�����˺�
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_account"));
		// Enter the text: '150881320742222222'
		solo.clearEditText((android.widget.EditText) solo.getView("et_account"));
		solo.enterText((android.widget.EditText) solo.getView("et_account"), "150881320742222222");
		//click on ��������
		solo.clickOnView(solo.getView("tv_bank_name"));
		solo.clickOnText("ũҵ����");
		//click on ʡ��
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_province"));
		solo.clickOnText("���");
		//click on  ����
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_city"));
		solo.clickOnText("���");
		//click on����֧��
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_sub_bank"));
		// Enter the text: '150881320742222222'
		solo.clearEditText((android.widget.EditText) solo.getView("et_sub_bank"));
		solo.enterText((android.widget.EditText) solo.getView("et_sub_bank"), "150881320742222222");
		
		//click on��������
	    solo.clickOnView(solo.getView("com.coolwi.km:id/et_open_name"));
		// Enter the text: '150881320742222222'
		solo.clearEditText((android.widget.EditText) solo.getView("et_open_name"));
		solo.enterText((android.widget.EditText) solo.getView("et_open_name"), "150881320742222222");
		// click on ��һ�� com.coolwi.km:id/bt_next
		solo.clickOnView(solo.getView("bt_next"));
		//assertEquals(" JSZHActivity is not found", solo.waitForActivity(" JSZHActivity"));
		
		//click on��ϵ��
		solo.clickOnView(solo.getView("et_name"));
		// Enter the text: '������'
		solo.clearEditText((android.widget.EditText) solo.getView("et_name"));
		solo.enterText((android.widget.EditText) solo.getView("et_name"), "������");
		
		//click on����
		solo.clickOnView(solo.getView("et_email"));
		// Enter the text: '730162062@qq.com'
		solo.clearEditText((android.widget.EditText) solo.getView("et_email"));
		solo.enterText((android.widget.EditText) solo.getView("et_email"), "730162062@qq.com");
		//click on ����ȷ�� com.coolwi.km:id/et_email_confirm
		solo.clickOnView(solo.getView("et_email_confirm"));
		// Enter the text: '730162062@qq.com'
		solo.clearEditText((android.widget.EditText) solo.getView("et_email_confirm"));
		solo.enterText((android.widget.EditText) solo.getView("et_email_confirm"), "730162062@qq.com");
		//click on �ύ���
		solo.clickOnView(solo.getView("bt_ok"));
		//assertEquals(" JSZHActivity is not found", solo.waitForActivity(" JSZHActivity"));
		//click on ���
		solo.clickOnView(solo.getView("bt_done"));

		// Click on �˺Ź���
		solo.clickOnView(solo.getView("com.coolwi.km:id/radio4"));
		// Click on ϵͳ����
				solo.clickOnView(solo.getView("tv_xtsz"));
				// Wait for activity: 'com.coolwi.km.main.account.XTSZActivity'
			//	assertTrue("XTSZActivity is not found!", solo.waitForActivity("XTSZActivity"));
				// Click on �˳���¼
				solo.clickOnView(solo.getView("rela_tcdl"));
				// Wait for dialog
				solo.waitForDialogToOpen(5000);
				// Click on ȷ��
				solo.clickOnView(solo.getView("bt_confirm"));
				// Wait for activity: 'com.coolwi.km.activity.LoginActivity'
			//	assertTrue("LoginActivity is not found!", solo.waitForActivity("LoginActivity"));
		
		
	}
}
