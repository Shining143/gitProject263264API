package classes;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test
	public void method() {
		
	RemoteWebDriver driver = new ChromeDriver();
	driver.get("https://shop.polymer-project.org/");
	driver.manage().window().maximize();
	// take screenshot
	try {
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File targetfile = new File("target/screenshot.png");
		FileUtils.copyFile(screenshotFile, targetfile);
		System.out.println("screenshot saved to "+targetfile.getAbsolutePath());
		
	}catch(Exception ex) {
		ex.printStackTrace();
	}


}

}
