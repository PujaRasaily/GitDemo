package SeleniumJunePractice2025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment8autosuggestiveDropDwon {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qaclickacademy.com/practice.php");
		driver.findElement(By.id("autocomplete")).sendKeys("uni");
		Thread.sleep(3000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));

		for (WebElement OneOption : options) {
			if (OneOption.getText().equalsIgnoreCase("United Kingdom (UK)")) {
				OneOption.click();
				break;
			}

		}
	}

}
