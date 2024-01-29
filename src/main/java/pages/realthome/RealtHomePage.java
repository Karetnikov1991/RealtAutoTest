package pages.realthome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;
public class RealtHomePage extends BasePage {
    public Object checkCountCards;
    public RealtHomePage(WebDriver driver) {
        super(driver);
    }
    By countRooms = By.xpath("//select[@id='rooms']");
    By option2rooms = By.xpath("//select[@id='rooms']/option[@value='2']");
    By findBtn = By.xpath("//div[@id='residentialInputs']//a[text()='Найти']");
    public RealtHomePage enterCountRoom (){

        driver.findElement(countRooms).click();
        driver.findElement(option2rooms).click();
        return this;
    }
    public RealtHomePage clickToFind(){
        driver.findElement(findBtn).click();
        return this;
    }

}
