package pageobject;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjecPages.HomePage;

public class InternetShopPagesTest {
    @Test
    public void testOnPages() {
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openURL("1a.1lv");

        HomePage homePage = new HomePage(baseFunc);
        homePage.acceptCookies();
       // homePage.selectMenuItem("Instrumenti");
    }
}




