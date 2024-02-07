import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
//import java.util.ArrayList;
//import java.util.List;

public class SpDirHoodiesTest {
    private final By ACCEPT_COOKIE_BTN = By.xpath("//button[@id = 'onetrust-accept-btn-handler']");
    private final By KIDS_WEAR = By.id("lnkTopLevelMenu_3877014");
    private final By HOODIES = By.xpath("//div[@class = 'swiper-slide swiper-slide-visible']");
    private final By PRICES = By.xpath("//div [@class  = 'mobAppliedFilters visible-xs visible-sm']");
    // private final By PRICES_LOW_TO_HIGH = By.xpath("//span = [ 'Price (Low To High)']");


    @Test
    public void shoppingHoodiesCartCheck() {
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://www.sportsdirect.com");
       // WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));
       // wait.until(ExpectedConditions.presenceOfElementLocated(KIDS_WEAR));
        //find element
        WebElement acceptBtn = browser.findElement(ACCEPT_COOKIE_BTN);
        WebElement kidsWear = browser.findElement(KIDS_WEAR);
        WebElement hoodies = browser.findElement(HOODIES);
        WebElement prices = browser.findElement(PRICES);
        // WebElement pricesLowToHigh = browser.findElement(PRICES_LOW_TO_HIGH);

        acceptBtn.click();
        kidsWear.click();
        hoodies.click();
        prices.click();

    }
}

// pricesLowToHigh.click();



   //  public WebElement getPrices() {
    //    return prices;
   // }
//      List <double> pricesLowToHigh = new ArrayList < pricesLowToHigh  > ();


     //   for (double p = 0 ; p < = pricesLowToHigh.size(); p = p ++);
    //    boolean is 25 <= pricesLowToHigh <= 35;
     //   {
    //        System.out.println(pricesLowToHigh.get(25 <= pricesLowToHigh <= 35));
     //   }



   // }


