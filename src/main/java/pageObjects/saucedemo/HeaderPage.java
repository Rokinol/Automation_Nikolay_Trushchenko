package pageObjects.saucedemo;

import org.openqa.selenium.By;
import pageObjects.saucedemo.BasketPage;

public class HeaderPage extends BasketPage {

    By basketBtn = By.className("shopping_cart_link");
    By navigationBtn = By.id("react-burger-menu-btn");

    public void clickBasketBtn() {
        click(basketBtn);
    }

    public void clickNavigationBtn() {
        click(navigationBtn);
    }
}
