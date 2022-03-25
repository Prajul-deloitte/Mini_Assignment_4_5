import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver;
    LoginPage login;
    String url = "https://www.saucedemo.com/";

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\prajchaudhary\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
    }

    @Test(priority = 1)
    public void validateLogin(){
        login = new LoginPage(driver);
        login.enterUsername();
        login.enterPassword();
        login.clickLogin();

    }
}
