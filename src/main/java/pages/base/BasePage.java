package pages.base;

import com.sun.org.apache.bcel.internal.ExceptionConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static common.Config.EXPLICIT_WAIT;

public class BasePage {
    protected WebDriver driver;
    public BasePage (WebDriver driver) {
        this.driver = driver;
    }
    public void open(String url){
        driver.get(url);
    }
    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(driver,EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));

        return element;
    }

}

