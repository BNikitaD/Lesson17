package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class AddandRemoveElements {

    @Test
    public void AddandRemoveElements(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//*[@onclick=\"addElement()\"]")).click();
        driver.findElement(By.xpath("//*[@onclick=\"addElement()\"]")).click();
        driver.findElement(By.xpath("//*[@onclick=\"deleteElement()\"]")).click();
        List<WebElement> list = driver.findElements(By.xpath("//*[@class=\"added-manually\"]"));
        list.isEmpty();

    }
}
