package Constants;

import org.openqa.selenium.By;

public class Constants {
    public static final String URL = "https://www.kitapyurdu.com/";
    public static final By SEARCH_BOX = By.xpath("//input[@id='search-input']");
    public static final By PRODUCT_LIST = By.className("product-cr");

    public static final By DETAIL_NAME = By.className("product-info");
    public static final By ADD_TO_CART = By.id("button-cart");
    public static final By CART_COUNT = By.id("cart-items");
    public static final By GO_BASKET_BUTTON = By.id("js-cart");
    public static final By PRODUCT_COUNT_INCREASE = By.xpath("(//input[@name='quantity'])");
    public static final By REFRESH_BUTTON = By.xpath("//i[@title='Güncelle']");
    public static final By REFRESH_TITLE = By.id("swal2-title");
    public static final By REFRESH_TITLE_CLOSE = By.xpath("//button[normalize-space()='×']");



}
