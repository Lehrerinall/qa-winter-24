import org.openqa.selenium.By;

public class InternetManySitesTests {
    //Amazon.de locators
    private final By MAIN_LOGO_AMAZON = By.id("nav-logo-sprites");
    private final By MENU_ALL = By.id("nav-hamburger-menu");
    private final By SEARCH_FIELD_AMAZON_DE = By.id("twotabsearchtextbox");
    private final By ACCOUNT_LIST_BANNER = By.xpath(".//div[@class = nav-line-1-container']");
    private final By BASKET_BANNER = By.id("nav-cart");
    private final By CAROUSEL_BUTTON = By.id("a-carousel-goto-nextpage");
    private final By TOP_DEALS = By.xpath(".//div[@class = 'a-cardui deal-of-the-day']");

    //1a.lv locators
    private final By MAIN_LOGO = By.xpath(".//a[@class = 'main-logo']");
    private final By SMART_NET_LOGO = By.xpath(".//img[@class = 'smart-net-banner__logo']");
    private final By PRODUCTS_CATALOG = By.xpath(".//div[@class = 'main-menu__content main-menu__content--index']");
    private final By PRODUCT_RECEIPT_POINTS = By.xpath(".//a[@class = 'site-top__menu-right-link']");
    private final By LANGUAGE_SWITCHER = By.xpath(".//[li@class = 'site-top__menu-right-item language-switcher']");
    private final By PRODUCT_SEARCH = By.xpath(".//i[@class = 'main-search-submit__icon icon-svg']");
    private final By PRODUCT_BASKET = By.xpath(".//a[@class = 'cart-block__handle']");
    private final By SMART_NET_BANNER_GIFT = By.xpath(".//img.[contains @class='smart_net/banner-icon-gift']");

    //booking.com locators
    private final By MAIN_LOGO_BOOKING = By.id("b2indexPage");
    private final By BOOKING_COM = By.xpath(".//a[data-testid = 'header-booking-logo']");
    private final By EUR = By.xpath(".//span(@class = 'e4adce92df']");
    private final By HOTEL_FIND = By.xpath(".//span[@class = eedba9e88a']");
    private final By MY_PROFILE = By.xpath(".//span[@class = e4adce92df']");
    private final By NEXT_HOTEL_SEARCH = By.xpath(".//li[@class = 'f49c3e3e97']");
    private final By REGISTRATION_DATE = By.xpath(".//span[@class = 'f73e6603bf']");
    private final By AIRPORT = By.xpath(".//a[id = 'airport_taxis']");

    //Google locators
    private final By MAIN_GOOGLE_SEARCH_WINDOW = By.xpath(".//div[@class ='RNNXgb']");
    private final By GOOGLE_SEARCH_WWW = By.xpath(".//span[class = 'xTFaxe z1asCe']");
    private final By TOOLS_IMAGE = By.xpath(".  div[@class = 'c58wS']");
    private final By COME_IN_BUTTON = By.xpath(".//a[@class = 'gb_va gb_fd gb_Hd gb_ge']");
    private final By RESULTS_ISSUANCE_SPEED = By.xpath(".//div[@id= 'result-stats']");
    private final By GOOGLE_PAGE_INFO = By.xpath(".//div[@class = 'I6TXqe']");
    private final By MAIN_SEARCH_BUTTON = By.xpath(".//div[@class = 'zgAlFc']");
    private final By MAPS_BUTTON = By.xpath(".//a[@class = 'LatpMc nPDzT T3FoJb']");
    private final By SETTINGS_IN_TOP_FEED = By.xpath(".//div[@id = 'hdtb-tls']");
}



