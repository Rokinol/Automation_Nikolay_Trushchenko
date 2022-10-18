package lecture5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Calculation {
    WebDriver driver;

    @BeforeTest
    public void preconditions() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://masterskayapola.ru/kalkulyator/laminata.html");
    }
    @Test
    public void test1() {
        WebElement calcRoomWidth = driver.findElement(By.name("calc_roomwidth"));
        calcRoomWidth.click();
        calcRoomWidth.clear();
        calcRoomWidth.sendKeys("5");

        WebElement calcRoomHeight = driver.findElement(By.name("calc_roomheight"));
        calcRoomHeight.click();
        calcRoomHeight.clear();
        calcRoomHeight.sendKeys("5");

        WebElement calculation = driver.findElement(By.xpath("//input[@value='Рассчитать']"));
        calculation.click();
    }
    private void pause(Integer timeout) {
        try {
            Thread.sleep(timeout * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
