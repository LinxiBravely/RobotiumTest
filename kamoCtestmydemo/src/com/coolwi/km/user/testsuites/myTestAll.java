package com.coolwi.km.user.testsuites;

import com.coolwi.km.user.testcase.MyCardRecord;
import com.coolwi.km.user.testcase.MyCardUserTestcase1;

import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;

  
import junit.framework.TestSuite;
//import junit.sampling.*;
public class myTestAll {
 public static Test suite()
 {
  TestSuite suite = new TestSuite("All tests from part1");//表明这个标识性东西
  suite.
  suite.addTestSuite(MyCardRecord.class);
  suite.addTestSuite(MyCardUserTestcase1.class);
  //suite.addTest(new TTmmTest("testHelloworld"));//这里可以添加单个的测试方法
  return suite;
 }
}

/*public class TestSuite {
private static final Test TestSuite = null;

public static Test suite() {
TestSuite suite = new TestSuite("Test for package1");

suite.addTest(new JUnit4TestAdapter(Test1.class));
suite.addTest(new JUnit4TestAdapter(Test2.class)); 
suite.addTest(new JUnit4TestAdapter(Test3.class));

suite.addTest(new JUnit4TestAdapter(TestSuite2.class));
return TestSuite;
}

private void addTest(JUnit4TestAdapter jUnit4TestAdapter) {
	// TODO Auto-generated method stub
	
}
}*/
/*
public class mTestSuite extends TestSuite{
	public TestSuite fTest=new mTestSuite();
	
	
	public void addTest(Test test){
		TestSuite.
	}
	public void addTestSuite(){
		
	}
}
*/