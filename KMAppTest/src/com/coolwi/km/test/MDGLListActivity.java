/*       

 */


/*

 @测试模块：测试账号管理
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
		// Click on 登    录
		solo.clickOnView(solo.getView("bt_ok"));
		// Wait for activity: 'com.coolwi.km.main.MainActivity's
		assertTrue("MainActivity is not found!", solo.waitForActivity("MainActivity"));
		// Wait for dialog
		solo.waitForDialogToOpen(5000);
		// Set default small timeout to 10377 milliseconds
		Timeout.setSmallTimeout(10377);
       //click on 门店管理 radio0
		solo.clickOnView(solo.getView("radio0"));
		//assertEquals("MainActivity is not found", solo.waitForActivity("MainActivity"));
		//solo.waitForDialogToOpen(5000);
		//click on 门店信息
		solo.clickOnView(solo.getView("tv_mdxx"));
		//assertEquals("ShopInfoActivity is not found", solo.waitForActivity("ShopInfoActivity"));
		solo.takeScreenshot();
		
		//click on 营业时间，修改营业时间
		solo.clickOnView(solo.getView("tv_time"));
		//click on 保存
		solo.clickOnView(solo.getView("iv_save"));
		//click on 营业时间，修改营业时间
		solo.clickOnView(solo.getView("tv_time"));
		//click on 返回
		solo.clickOnView(solo.getView("iv_back"));
		//assertEquals("ShopEditTimeActivity is not found", solo.waitForActivity("ShopEditTimeActivity"));
	  //click on 门店电话，修改门店电话
		solo.clickOnView(solo.getView("tv_phone"));
		//assertEquals("ShopEditTimeActivity is not found", solo.waitForActivity("ShopEditTimeActivity"));
		//click on 座机号码
		solo.clickOnView(solo.getView("et_zjhm"));
		// Enter the text: '07508022333'
		solo.clearEditText((android.widget.EditText) solo.getView("et_zjhm"));
		solo.enterText((android.widget.EditText) solo.getView("et_zjhm"), "07508022333");
		//click on 手机号码
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_phone"));
		// Enter the text: '15088132074'
		solo.clearEditText((android.widget.EditText) solo.getView("et_phone"));
		solo.enterText((android.widget.EditText) solo.getView("et_phone"), "15088132074");
		solo.takeScreenshot();
		//click on 打钩
		solo.clickOnView(solo.getView("iv_save"));
	
		//click on 门店地址，修改门店地址
		solo.clickOnView(solo.getView("tv_address"));
		//assertEquals("ShopEditTimeActivity is not found", solo.waitForActivity("ShopEditTimeActivity"));
		solo.takeScreenshot();
		//click on 返回
		solo.clickOnView(solo.getView("com.coolwi.km:id/iv_back"));
		//click on 门店介绍，修改门店介绍
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_mdjs"));
		//Enter the text 
		solo.clearEditText((android.widget.EditText)solo.getView("et_mdjs"));
		solo.enterText((android.widget.EditText)solo.getView("et_mdjs"), "text");
	    //click on 保存
		solo.clickOnView(solo.getView("iv_save"));
		//click on 门店介绍，返回
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_mdjs"));
		solo.clickOnView(solo.getView("com.coolwi.km:id/iv_back"));
		//click on 支持退卡，修改支持退卡
		solo.clickOnView(solo.getView("com.coolwi.km:id/slipButton"));
		//确认修改 门店信息
		solo.clickOnView(solo.getView("bt_ok"));
		
		//click on 员工管理  
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_yggl"));
		//assertEquals("EmpManageActivity is not found", solo.waitForActivity("EmpManageActivity"));
		//click on 增加员工
		solo.clickOnView(solo.getView("com.coolwi.km:id/iv_jia"));
		//assertEquals("EmpEditActivity is not found", solo.waitForActivity("EmpEditActivity"));
		//click on 工号
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_num"));
		// Enter the text: '15088132074'
		solo.clearEditText((android.widget.EditText) solo.getView("et_num"));
		solo.enterText((android.widget.EditText) solo.getView("et_num"), "001");
		//click on 姓名
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_name"));
		// Enter the text: '黄雯雯'
		solo.clearEditText((android.widget.EditText) solo.getView("et_name"));
		solo.enterText((android.widget.EditText) solo.getView("et_name"), "黄雯雯");
		//click on 手机
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_phone"));
		// Enter the text: '15088132074'
		solo.clearEditText((android.widget.EditText) solo.getView("com.coolwi.km:id/et_phone"));
		solo.enterText((android.widget.EditText) solo.getView("com.coolwi.km:id/et_phone"), "15866412536");
		//click on 角色
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_js"));
		// click on 收银员  com.coolwi.km:id/iv_save
		solo.clickOnView(solo.getView("iv_save"));

		//click on 选择收银员
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_js"));
		//click on 返回
		solo.clickOnView(solo.getView("com.coolwi.km:id/iv_back"));
		
		//click on 权限
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_qx"));
		//选择相关权限？？
		        // Click on 充值
				solo.clickInList(2, 0);
				// Click on 消费
				solo.clickInList(3, 0);
				// Click on 退卡
				solo.clickInList(4, 0);
				// Click on 积分兑换
				solo.clickInList(5, 0);
				// Click on  年/次卡 验证
				solo.clickInList(6, 0);
				// Click on  年/次卡 开卡
				solo.clickInList(7, 0);
				// Click on 取消交易
				solo.clickInList(8, 0);
				// Click on ImageView
		//确定选择
		solo.clickOnView(solo.getView("com.coolwi.km:id/iv_save"));
		//click on 权限
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_qx"));
		//click on 返回
		solo.clickOnView(solo.getView("com.coolwi.km:id/iv_back"));
		//click on 确定
		solo.clickOnView(solo.getView("bt_ok"));
		//assertEquals("EmpManageActivity is not found", solo.waitForActivity("EmpManageActivity"));
		//删除员工
		// Click on 删除
		solo.clickOnText(java.util.regex.Pattern.quote("删除"), 1);
		//click on 返回
		solo.clickOnView(solo.getView("com.coolwi.km:id/iv_back"));
	 /*   // click on 提成设置
		solo.clickOnView(solo.getView("iv_tcsz"));
		assertEquals("TCSZActivity is not found", solo.waitForActivity("TCSZActivity"));*/
