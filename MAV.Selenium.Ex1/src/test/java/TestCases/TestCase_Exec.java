package TestCases;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

import com.aventstack.extentreports.Status;
import POM.AtLoginPage;
import selenium.ClsBrowser;
import selenium.ClsReport;
import selenium.ClsWebElements;

public class TestCase_Exec extends ClsWebElements
{
	@Rule public TestName TC_Name = new TestName();
	public String URL;
	
	@BeforeClass
	public static void beforeClass() 
	{
		ClsReport.fnSetupReport();
	}
	
	@Before
	public void setup() 
	{
		ClsBrowser.BrowserName = "CHROME";
		OpenBrowser();
	} 
	
	
	@Test
	public void FirstTC()
	{
		try 
		{
			ClsReport.objTest = ClsReport.objExtent.createTest("First Test");
			URL = "https://positionsapp-uat.azurewebsites.net/#";
			NavigateToUrl(URL);
			WaitForLoad();
			ClsReport.fnLog(Status.PASS, "Navigation to URL.", false);
			AtLoginPage objLogin = new AtLoginPage();
			objLogin.enterCredential();
			ClsReport.fnLog(Status.PASS, "Username Entered.", false);
			objLogin.startSession();
			ClsReport.fnLog(Status.PASS, "Session Started.", false);
			objLogin.keepSessionDialog();
			ClsReport.fnLog(Status.PASS, "Keep Session Open.", false);
			objLogin.verifyActiveSession();
			ClsReport.fnLog(Status.PASS, "Active Session Verification.", true);
		}
		catch(Exception e) 
		{
			ClsReport.fnLog(Status.FAIL, "The: " + TC_Name.getMethodName() + " was not executed successfully. \n Exception: " + e.getMessage() , true);
		}
	}
		
		
	@Test
	public void SecondTC()
	{
		try 
		{
			ClsReport.objTest = ClsReport.objExtent.createTest("Second Test");
			URL = "https://positionsapp-uat.azurewebsites.net/#";
			NavigateToUrl(URL);
			WaitForLoad();
			ClsReport.fnLog(Status.PASS, "Navigation to URL.", false);
			AtLoginPage objLogin = new AtLoginPage();
			objLogin.enterCredential();
			ClsReport.fnLog(Status.PASS, "Username Entered.", false);
			objLogin.startSession();
			ClsReport.fnLog(Status.PASS, "Session Started.", false);
			objLogin.keepSessionDialog();
			ClsReport.fnLog(Status.PASS, "Keep Session Open.", false);
			objLogin.verifyActiveSession();
			ClsReport.fnLog(Status.PASS, "Active Session Verification.", true);
		}
		catch (Exception e) 
		{
			ClsReport.fnLog(Status.FAIL, "The: " + TC_Name.getMethodName() + " was not executed successfully. \n Exception: " + e.getMessage() , false);
		}
	}
	
	@Test 
	public void NewTest()
	{
		try 
		{
			ClsReport.objTest = ClsReport.objExtent.createTest("New Test");
			URL = "https://positionsapp-uat.azurewebsites.net/#";
			NavigateToUrl(URL);
			WaitForLoad();
			ClsReport.fnLog(Status.PASS, "Navigation to URL.", false);
			AtLoginPage objLogin = new AtLoginPage();
			objLogin.enterCredential();
			ClsReport.fnLog(Status.PASS, "Username Entered.", false);
			objLogin.startSession();
			ClsReport.fnLog(Status.PASS, "Session Started.", false);
			objLogin.keepSessionDialog();
			ClsReport.fnLog(Status.PASS, "Keep Session Open.", false);
			objLogin.verifyActiveSession();
			ClsReport.fnLog(Status.PASS, "Active Session Verification.", true);
		}
		catch (Exception e) 
		{
			ClsReport.fnLog(Status.FAIL, "The: " + TC_Name.getMethodName() + " was not executed successfully. \n Exception: " + e.getMessage() , false);
		}
	}
	
	
	
	@After
	public void tearDown() 
	{
		CloseBrowser();
		ClsReport.fnCloseReport();
	}

}
