package hashtag;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class hashtag_applicationpage {

	public static void main(String[] args) throws IOException, AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\com\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,400)");

	List<WebElement> element = driver.findElements(By.tagName("a"));
	for( WebElement eachlink : element) {
		System.out.println(eachlink.getText());
	}
	 
	driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Sampada Rehpade");
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rrehpade23@gmail.com");
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9284278352");
driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("I m Tester having 3 years of experience in automation and manual");
driver.findElement(By.xpath("//input[@id='inputFile']")).sendKeys("C:\\Users\\com\\Desktop\\Sampada Rehpade_CV.docx");
  
	driver.findElement(By.xpath("//button[@class='btn form-button font-12 font-bold']")).click();
	
	}


}


