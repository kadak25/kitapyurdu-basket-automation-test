package Tests;

import Base.BaseTest;
import Pages.Homepage;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class HomepageTest extends BaseTest{
    Homepage homepage;
    @Before
    public void beforeTest() { homepage = new Homepage(getDriver());
    }
    @Test
    public void homePageTest() throws CsvValidationException, IOException {
        homepage.goToHomePage().validateHomePage().search().randomProductSelect().addToBasket().isProductCountUp();
        homepage.goToBasketDropdown().goToBasket().increaseProductCount().refreshCart();
    }
}