package seleniumour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class SeleniumCssIlCarro {

    WebDriver driver;

    @Test
    public void test1() {
        driver = new ChromeDriver();
        driver.navigate().to("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        // h2 is tag name
        WebElement h2TextElement = driver.findElement(By.cssSelector("h2"));
        System.out.println(h2TextElement.getText());

        //by class value
        WebElement h2TextElementByClass = driver.findElement(By.cssSelector(".subtitle"));
        System.out.println(h2TextElementByClass.getText());

        WebElement h2TextElementByClassName = driver.findElement(By.className("subtitle"));
        System.out.println(h2TextElementByClassName.getText());

        WebElement inputCityById = driver.findElement(By.cssSelector("#city"));


        WebElement inputCityByIdDirectly = driver.findElement(By.id("city"));
        System.out.println(inputCityById.getAttribute("type"));

        //find by full attribute incl name and value
        WebElement wildElementAttribute = driver.findElement(By.cssSelector("[style='touch-action: none; user-select: none; -webkit-user-drag: none; -webkit-tap-highlight-color: rgba(0, 0, 0, 0);']"));

        WebElement h2ByClassAndTagTogether = driver.findElement(By.cssSelector("h2.subtitle"));

       //WebElement h2ByText = driver.findElement(By.partialLinkText("Type your data and hit Yalla!"));


        WebElement h2ByTextName = driver.findElement(By.tagName("h2"));

        WebElement xpath2 = driver.findElement(By.xpath("//label[@for='city']"));
        System.out.println(xpath2.getText());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
    }

