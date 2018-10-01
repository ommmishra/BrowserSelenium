import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Scanner;

public class test2 {
    Scanner sc = new Scanner(System.in);
    WebDriver driver = null;

   PageResources se;
    @BeforeTest
    private void Start(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Omm\\IdeaProjects\\BrowserSeslenium\\src\\Driver\\geckoDriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        se = new PageResources(driver);
    }

   @Test
    private void inTest(){

       driver.get("https://www.google.com/");
        se.Search_Textbox("nike");
        se.click();

    }

    @Test
    private void inTest2(){
       driver.get("https://www.google.com/");
        se.Search_Textbox("nike");
        se.click();

  }

    @AfterTest
    private void quir()throws InterruptedException{
        Thread.sleep(20000);
        driver.quit();
        System.out.println("DONE");
    }
}
