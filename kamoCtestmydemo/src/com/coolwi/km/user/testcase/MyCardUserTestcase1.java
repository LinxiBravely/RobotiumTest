package com.coolwi.km.user.testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import android.widget.EditText;
import android.widget.TextView;

import com.coolwi.km.user.test.BasicTestCase;
import com.coolwi.km.user.test.UIHelper;
/*������ҳ����� �ҵ�*/
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
			//�����ҵ�
			solo.clickOnView(uiHelper.getElementsMyCard().clickById("card_rb_4"));
		//	 assertTrue(solo.getString(R.string.scroll_text).toString().contains("���ɵ�")); 
			//���������Ϣ
			solo.clickOnView(uiHelper.getElementMycarduserAcitvity().clickById("me_menber_name"))	;
		/*	//�жϽ����ҵ�
			TextView t=(TextView)uiHelper.getElementMycarduserAcitvity().clickById("me_menber_name");
		        assertEquals("default text",tv.getText());  
	*/
			solo.sleep(10);
			solo.takeScreenshot("������Ϣ");
			//assertEquals(expected, actual)
			//search
		
			solo.clickOnView(uiHelper.getElementMycardMyImforActivity().clickById("information_name_name"));
		/*	if(solo.waitForView(uiHelper.getElementMycardMyImforActivity().clickById("information_name_name"))) {
            //waitfor 20s���ҵ�����true��û�ҵ�����false
				}*/
			solo.waitForView(uiHelper.getElementMycardMyImforActivity().clickById("information_name_name"));
			//assertEquals("������Ϣ", (TextView)uiHelper.getElementMycardMyImforActivity().clickById("information_name_name").getText());
		    assertEquals(true,solo.waitForText("������Ϣ"));  
			
			//��������
			//��������
			//�����
			//��������
			//��ȷ��
			//solo.clickOnView(view)uiHelper.getElementMycardMyImforActivity().clickById("information_2_ed");
			EditText information_2_ed;
			information_2_ed=(EditText)uiHelper.getElementMycardMyImforActivity().clickById("information_2_ed");
			solo.enterText(information_2_ed, "�ҵ���������");
			solo.clickOnView(uiHelper.getElementMycardMyImforActivity().clickById("information_2_iv"));
			solo.enterText(information_2_ed, "�ҵ���������");
			solo.clickOnView(uiHelper.getElementMycardMyImforActivity().clickById("information_2_title_iv_r"));
			/*/�������������벻���淵��*/
			solo.clickOnView(uiHelper.getElementMycardMyImforActivity().clickById("information_name_name"));
			solo.clearEditText(information_2_ed);
			solo.enterText(information_2_ed, "�ҵ���������2");
			solo.clickOnView(uiHelper.getElementMycardMyImforActivity().clickById("information_2_title_iv_f"));
			
			/*�������������������ú�������������뱣��		*/	
			solo.clickOnView(uiHelper.getElementMycardMyImforActivity().clickById("information_mail_name"));
			EditText information_4_ed;
			information_4_ed=(EditText)uiHelper.getElementMycardMyImforActivity().clickById("information_4_ed");
			solo.enterText(information_4_ed, "730162062@qq.com");
			solo.clickOnView(uiHelper.getElementMycardMyImforActivity().clickById("information_4_iv"));
			solo.enterText(information_2_ed, "730162062@qq.com");
			solo.clickOnView(uiHelper.getElementMycardMyImforActivity().clickById("information_4_title_iv_r"));
			/*������������벻���淵��*/
			solo.clickOnView(uiHelper.getElementMycardMyImforActivity().clickById("information_mail_name"));
			solo.clearEditText(information_4_ed);
			solo.enterText(information_4_ed, "730162062@qq.com");
			solo.clickOnView(uiHelper.getElementMycardMyImforActivity().clickById("information_4_title_iv_f"));
			
			/*�ж������Ƿ������ã�δ���ñ��������գ������ò��ɸ���*/
			TextView information_birthday_name;
			information_birthday_name=(TextView) uiHelper.getElementMycardMyImforActivity().clickById("information_birthday_name");
			Boolean flag=false;//�Ƿ�ɵ��
			flag=information_birthday_name.isClickable();//������true���ǿɵ��
			if(flag==false){
				//���ɵ��������������
				//information_birthday_name��gettext
			}else{
				//δ�������գ��ɵ����������
				solo.clickOnView(uiHelper.getElementMycardMyImforActivity().clickById("information_birthday_name"));
				//��������
				solo.scrollDown();
				
			}
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
