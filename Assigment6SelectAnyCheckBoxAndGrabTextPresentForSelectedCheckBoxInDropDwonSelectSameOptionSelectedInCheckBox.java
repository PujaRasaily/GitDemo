package SeleniumJunePractice2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment6SelectAnyCheckBoxAndGrabTextPresentForSelectedCheckBoxInDropDwonSelectSameOptionSelectedInCheckBox {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.qaclickacademy.com/practice.php");

		// click on radio button
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]/input")).click();
		// getText of radio button
		String option = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]")).getText();

		// select option
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select select = new Select(dropdown);
		select.selectByVisibleText(option);

		// send option into alert box
		driver.findElement(By.name("enter-name")).sendKeys(option);

		// click on alert button
		driver.findElement(By.id("alertbtn")).click();

		// get Text of Alert
		System.out.println(driver.switchTo().alert().getText());

		// validation
		String alertText = driver.switchTo().alert().getText();
		if (alertText.contains(option)) {
			System.out.println("Alert Message sucess");

		} else {
			System.out.println("Something wrong with execution");
		}

	}

}
