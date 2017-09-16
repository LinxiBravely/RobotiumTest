package com.coolwi.km.user.testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyCardRecord extends longinTest1 {

	public MyCardRecord() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	//
	protected void SetUp() throws Exception{
		super.setUp();
	}
	@Before
	public void setup()throws Exception{
		
	}
	@After
	public void tearDoen()throws Exception{
		
	}

	@Test
	private void testMyCardRecord() {
		// TODO Auto-generated method stub
		try {
			//进入交易记录
			solo.clickOnView(uiHelper.getElementMycarduserAcitvity().clickById("me_rb_transaction_record"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		solo.takeScreenshot("交易记录");
		//点击进入店名为 ？ 的交易记录solo.clickOnText(text)
		solo.clickOnText("单店测试");
		//进入交易记录
		try {
			solo.clickOnView(uiHelper.getElementMyCardRecord().clickById("record_guid1"));
			
			solo.clickOnView(uiHelper.getElementMyCardRecord().clickById("record_guid2"));
			solo.clickOnView(uiHelper.getElementMyCardRecord().clickById("record_guid3"));
			solo.clickOnView(uiHelper.getElementMyCardRecord().clickById("record_guid4"));
			solo.clickOnView(uiHelper.getElementMyCardRecord().clickById("record_guid5"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
