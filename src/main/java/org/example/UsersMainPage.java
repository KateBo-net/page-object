package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsersMainPage {
    private WebDriver driver = null;

    public UsersMainPage(WebDriver driver){
        this.driver = driver;
    }


    public void logout(){
        try {
            JavascriptExecutor js = (JavascriptExecutor)driver;
            Thread.sleep(3000);
            js.executeScript("document.querySelector('#fat-menu> ul').setAttribute('style', 'display: block')");
            Thread.sleep(2000);
            WebElement dpdwMenu = driver.findElement(By.xpath("//a[text()='Выход']"));
            dpdwMenu.click();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public void login(){
        WebElement loginBttn = driver.findElement(By.xpath("//span[text()='Войти']/.."));
        loginBttn.click();
    }
}
