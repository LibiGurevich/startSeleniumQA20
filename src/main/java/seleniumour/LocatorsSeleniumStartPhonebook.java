package seleniumour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LocatorsSeleniumStartPhonebook {

    WebDriver driver;

    @Test
    public void test1(){
        driver = new ChromeDriver();
        driver.navigate().to("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


        WebElement h1TextElement = driver.findElement(By.cssSelector("h1"));
        System.out.println(h1TextElement.getText());

        WebElement h1TextElementByTag = driver.findElement(By.tagName("h1"));
        System.out.println(h1TextElementByTag.getText());

        WebElement h3TextElementByClass = driver.findElement(By.cssSelector(".active"));
        System.out.println(h3TextElementByClass.getText());

        WebElement byClassName = driver.findElement(By.className("active"));
        System.out.println(byClassName.getText());

        WebElement byId = driver.findElement(By.id("root"));
        System.out.println(byId.getAttribute("about"));

        WebElement byCssId = driver.findElement(By.cssSelector("#root"));
        System.out.println(byCssId.getText());









        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();
    }
}
