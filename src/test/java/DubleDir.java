import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DubleDir {
   // private final By ACCEPT_COOKIE = By.xpath("//button[@id = 'onetrust-accept-btn-handler']");
   // private final By KIDS = By.xpath("//li[@class = 'mmHasChild root AppTab AppSplash multicolumn MenuGroupKids promoEnabled']");

    private final By HOODIES = By.xpath("//div[@class 'swiper-slide swiper-slide-visible']");



    @Test
    public void productDirectCheck(){
        WebDriver browser = new ChromeDriver();
        browser.get("https://www.sportsdirect.com");
       //WebElement acceptBtn = browser.findElement(ACCEPT_COOKIE);
        // WebElement kidsWear = browser.findElement(KIDS);
        WebElement hoodies = browser.findElement(HOODIES);

        //acceptBtn.click();
        //kidsWear.click();
        hoodies.click();

    }

}

