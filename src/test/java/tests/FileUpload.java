package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FileUpload {

    @Test
    public void fileUpload() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/upload");
        WebElement chooseFileButton = driver.findElement(By.id("file-upload"));
        chooseFileButton.sendKeys("/Users/nikitabulavko/Desktop/Снимок экрана 2025-02-12 в 21.24.59.png");
        driver.findElement(By.cssSelector("[id=file-submit]")).click();
        String nameExpectedFile = "Снимок экрана 2025-02-12 в 21.24.59.png";
        String uploadedFile = driver.findElement(By.xpath("//*[@id='uploaded-files']")).getText();
        Assert.assertEquals(uploadedFile, nameExpectedFile);
    }
}
