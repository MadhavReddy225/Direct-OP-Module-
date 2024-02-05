package Direct.Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordsImpl implements Keywords {
	
	ChromeDriver driver;
		FileInputStream fis;
		Properties prop;  
		
	public void open() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium libraries\\chromedriver (2).exe");
		try {
			fis = new FileInputStream("C:\\code\\Direct_test\\src\\main\\java\\Direct\\Base\\ObjectRespositry.properties");
			prop = new Properties();
			prop.load(fis);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(61, TimeUnit.SECONDS);
	}

	public void url(String urlLink) {
		driver.get(urlLink);
		
	}

	public void input(String data, String keyName) {
		driver.findElement(By.xpath(prop.getProperty(keyName))).sendKeys(data);
	}

	public void click(String keyName) {
		driver.findElement(By.xpath(prop.getProperty(keyName))).click();
		
	}

	public String verifyTitle() {
		String actualValue = driver.getTitle();
		return actualValue;
	}

	public String verifyPageText(String objectName) {
		String actualValue = driver.findElement(By.xpath(prop.getProperty(objectName))).getText();
		return actualValue;
	}

	public void close() {
		driver.close();
		
	}
    

	}


	


		

			
