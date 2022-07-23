package Pages;

import Base.BasePage;
import Base.BaseTest;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import static Constants.Constants.*;

public class Homepage extends BasePage {
    public Homepage(WebDriver driver) {
        super(driver);
    }

    public Homepage goToHomePage() {
        goUrl(URL);
        return this;
    }

    public Homepage validateHomePage() {
        String title = BaseTest.driver.getTitle();
        System.out.println("Page Title" + title);
        Assert.assertTrue(title.contains("Kitapyurdu,"));
        return this;

    }


    public Homepage search() throws CsvValidationException, IOException {
        click(SEARCH_BOX);
        String CSVfile = "CSVdatafiles/books_new.csv";
        CSVReader reader = new CSVReader(new FileReader(CSVfile));
        String[] cell;
        while ((cell = reader.readNext()) != null) {
            for (int i = 0; i < 1; i++) {
                String type = cell[i + 1];
                sendKeys(SEARCH_BOX, type);
            }
        }
        enter(SEARCH_BOX);

        return this;
    }


    public Homepage randomProductSelect() {
        List<WebElement> links = listElements(PRODUCT_LIST);
        int number = new Random().nextInt(links.size());
        links.get(number).getText();
        links.get(number).click();
        findElement(DETAIL_NAME).getText();
        return this;
    }

    public Homepage addToBasket() {
        click(ADD_TO_CART);
        return this;
    }

    public boolean isProductCountUp() {
        return getCartCount() > 0;
    }


    private int getCartCount() {
        String count = findElement(CART_COUNT).getText();
        return Integer.parseInt(count);
    }

    public Homepage goToBasketDropdown() {
        click(CART_COUNT);
        return this;
    }

    public Homepage goToBasket() {
        click(GO_BASKET_BUTTON);
        return this;
    }

    public Homepage increaseProductCount() {
        click(PRODUCT_COUNT_INCREASE);
        sendKeys(PRODUCT_COUNT_INCREASE, "1");
        return this;
    }

    public Homepage refreshCart() {
        click(REFRESH_BUTTON);
        return this;
    }

}