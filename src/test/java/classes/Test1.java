package classes;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class Test1 {
	
	@Test
	public void method() throws Exception {
		
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://shop.polymer-project.org/");
		driver.manage().window().maximize();
		// full page screenshot
		AShot as = new AShot();
		ShootingStrategy shs = ShootingStrategies.viewportPasting(1000);
		Screenshot ss = as.shootingStrategy(shs).takeScreenshot(driver);
		File dest = new File("target/fullpagescreenshot.png");
		ImageIO.write(ss.getImage(), "PNG", dest);
		
	} 

}
