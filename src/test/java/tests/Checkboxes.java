package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkboxes {

    @Test
    public void Checkboxes(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement firstBox = driver.findElement(By.cssSelector("[type=checkbox]"));
        String firstunchecked = firstBox.getCssValue("checked");
        driver.findElement(By.cssSelector("[type=checkbox]")).click();
        String firstchecked = firstBox.getCssValue("checked");

        WebElement secondBox = driver.findElement(By.xpath("//*[@type='checkbox'][2]"));
        String secondchecked = secondBox.getCssValue("defaultChecked");
        secondBox.click();
        String secondunchecked = secondBox.getCssValue("checked");

    }
}
