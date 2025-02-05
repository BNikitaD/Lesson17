package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Dropdown {

    @Test
    public void dropdown(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        WebElement selector = driver.findElement(By.id("dropdown"));
        selector.isSelected();
        selector.click();
        WebElement option1 = driver.findElement(By.xpath("//*[@value=1]"));
        option1.click();
        option1.isDisplayed();
        WebElement option2 = driver.findElement(By.xpath("//*[@value=2]"));
        option2.click();
        option2.isDisplayed();
    }
}
