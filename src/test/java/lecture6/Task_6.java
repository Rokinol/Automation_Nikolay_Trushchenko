package lecture6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task_6 {
    WebDriver driver;

    @BeforeTest
    public void preconditions() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/");
    }

    @Test
    public void test1() {
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.click();
        userName.sendKeys("standard_user");

        WebElement password = driver.findElement(By.name("password"));
        password.click();
        password.sendKeys("secret_sauce");

        WebElement login = driver.findElement(By.id("login-button"));
        login.click();

        WebElement backpack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        backpack.click();

        WebElement cart = driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a"));
        cart.click();


        driver.findElement(By.xpath("//a[@id='item_4_title_link']/div")).isDisplayed();
        driver.findElement(By.className("inventory_item_price")).isDisplayed();

    }
}
