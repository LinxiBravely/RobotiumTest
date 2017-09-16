package com.coolwi.km.test;


import junit.framework.Test;


import junit.framework.TestSuite;
//import junit.sampling.*;
public class TestAll {
 public static Test suite()
 {
  TestSuite suite = new TestSuite("All tests from part1");//表明这个标识性MD东西
  suite.addTestSuite(MDGLListActivity.class);
  suite.addTestSuite(SHSCListActivity.class);
  //suite.addTest(new TTmmTest("testHelloworld"));//这里可以添加单个的测试方法
  return suite;
 }
}
