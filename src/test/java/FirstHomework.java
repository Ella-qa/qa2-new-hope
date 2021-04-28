import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstHomework {
    private final By LOCATOR_BY_ID = By.id("elementId");
    private final By LOCATOR_BY_NAME = By.name("elementName");
    private final By LOCATOR_BY_TAGNAME = By.tagName("nameOfTag");
    private final By LOCATOR_BY_CLASS = By.className("elementClassName");
    private final By LOCATOR_BY_XPATH = By.xpath(".//*[contains(@class, 'list=article__meta-info flex')]");
    private final By ARTICLE_LIST = By.className("list-article__url");
    private final By ARTICLE_HEADLINE_NAME = By.xpath("//span[@class='list-article__headline'][1]/text()");


    private final By ACCEPT_COOKIES_BTN = By.xpath(".//button[@mode = 'primary']");

    @Test
    public void firstTest() {
        //WebDriver = browser window
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver browserWindow = new ChromeDriver();
        browserWindow.manage().window().maximize();
        browserWindow.get("http://tvnet.lv");


        //  Thread.sleep(10000);

        WebDriverWait wait = new WebDriverWait(browserWindow, 10);
        WebDriverWait mailWait = new WebDriverWait(browserWindow, 60, 2000);

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(ACCEPT_COOKIES_BTN));

        WebElement acceptBtn = browserWindow.findElement(ACCEPT_COOKIES_BTN);
        acceptBtn.click();


    }




}
