package com.AmazonPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonLogin {

	public static WebDriver driver;
	public static Properties proFile;

	public void PageLaunch() {

		propFile();
		String BrowserName = proFile.getProperty("BrowserName");

		if (BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\WebDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (BrowserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\WebDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.edge.driver", "src\\main\\resources\\WebDrivers\\edgedriver.exe");
		}
		driver.get(proFile.getProperty("url"));
	}

	public void propFile() {

		proFile = new Properties();

		try {
			proFile.load(new FileInputStream("src\\main\\resources\\Prop.properties"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
