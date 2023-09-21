package seleniumour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumXPathPhoneBook {

    WebDriver driver;

    @BeforeClass
    public void preconditions(){
        driver = new ChromeDriver();
        driver.navigate().to("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void testPhoneBook(){
        WebElement container = driver.findElement(By.xpath("//*[@class='container']"));
        WebElement forQATesting = driver.findElement(By.xpath("//h3"));
        WebElement background = driver.findElement(By.xpath("//*[@style]"));
        WebElement phoneBook = driver.findElement(By.xpath("//*[contains(text(), 'BOOK')]"));




    }

    @AfterClass
    public void postConditions(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}
