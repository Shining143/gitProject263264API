package classes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test4 {
	
	@Test
	public void method() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("ahmad");
		driver.findElement(By.id("pass")).sendKeys("12345");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.id("not_me_link")).click();
		driver.findElement(By.id("email")).sendKeys("Raja");
		driver.findElement(By.id("pass")).sendKeys("1234");
		driver.findElement(By.xpath("//a[@rel='nofollow']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Ravi");
	}

}
