package testNG;
	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;

	public class ListernersExample implements ITestListener {

	    @Override
	    public void onTestStart(ITestResult result) {
	        System.out.println("Test case is going to execute");
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        System.out.println("test case is passed");
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        System.out.println("test case is failed");
	    }

	    public void onTestSkipped(ITestContext context) {
	        System.out.println("test case is skipped");
	    }
	    
	    
	    @Override
	    public void onStart(ITestContext context) {
	        System.out.println("before everything");
	    }
	    
	    @Override
	    public void onFinish(ITestContext context) {
	        System.out.println("After everything");
	    }
	}


