package com.coolwi.km.user.testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import android.widget.EditText;
import android.widget.TextView;

import com.coolwi.km.user.test.BasicTestCase;
import com.coolwi.km.user.test.UIHelper;
/*进入主页后测试 我的*/
public class MyCardUserTestcase1 extends longinTest1 {

	public MyCardUserTestcase1() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	@Before
	public void setup()throws Exception{
		
	}
	@After
	public void tearDoen()throws Exception{
		
	}

	@Test
	public void testMycarduser(){
		
		try {
			//进入我的
			solo.clickOnView(uiHelper.getElementsMyCard().clickById("card_rb_4"));
		//	 assertTrue(solo.getString(R.string.scroll_text).toString().contains("道可道")); 
			//进入个人信息
			solo.clickOnView(uiHelper.getElementMycarduserAcitvity().clickById("me_menber_name"))	;
		/*	//判断进入我的
			TextView t=(TextView)uiHelper.getElementMycarduserAcitvity().clickById("me_menber_name");
		        assertEquals("default text",tv.getText());  
	*/
			solo.sleep(10);
			solo.takeScreenshot("个人信息");
			//assertEquals(expected, actual)
			//search
		
			solo.clickOnView(uiHelper.getElementMycardMyImforActivity().clickById("information_name_name"));
		/*	if(solo.waitForView(uiHelper.getElementMycardMyImforActivity().clickById("information_name_name"))) {
            //waitfor 20s内找到返回true，没找到返回false
				}*/
			solo.waitForView(uiHelper.getElementMycardMyImforActivity().clickById("information_name_name"));
			//assertEquals("个人信息", (TextView)uiHelper.getElementMycardMyImforActivity().clickById("information_name_name").getText());
		    assertEquals(true,solo.waitForText("个人信息"));  
			
			//进入姓名
			//输入姓名
			//清除键
			//输入姓名
			//并确定
			//solo.clickOnView(view)uiHelper.getElementMycardMyImforActivity().clickById("information_2_ed");
			EditText information_2_ed;
			information_2_ed=(EditText)uiHelper.getElementMycardMyImforActivity().clickById("information_2_ed");
			solo.enterText(information_2_ed, "我的姓名姓名");
			solo.clickOnView(uiHelper.getElementMycardMyImforActivity().clickById("information_2_iv"));
			solo.enterText(information_2_ed, "我的姓名姓名");
			solo.clickOnView(uiHelper.getElementMycardMyImforActivity().clickById("information_2_title_iv_r"));
			/*/进入姓名后输入不保存返回*/
			solo.clickOnView(uiHelper.getElementMycardMyImforActivity().clickById("information_name_name"));
			solo.clearEditText(information_2_ed);
			solo.enterText(information_2_ed, "我的姓名姓名2");
			solo.clickOnView(uiHelper.getElementMycardMyImforActivity().clickById("information_2_title_iv_f"));
			
			/*进入邮箱输入邮箱设置后清除邮箱再输入保存		*/	
			solo.clickOnView(uiHelper.getElementMycardMyImforActivity().clickById("information_mail_name"));
			EditText information_4_ed;
			information_4_ed=(EditText)uiHelper.getElementMycardMyImforActivity().clickById("information_4_ed");
			solo.enterText(information_4_ed, "730162062@qq.com");
			solo.clickOnView(uiHelper.getElementMycardMyImforActivity().clickById("information_4_iv"));
			solo.enterText(information_2_ed, "730162062@qq.com");
			solo.clickOnView(uiHelper.getElementMycardMyImforActivity().clickById("information_4_title_iv_r"));
			/*进入邮箱后输入不保存返回*/
			solo.clickOnView(uiHelper.getElementMycardMyImforActivity().clickById("information_mail_name"));
			solo.clearEditText(information_4_ed);
			solo.enterText(information_4_ed, "730162062@qq.com");
			solo.clickOnView(uiHelper.getElementMycardMyImforActivity().clickById("information_4_title_iv_f"));
			
			/*判断生日是否已设置，未设置便设置生日，已设置不可更改*/
			TextView information_birthday_name;
			information_birthday_name=(TextView) uiHelper.getElementMycardMyImforActivity().clickById("information_birthday_name");
			Boolean flag=false;//是否可点击
			flag=information_birthday_name.isClickable();//返回是true就是可点击
			if(flag==false){
				//不可点击，已设置生日
				//information_birthday_name。gettext
			}else{
				//未设置生日，可点击设置生日
				solo.clickOnView(uiHelper.getElementMycardMyImforActivity().clickById("information_birthday_name"));
				//滑动设置
				solo.scrollDown();
				
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
