package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
    public static Properties prop;
    String path = System.getProperty("user.dir");
    
    public BaseClass() throws IOException {
    	prop = new Properties();
    	FileInputStream fs = new FileInputStream(path+"\\src\\main\\java\\config\\config.properties");
    	prop.load(fs);
    }
    
    @SuppressWarnings("deprecation")
	public static void initialization() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
    }

}
