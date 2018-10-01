import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Sleeper;

import java.security.Key;


public class ExtendReportsBasicDemo {

    private static void quir()throws InterruptedException{
        Thread.sleep(20000);}

    public static void main(String[] args) {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C:\\Users\\Omm\\IdeaProjects\\BrowserSeslenium\\extent.html");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        ExtentTest test0 = extent.createTest("Google Search Test One","this is a test for me my man");

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Omm\\IdeaProjects\\BrowserSeslenium\\src\\Driver\\geckoDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        test0.log(Status.INFO,"Starting test Case");

        driver.get("https://google.com");

        test0.pass("Navigated to google.com");
        driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("afa");

        test0.pass("Entered the text");
        driver.findElement(By.xpath("//input[@value='Google Search']")).sendKeys(Keys.RETURN);

        test0.pass("Entered the key");

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
        }

        driver.quit();
        test0.pass("Closed the browser");
        test0.info("Test is completed");

        extent.flush();



    }
}
