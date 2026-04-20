package Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//ChromeDriver driver=new  ChromeDriver();-->will not work on other browser
		System.setProperty("webdriver.chrom.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");//SeleniumManager will not be in active state
		WebDriver driver=new ChromeDriver();
		
		
		
	System.out.println("Updated code for Git");
		}

}