/*		
		
		//click on 设备管理
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_sbgl"));
		//click on 打印设置
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_dysz"));
		//click on 在线收银
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_zxsy"));
		//click on 加入连锁
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_jrls"));*/
		
		//click on 结算账号 JSZHActivity
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_jszh"));
		//assertEquals(" JSZHActivity is not found", solo.waitForActivity(" JSZHActivity"));
		  //click on 账户类型
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_type"));
		//?click on 个体工商户  
		solo.clickOnText("个体工商户");
		//click on银行账号
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_account"));
		// Enter the text: '150881320742222222'
		solo.clearEditText((android.widget.EditText) solo.getView("et_account"));
		solo.enterText((android.widget.EditText) solo.getView("et_account"), "150881320742222222");
		//click on 开户银行
		solo.clickOnView(solo.getView("tv_bank_name"));
		solo.clickOnText("农业银行");
		//click on 省份
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_province"));
		solo.clickOnText("天津");
		//click on  城市
		solo.clickOnView(solo.getView("com.coolwi.km:id/tv_city"));
		solo.clickOnText("天津");
		//click on开户支行
		solo.clickOnView(solo.getView("com.coolwi.km:id/et_sub_bank"));
		// Enter the text: '150881320742222222'
		solo.clearEditText((android.widget.EditText) solo.getView("et_sub_bank"));
		solo.enterText((android.widget.EditText) solo.getView("et_sub_bank"), "150881320742222222");
		
		//click on开户名称
	    solo.clickOnView(solo.getView("com.coolwi.km:id/et_open_name"));
		// Enter the text: '150881320742222222'
		solo.clearEditText((android.widget.EditText) solo.getView("et_open_name"));
		solo.enterText((android.widget.EditText) solo.getView("et_open_name"), "150881320742222222");
		// click on 下一步 com.coolwi.km:id/bt_next
		solo.clickOnView(solo.getView("bt_next"));
		//assertEquals(" JSZHActivity is not found", solo.waitForActivity(" JSZHActivity"));
		
		//click on联系人
		solo.clickOnView(solo.getView("et_name"));
		// Enter the text: '黄问问'
		solo.clearEditText((android.widget.EditText) solo.getView("et_name"));
		solo.enterText((android.widget.EditText) solo.getView("et_name"), "黄问问");
		
		//click on邮箱
		solo.clickOnView(solo.getView("et_email"));
		// Enter the text: '730162062@qq.com'
		solo.clearEditText((android.widget.EditText) solo.getView("et_email"));
		solo.enterText((android.widget.EditText) solo.getView("et_email"), "730162062@qq.com");
		//click on 邮箱确认 com.coolwi.km:id/et_email_confirm
		solo.clickOnView(solo.getView("et_email_confirm"));
		// Enter the text: '730162062@qq.com'
		solo.clearEditText((android.widget.EditText) solo.getView("et_email_confirm"));
		solo.enterText((android.widget.EditText) solo.getView("et_email_confirm"), "730162062@qq.com");
		//click on 提交审核
		solo.clickOnView(solo.getView("bt_ok"));
		//assertEquals(" JSZHActivity is not found", solo.waitForActivity(" JSZHActivity"));
		//click on 完成
		solo.clickOnView(solo.getView("bt_done"));

		// Click on 账号管理
		solo.clickOnView(solo.getView("com.coolwi.km:id/radio4"));
		// Click on 系统设置
				solo.clickOnView(solo.getView("tv_xtsz"));
				// Wait for activity: 'com.coolwi.km.main.account.XTSZActivity'
			//	assertTrue("XTSZActivity is not found!", solo.waitForActivity("XTSZActivity"));
				// Click on 退出登录
				solo.clickOnView(solo.getView("rela_tcdl"));
				// Wait for dialog
				solo.waitForDialogToOpen(5000);
				// Click on 确定
				solo.clickOnView(solo.getView("bt_confirm"));
				// Wait for activity: 'com.coolwi.km.activity.LoginActivity'
			//	assertTrue("LoginActivity is not found!", solo.waitForActivity("LoginActivity"));
		
		
	}
}
