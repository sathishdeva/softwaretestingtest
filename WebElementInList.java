import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementInList {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com/elements");

        List<WebElement> elements = driver.findElements(By.className("my-class"));

        for (WebElement element : elements) {
            System.out.println(element.getText());
        }
        driver.quit();
    }
}
