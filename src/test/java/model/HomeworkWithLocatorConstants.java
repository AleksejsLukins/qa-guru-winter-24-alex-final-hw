package model;

import org.openqa.selenium.By;

public class HomeworkWithLocatorConstants {
    //google.com locators
    private final By SEARCH_FIELD = By.className("RNNXgb");
    private final By GEAR_BTN = By.className("z1asCe E9hVAb");
    private final By USER_ICON_BTN = By.className("gb_d gb_za gb_C");
    private final By MORE_BTN = By.className("CcNe6e");
    private final By TOOLS_BTN = By.id("hdtb-tls");
    private final By SEARCH_RESULTS_STATS = By.id("result-stats");
    private final By DOTS_BTN = By.xpath("//*[@id='rso']/div[1]/div/div/div[1]/div/div/div/div[2]/div/div/span/span");
    private final By ACCEPT_COOKIES_BTN = By.className("osrp-blk");
    //amazon.de locators
    private final By AMAZON_LOGO_BTN = By.id("nav-logo-sprites");
    private final By SEARCH_BAR = By.id("nav-search-bar-form");
    private final By ACCOUNT_BTN = By.id("nav-link-accountList");
    private final By CART_BTN = By.id("nav-cart");
    private final By HAMBURGER_MENU_BTN = By.id("nav-hamburger-menu");
    private final By RIGHT_BULLET_BTN = By.className("a-icon a-icon-next-rounded");
    private final By TOP_DEALS_BTN = By.className("a-cardui deal-of-the-day");
    //booking.com locators
    private final By LOGO_BTN = By.xpath("//span[@data-testid='header-logo']");
    private final By CURRENCY_BTN = By.xpath("//button[@data-testid='header-currency-picker-trigger']");
    private final By NOTIFICATION_BTN = By.xpath("//*[@id='b2indexPage']/div[3]/div/header/nav[1]/div[2]/span[4]/span/button/span/div/span");
    private final By GENIUS_LEVEL = By.xpath("//*[@id='b2indexPage']/div[3]/div/header/nav[1]/div[2]/div/span/button/span/div/div[2]/div[2]/div/span");
    private final By TAXI_BTN = By.id("airport_taxis");
    private final By WHERE_TO_HEADLINE = By.xpath("//*[@id='indexsearch']/div[1]/div/div/div/div/header/h1/span");
    private final By CALENDAR_PICKER = By.xpath("//*[@id='indexsearch']/div[2]/div/form/div[1]/div[2]");
    private final By SEARCH_BTN = By.xpath("//*[@id='indexsearch']/div[2]/div/form/div[1]/div[4]");
    private final By WORK_TRAVEL = By.xpath("//*[@id='indexsearch']/div[2]/div/form/div[2]/div[2]/label");
    private final By COVID_AWARENESS_MESSAGE = By.id(""); //missing on my booking page
    private final By RECENT_SEARCHES = By.className("bui-title__text");
    //1a.lv locators
    private final By BUSINESS_OFFER_BTN = By.id(""); //missing on my page
    private final By DELIVERY_POINTS_BTN = By.xpath("/html/body/div[2]/div[1]/div/ul/li[1]/a");
    private final By LANGUAGE_SWITCHER_BTN = By.className("site-top__menu-right-item language-switcher"); // two languages under locator
    private final By MAIN_LOO_BTN = By.xpath("/html/body/div[2]/div[2]/div[1]/div/div/a");
    private final By SHOP_SEARCH_BTN = By.className("main-search__submit");
    private final By SHOP_CART_BTN = By.className("cart-block__icon icon-svg");
    private final By SMART_NET_BTN = By.className("smart-net-banner__logo");
    private final By GIFT_BTN = By.xpath("/html/body/div[2]/div[2]/a/div/div[2]/img[2]");
    private final By BURGER_MENU = By.className("main-menu__handle-icon icon-svg");
}