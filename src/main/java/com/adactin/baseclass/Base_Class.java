package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	
	// initialize the driver

		public static WebDriver driver; // null driver

		public static WebDriver getDriver(String browserName) {

			try {

				if (browserName.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver","C:\\Users\\vjoth\\eclipse-workspace\\AdactinCucumber\\Driver\\chromedriver.exe");
							//System.getProperty("");
					driver = new ChromeDriver();
				} else if (browserName.equalsIgnoreCase("ie")) {
					System.setProperty("webdriver.ie.driver", 
							System.getProperty("user.dir")+"\\Driver\\ieDriveServer.exe");
					driver = new InternetExplorerDriver();

				} else if (browserName.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.geckodriver.driver", "C:\\Training\\Driver\\geckodriver.exe");
					driver = new FirefoxDriver();
				} else {
					System.out.println("INVALID BROWSER");
				}
				driver.manage().window().maximize();

			} catch (Exception e) {

				e.printStackTrace();
			}

			return driver;
		}

		public static void navigateto(String url) {
			try {
				driver.navigate().to("url");
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		public static void navigateback() {
			try {
				driver.navigate().back();
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		public static void navigateforward() {
			try {
				driver.navigate().forward();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public static void navigaterefresh() {
			try {
				driver.navigate().refresh();
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		public static void getUrl(String url) {
			try {
				driver.get(url);
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		public static void getTitle() {
			try {
				driver.getTitle();
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		public static void getAttribute(By bySearchButton) {
			WebElement element = driver.findElement(bySearchButton);
			System.out.println(element);

		}

		public void getCurrentUrl(String Currenturl) {
			try {
				driver.getCurrentUrl();
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		public static void getText(WebElement element, String text) {
			try {
				element.sendKeys(text);
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		public static void dropDownSelection(WebElement element, String option, String value) throws Exception {
			/*Select s = new Select(element);
			if (option.equals("index")) {
				int parseInt = Integer.parseInt(input);
				s.selectByIndex(parseInt);
			} else if (option.equals("value")) {
				s.selectByValue(input);
			} else if (option.equals("text")) {
				s.selectByVisibleText(input);
			}*/
			
			Select s = new Select(element);
			if	(option.equalsIgnoreCase("index")) {
				s.selectByIndex(Integer.parseInt(value));
			}
				else if(option.equalsIgnoreCase("value")) {
				s.selectByValue(value);
			}else if (option.equalsIgnoreCase("visibletext")) {
				s.selectByVisibleText(value);
			} 
			
			
			}
		

		// ***click on element
		public static void clickOnElement(WebElement element) {
			element.click();
		}

		// ****sendkeys
		public static void inputValueElement(WebElement element, String inputvalue) {
			element.sendKeys(inputvalue);
		}

		public static void isEnabled(WebElement element) {
			try {
				element.isEnabled();
			} catch (Exception e) {
			}
		}

		public static void isDisplayed(WebElement element) {
			element.isDisplayed();
		}

		public static void isSelected(WebElement element) {
			element.isSelected();
		}

		public static void simplealert() {
			try {
				Alert simplealert = driver.switchTo().alert(); // take return type
				simplealert.accept();
			} catch (Exception e) {

				e.printStackTrace();
			}

		}

		public static void confirmalert() {
			try {
				Alert confirmalert = driver.switchTo().alert();
				confirmalert.accept();
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		public static void promptalert() {
			try {
				Alert promptalert = driver.switchTo().alert();
				promptalert.accept();
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		public static void quit() {
			try {
				driver.quit();
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		public static void close() {
			try {
				driver.close();
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		public static void dragdrop(WebElement drag, WebElement drop) {
			try {
				Actions ac = new Actions(driver);
				ac.dragAndDrop(drag, drop).build().perform();
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		public static void action(WebElement element) {
			Actions ac = new Actions(driver);
			ac.moveToElement(element);

		}

		public static void frames(WebElement iframe) {
			iframe.click();
			driver.switchTo().frame(0);
		}

		

	//******SCREENSHOT
		public static void screenshot(String path) throws IOException {
			try {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File Source = ts.getScreenshotAs(OutputType.FILE);
				File destination = new File("C:\\Training\\Screenshot\\gmail.png"); //copy the path
				FileUtils.copyFile(Source, destination);
			} catch (WebDriverException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//*****IMPLICIT WAIT
			public static void impwait() {
				try {
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				}
			
			//*****EXPLICIT WAIT
			public static void expwait(WebElement element)
			{
				try {
					WebDriverWait wait=new WebDriverWait(driver,20);
					wait.until(ExpectedConditions.visibilityOf(element));
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			}
			//public static void fluentwait()
			//FluentWait wait=new FluentWait(driver).withTimeout(30,Timeunit.seconds);
			
			public static void windowshandling()
			{
				try {
					driver.getWindowHandle();
				} catch (Exception e) {
				
					e.printStackTrace();
				}
			}
			//*****ROBOT ACTIONS
			public static void keyboard(WebElement element, String type) throws AWTException {
				Robot r = new Robot();
				if (type.equalsIgnoreCase("down")) {
					r.keyPress(KeyEvent.VK_DOWN);
					r.keyRelease(KeyEvent.VK_DOWN);
				} else if (type.equalsIgnoreCase("up")) {
					r.keyPress(KeyEvent.VK_UP);
					r.keyRelease(KeyEvent.VK_UP);
				} else if (type.equalsIgnoreCase("enter")) {
					r.keyPress(KeyEvent.VK_ENTER);
					r.keyRelease(KeyEvent.VK_ENTER);
				}
			}
			public static void getSelected(WebElement select)
			{
				Select select1=new Select(driver.findElement(By.xpath("//select")));
				WebElement option=select1.getFirstSelectedOption();
				String defaultItem=option.getText();
				System.out.println(defaultItem);
			}

}
