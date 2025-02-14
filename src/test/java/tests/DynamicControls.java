package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;
public class DynamicControls {

    @Test
    public void dynamicControls() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        WebElement removeButton = driver.findElement(By.xpath("//*[@type='button']"));
        removeButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(removeButton)).getText();
        boolean isCheckboxInvisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@type='checkbox']")));
        WebElement input = driver.findElement(By.xpath("//input[@type='text' and @disabled='']"));
        input.isEnabled();
        WebElement buttonEnable = driver.findElement(By.xpath("//*[@onclick=\"swapInput()\"]"));
        buttonEnable.click();
        WebDriverWait inputAvailable = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='message']")));
        input.isEnabled();
    }
}
