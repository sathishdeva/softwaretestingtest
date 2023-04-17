import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowserTesting {
    
    public static void main(String[] args) {
        
        String chromeDriverPath = "C:/webdriver/chromedriver.exe";
        String firefoxDriverPath = "C:/webdriver/geckodriver.exe";
        String ieDriverPath = "C:/webdriver/IEDriverServer.exe";
        
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.example.com");
        chromeDriver.quit();
        
        System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
        WebDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("https://www.example.com");
        firefoxDriver.quit();
        
        System.setProperty("webdriver.ie.driver", ieDriverPath);
        WebDriver ieDriver = new InternetExplorerDriver();
        ieDriver.get("https://www.example.com");
        ieDriver.quit();
    }
}
