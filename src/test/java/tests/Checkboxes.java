package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkboxes {

    @Test
    public void checkCheckBoxes(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        WebElement firstCheckBox = driver.findElement(By.cssSelector("[type=checkbox]"));
        String firstUnchecked = firstCheckBox.getCssValue("checked");
        driver.findElement(By.cssSelector("[type=checkbox]")).click();
        String firstChecked = firstCheckBox.getCssValue("checked");
        WebElement secondCheckBox = driver.findElement(By.xpath("//*[@type='checkbox'][2]"));
        String secondchecked = secondCheckBox.getCssValue("defaultChecked");
        secondCheckBox.click();
        String secondunchecked = secondCheckBox.getCssValue("checked");
    }
}
