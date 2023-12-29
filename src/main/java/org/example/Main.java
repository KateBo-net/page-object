package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String name = "test1";
        String email = "test1@123test.test";
        String pass = "123qwe1";
        try {
            driver.get("http://users.bugred.ru/user/login/index.html");
            Thread.sleep(3000);
            LoginPage loginPage = new LoginPage(driver);
            loginPage.doRegist(name,email,pass);
            Thread.sleep(5000);
            UsersMainPage mainPage = new UsersMainPage(driver);
            mainPage.logout();
            Thread.sleep(3000);
            mainPage.login();
            Thread.sleep(3000);
            loginPage.authorize(email,pass);
            Thread.sleep(3000);
            driver.quit();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}