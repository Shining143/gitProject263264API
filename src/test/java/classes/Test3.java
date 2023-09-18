package classes;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Test3 {
	
	@Test
	public void method() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement login = driver.findElement(By.name("login"));
		// screen shot of the element
		File dest = new File("target/elementpic.png");
		File src = login.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, dest);
		
	}

}
