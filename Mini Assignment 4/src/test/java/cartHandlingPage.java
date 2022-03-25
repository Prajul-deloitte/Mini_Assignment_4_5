import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class cartHandlingPage {


    List<WebElement> list_of_products_price = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));
    int int_product_price;
}
