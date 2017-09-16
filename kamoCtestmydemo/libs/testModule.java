package test.kamo.b.regression;

import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class testModule extends ActivityInstrumentationTestCase2 {

	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.coolwi.km.activity.StartActivity";
	
	private static Class<?> launcherActivityClass;
	
	static {
		try{
			launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
		}
		catch(ClassNotFoundException e){
			throw new RuntimeException("Class Not Found" + e);
		}
	}	
	
	public testModule() throws Exception{
		super(launcherActivityClass);
	}

	protected Solo solo;
	public int screenshotCounter = 0;
	
	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(),getActivity());
		
	}

	protected void tearDown() throws Exception {
		solo.finishOpenedActivities();
		super.tearDown();
	}
	
	public void autoScreenshot(){
		solo.sleep(1);
		String screenshotName = Thread.currentThread().getStackTrace()[3].getMethodName() + "_" + String.valueOf(screenshotCounter);
		solo.takeScreenshot(screenshotName);
		System.out.println(screenshotName);
		screenshotCounter++;
	}
	
	/*protected void assertEqualsWithScreenshot(String screenshotname, String msg, String msgexpected) {
		solo.takeScreenshot(screenshotname);
		assertEquals("screenshot[" + screenshotname + "]" + msg, msg, msgexpected);
	}*/

}