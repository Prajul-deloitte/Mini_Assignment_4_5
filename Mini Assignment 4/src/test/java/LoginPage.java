import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
    WebDriver driver;
    By userName = By.xpath("//*[@id='user-name']");
    By password = By.xpath("//*[@id='password']");
    By loginButton = By.xpath("//*[@id='login-button']");
    String usName = "standard_user";
    String pass = "secret_sauce";

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void enterUsername(){
        WebElement element1 = driver.findElement(userName);
        element1.sendKeys(usName);
    }

    public void enterPassword(){
        WebElement element2 = driver.findElement(password);
        element2.sendKeys(pass);
    }

    public void clickLogin(){
        WebElement button = driver.findElement(loginButton);
        button.click();
    }

}
