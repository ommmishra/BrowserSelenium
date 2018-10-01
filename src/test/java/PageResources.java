import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PageResources {
    WebDriver driver;
    By SearchWrite = By.xpath("//input[@id='lst-ib']");
    By SearchButton = By.xpath("//input[@value='Google Search']");
    public PageResources(WebDriver driver){
        this.driver = driver;

    }

    public void Search_Textbox(String write){

        driver.findElement(SearchWrite).sendKeys(write);

    }

    public void click(){
        driver.findElement(SearchButton).sendKeys(Keys.RETURN);
    }

}
