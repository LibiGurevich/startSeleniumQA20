package seleniumour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableTest {

    WebDriver driver;

    @BeforeClass
    public void preconditions(){
        driver = new ChromeDriver();
        driver.navigate().to("https://www.w3schools.com/css/css_table.asp");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @Test
    public void tableTest1(){
String text = driver.findElement(By.cssSelector("#customers tr:nth-child(8) td:last-child")).getText().trim();
        System.out.println(text);
        Assert.assertEquals(text, "Canada", "text not Canada");
        Assert.assertTrue(text.contains("Can"));
    }

    @Test
    public void testTables(){
        List<WebElement> listRow = driver.findElements(By.cssSelector("#customers tr"));
        System.out.println(listRow.size());

        List<WebElement> columns = driver.findElements(By.cssSelector("#customers th"));
        System.out.println(columns.size());

        WebElement row4 = driver.findElement(By.cssSelector("#customers tr:nth-child(4)"));
        System.out.println(row4.getText());

        System.out.println(driver.findElement(By.xpath("//tr[4]")));

        System.out.println(driver.findElement(By.xpath("//th[last()]")));






    }

    @AfterClass
    public void postConditions(){
        driver.quit();
    }
}
