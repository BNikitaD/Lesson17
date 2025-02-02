package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Typos {

    @Test
    public void Typos(){

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/typos");

        List<WebElement> paragraphs = driver.findElements(By.tagName("p"));
        String secondParagraphText = paragraphs.get(1).getText();
        String expectedResult = "Sometimes you'll see a typo, other times you won't.";
        Assert.assertEquals(secondParagraphText, expectedResult);

    }
}
