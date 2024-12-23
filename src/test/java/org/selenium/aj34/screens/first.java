package org.selenium.aj34.screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class first {
    @Test
    public void test(){

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://testautomationpractice.blogspot.com/");
        System.out.println(driver.getTitle());
        System.out.println("Hello World");
        System.out.print("Apoorv");
        System.out.println("HELLO");
        System.out.println("James");
        System.out.println("First");
        System.out.println("SANITY");
    }
}
