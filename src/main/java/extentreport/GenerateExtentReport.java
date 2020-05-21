package extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.BeforeTest;

public class GenerateExtentReport {
    ExtentReports extent,report;
    ExtentTest test;
@BeforeTest
    public void startReport(){
    extent = new ExtentReports();
//    report = new ExtentReports("/Users/azarkabeer/Documents/LinkedIn/test-output/myreport.html");
    extent.setSystemInfo("Host name", "Local Host");
    extent.setSystemInfo("Environment", "QA");
    extent.setSystemInfo("user", "Mubeena");
//    extent.config("/Users/azarkabeer/Documents/LinkedIn/test-output/extent-config.xml");



    }
}
