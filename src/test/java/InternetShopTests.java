//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.v85.dom.model.ShapeOutsideInfo;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//import java.util.ArrayList;
//import java.util.List;
//
//public class InternetShopTests {
//    private final By ACCEPT_COOKIE_BTN =By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
//   // private final  By MENU = By.xpath(".//a[contains(@class, submenu-lvl1__list-item--has child']/a");
//    private final By MEN = By.xpath(".//div[contains(@class 'submenu-lvl1__list-item--index']");
//    private final String SECTION = "Instrumenti";
//
//    @Test
//    public void productPresenceInCartCheck() {
//        WebDriver browser = new ChromeDriver();
//        browser.manage().window().maximize();
//        browser.get("http://1a.lv");
//        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));
//
//        wait.until(ExpectedConditions.presenceOfElementLocated(ACCEPT_COOKIE_BTN));
//        //find element
//       WebElement acceptBtn =  browser.findElement(ACCEPT_COOKIE_BTN);
//
//        //click on this element
//     //   acceptBtn.click();
//
//        //Find all sections
//        //Find necessary section (Instrumenti)
//        //Click on it
//     //   WebElement menuBlock = browser.findElement(MEN);
//       // List<WebElement> items = browser.findElements(MENU);
//
//        //sozdajom peremennuju is...dlja proverki - nasli ili net.
//     //   boolean isSectionFound = false;
//    //    for (WebElement we : menuBlock) {
//           // System.out.println(we.getText());
//
//      //    if (we.getText().equals(SECTION)) {
//      //      wait.until(ExpectedConditions.elementToBeClickable(we));
//      //        isSectionFound = true;
//     //      we.click();
//
//
//      //     //esli nashli nuznij element,to:
//     //     break;
//      //        System.out.println(SECTION);
////
//              //false
//         }
//           // Assertions.assertTrue (isSectionFound, m: "Section not found");
//         // Assertions.assertTrue(isSectionFound, );
//        }
//        //WebElement menuBlock  = browser.findElement(MEN);
//        //List<WebElement> = menuBlock.findElement( );
//       // for (WebElement we : menuBlock {
//         // if (we.getText()
//       // Assertions.assertTrue (isSectionFound, message: "Section not found");
//                    }
//
// //   @Test
//  //  public void workinWithLists() {
//
// //       List<String> names = new ArrayList<>();
// //       names.add("Dmitry");
////        names.add("Laura");
// //       names.add("Vitalijs");
// //       names.add("Inna");
// //       names.add("Anna");
//
// //       //----------FOR---------------
// //       //        from   to      step
// //       for (int i = 0; i <  names.size(); i ++) {
// //           System.out.println("The name number" + (i + 1) + "is" + names.get(i));
////        }
//
// //       //----------FOREACH------------
//
//
// //       for (String name : names) {
//   //         System.out.println(name);
//
// //       }
// //      //  System.out.println(names.isEmpty());
//
//       // System.out.println(names.size());
//       // System.out.println(names.get(2));
//
// //   }
//
////}
