
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com");

        TakesScreenshot screenshotDriver = (TakesScreenshot) driver;
        File screenshot = screenshotDriver.getScreenshotAs(OutputType.FILE);

        File destinationFile = new File("C:\\path\\to\\screenshot.png");
        try {
            FileUtils.copyFile(screenshot, destinationFile);
            System.out.println("Screenshot saved to: " + destinationFile.getAbsolutePath());
        } catch (IOException e) {
            System.out.println("Failed to save screenshot!");
            e.printStackTrace();
        }

        driver.quit();
    }
}
