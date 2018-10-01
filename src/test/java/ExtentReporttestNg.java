import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.*;

public class ExtentReporttestNg {
    ExtentHtmlReporter htmlReporter;
    ExtentReports extent;

    @BeforeSuite
    public void setUp(){
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Users\\Omm\\IdeaProjects\\BrowserSeslenium\\extent.html");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);



    }
    @Test
    public void test(){
        ExtentTest test1 = extent.createTest("Google Search Test One","this is a test for me my man");

    }
    @AfterSuite
    public void TearDown(){

    }
}
