import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

    public static void main(String[] args) {
        String filePath = "C:\\path\\to\\file.txt";
        
        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com/upload");

        WebElement fileInput = driver.findElement(By.id("file-upload"));
        fileInput.sendKeys(filePath);

        WebElement submitButton = driver.findElement(By.id("submit-button"));
        submitButton.click();
        
        WebElement successMessage = driver.findElement(By.id("upload-success"));
        if (successMessage.isDisplayed()) {
            System.out.println("File upload successful!");
        } else {
            System.out.println("File upload failed!");
        }

        driver.quit();
    }
}
