package com.coolwi.km.test;


import junit.framework.Test;


import junit.framework.TestSuite;
//import junit.sampling.*;
public class TestAll {
 public static Test suite()
 {
  TestSuite suite = new TestSuite("All tests from part1");//���������ʶ��MD����
  suite.addTestSuite(MDGLListActivity.class);
  suite.addTestSuite(SHSCListActivity.class);
  //suite.addTest(new TTmmTest("testHelloworld"));//���������ӵ����Ĳ��Է���
  return suite;
 }
}
