import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class MultipleWindows {
	
	    public static void main(String[] args) {
	    	
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.example.com");
	        WebElement link = driver.findElement(By.linkText("Open New Window"));
	        link.click();
	        Set<String> windowHandles = driver.getWindowHandles();
	        Iterator<String> windowIterator = windowHandles.iterator();
	        while (windowIterator.hasNext()) {
	            String windowHandle = windowIterator.next();
	            driver.switchTo().window(windowHandle);

	            if (driver.getTitle().equals("New Window")) {
	                WebElement newWindowLink = driver.findElement(By.linkText("Click Here"));
	                newWindowLink.click();

	                try {
	                    Thread.sleep(5000);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }

	                driver.close();
	            }
	        }

	        driver.switchTo().window(windowHandles.iterator().next());

	        driver.close();
	    }
	}

