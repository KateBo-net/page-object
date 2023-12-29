package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    private WebDriver driver = null;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

public void doRegist(String name, String email, String pass){
    WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
    WebElement passwordInput = driver.findElement(By.xpath("//input[@required][@name='password']"));
    WebElement nameInput = driver.findElement(By.xpath("//input[@name='name']"));
    WebElement registBttn = driver.findElement(By.xpath("//input[@value='Зарегистрироваться']"));
    try {
        nameInput.sendKeys(name);
        Thread.sleep(1000);
        emailInput.sendKeys(email);
        Thread.sleep(1000);
        passwordInput.sendKeys(pass);
        Thread.sleep(1000);
        registBttn.click();

    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

}
public void authorize (String email, String pass){
    WebElement loginInput = driver.findElement(By.xpath("//input[@name='login']"));
    WebElement passwordLoginInput = driver.findElement(By.xpath("//input[@value='Авторизоваться']/../../../tr/td/input[@name='password']"));
    WebElement authBttn = driver.findElement(By.xpath("//input[@value='Авторизоваться']"));

    try {
        loginInput.sendKeys(email);
        Thread.sleep(1000);
        passwordLoginInput.sendKeys(pass);
        Thread.sleep(1000);
        authBttn.click();

    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

}


}
