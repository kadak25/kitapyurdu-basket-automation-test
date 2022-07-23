package Base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class BasePage extends BaseTest {
    WebDriver driver;
    WebDriverWait webDriverWait;

    public BasePage(WebDriver driver) {
        this.driver = driver;

    }

    public void goUrl(String url) {
        driver.get(url);
    }

    public String currentUrl() {
        return driver.getCurrentUrl();
    }

    public void pressEnter(By by) {
        driver.findElement(by).sendKeys(Keys.ENTER);
    }

    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    public void click(By by) {
        findElement(by).click();

    }

    public void enter(By by) {
        findElement(by).sendKeys(Keys.ENTER);
    }

    public void sendKeys(By by, String text) {
        findElement(by).clear();
        findElement(by).sendKeys(text);
    }

    public List<WebElement> listElements(By by) {
        return driver.findElements(by);
    }

    public void scrollToElement(By by) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", findElement(by));

    }

}






