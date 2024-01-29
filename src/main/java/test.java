import com.sun.xml.internal.ws.model.WrapperBeanGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

import java.util.Random;
import java.util.concurrent.TimeUnit;


public class test {   /////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) { ///////////////////////////////////////////////////////////////////////////////

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);

        By img = By.xpath("//img[@alt='Google']");
        driver.get("https://www.yahoo.com/");
        driver.findElement(By.cssSelector("#ybarMailLink")).click();
        try {
            driver.findElement(By.cssSelector(".signups")).click();
        }
        catch(Exception e) {
            driver.findElement(By.cssSelector("#createacc"));
        }



        driver.get("https://www.yahoo.com/");
        WebElement element = driver.findElement(img);
        element.getAttribute("src");
        System.out.println(element.getAttribute("src"));



























//-----------------------------------------------------------------------------

//        driver.get("https://www.google.com/");
//        By input = By.className("gLFyf");
//        By input1 = By.className("LC20lb");
//        By input2 = By.className("vector-search-box-input");
//        WebElement element = driver.findElement(input);
//        element.sendKeys("Haifa", Keys.ENTER);
//        WebElement element1 = driver.findElement(input1);
//        element1.click();
//        WebElement element3 = driver.findElement(input2);
//        element3.sendKeys("Кременчуг", Keys.ENTER);

//--------------------------------------------------------------------------------------
//            WebElement element = driver.findElement(By.id("qwe"));
//            element.

//        driver.get("https://www.google.com/");
//        WebElement element = driver.findElement(By.id("email"));
//        element.sendKeys("Karetnikov1991@gmail.com");
//        WebElement element1 = driver.findElement(By.id("pass"));
//        element1.sendKeys("D11c48i20k.", Keys.ENTER);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        WebElement element3 = driver.findElement(By.name("Разрешить"));
//        element3.click();
//-----------------------------------------------------------------------------




    }/////////////////////////////////////////////////

}/////////////////////////////////////////////



