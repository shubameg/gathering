package fun_pkg;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fun_cls {

	public static void main(String[] args) throws Exception{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://www.google.com/");
		 //Step 1) Convert web driver object to TakeScreenshot
		 TakesScreenshot scrShot =((TakesScreenshot)driver);
		 //Step 2) Call getScreenshotAs method to create image file
		 File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		 //Step 3) Move image file to new destination
		 File destFile = new File("C:\\workspace_forjava\\com.fun\\ssfolder\\ssf1.png");
		 //Copy file at destination
		 FileUtils.copyFile(SrcFile, destFile);    


	}

}
