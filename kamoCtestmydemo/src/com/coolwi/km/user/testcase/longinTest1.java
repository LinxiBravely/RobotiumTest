package com.coolwi.km.user.testcase;

import com.coolwi.km.user.test.BasicTestCase;

public class longinTest1 extends BasicTestCase{

	public longinTest1() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}

	@SuppressWarnings("unused")
	public void testTestCase1() {
		// TODO Auto-generated method stub
	//	uiHelper.getElementsLoginActivity().
		uiHelper.getElementsLoginActivity().enterlogin_num("15088132074");
		uiHelper.getElementsLoginActivity().enternote("159753");
		uiHelper.getElementsLoginActivity().enterbt_loginButton();
		
		
		
	}
}
