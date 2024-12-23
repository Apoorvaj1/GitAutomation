package org.selenium.aj34.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.time.Duration;

public class mouseHover {

    public static WebDriver driver;
    public static void main(String[] args) throws IOException {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.hyrtutorials.com/p/contactus.html");
        WebElement tutorialOption = driver.findElement(By.xpath("//div[@class=\"widget LinkList\" and @id=\"LinkList210\"]/ul/li/following-sibling::li/a[text()=\"Tutorials\"]"));
        WebElement testingOption = driver.findElement(By.xpath("//div[@class=\"widget LinkList\" and @id=\"LinkList210\"]/ul/li/following-sibling::li/a[text()=\"Tutorials\"]/parent::li/ul/li/following-sibling::li/a[text()=\"Testing\"]"));
        WebElement seleniumOption = driver.findElement(By.xpath("//div[@class=\"widget LinkList\" and @id=\"LinkList210\"]/ul/li/following-sibling::li/a[text()=\"Tutorials\"]/parent::li/ul/li/following-sibling::li/a[text()=\"Testing\"]/parent::li/ul/li/a[text()=\"Selenium\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(tutorialOption).perform();
        action.moveToElement(testingOption).perform();
        action.moveToElement(seleniumOption).click().perform();



    }
}
