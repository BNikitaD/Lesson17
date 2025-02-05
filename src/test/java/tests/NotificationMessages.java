package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NotificationMessages {

    @Test
    public void notificationMessages(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/notification_message_rendered");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement link = driver.findElement(By.linkText("Click here"));
        link.click();
        String expectedResult = "Action successful";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"flash\"]")).getText();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
