package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class ContextMenu {

    @Test
    public void contextMenu() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("http://the-internet.herokuapp.com/context_menu");
        WebElement frame = driver.findElement(By.id("hot-spot"));
        actions.contextClick(frame).perform();
        wait.until((ExpectedConditions.alertIsPresent())).getText();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
    }
}
