package BAParameterAutomation;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.openqa.selenium.JavascriptExecutor;
import objectRepository.ObjectRepositary;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Baseclass {
	static WebDriver driver;
	public static String folderName;

	public static void browserInitilization(String browser) {

		if (browser.equalsIgnoreCase("firefox")) {
			// System.setProperty("webdriver.gecko.driver", ".\InputData\geckodriver.exe");
			// FirefoxOptions options=new FirefoxOptions();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		} else if (browser.equalsIgnoreCase("chrome")) {
			try {
			System.out.println("hiiiiiiiii");
			ChromeOptions options = new ChromeOptions();
			options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
			options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			options.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
			options.addArguments("--ignore-certificate-errors");


				options.addArguments("--remote-allow-origins=*","ignore-certificate-errors");
			options.addArguments("--kisko---printing");
			System.out.println("hiiiiiiiiii");
			System.setProperty("webdriver.chrome.driver", "D:\\Users\\F2A2VX6\\Documents\\BackupBAParameter\\eclipse-workspace.1\\eclipse-workspace\\automation\\src\\main\\java\\InputData\\chromedriver.exe");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			System.out.println("highgvf");
			} catch(Exception e) {
				System.out.println(e + "-------e");
			}
		} else if (browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", ".\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", ".\\MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	}

	public static void login(String Url, String clientid, String username, String password, String methodName)
			throws InterruptedException {
		driver.get(Url);
		Thread.sleep(5000);
		driver.findElement(By.xpath(ObjectRepositary.login_tb_client_id)).sendKeys(clientid);
		driver.findElement(By.xpath(ObjectRepositary.login_tb_username)).sendKeys(username);
		driver.findElement(By.xpath(ObjectRepositary.login_tb_password)).sendKeys(password);
		driver.findElement(By.xpath(ObjectRepositary.login_btn_submit)).click();

	}

	public static void takeScreenshot(String methodName) throws IOException {
		String timeStamp;
		File screenShotName = null;
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		timeStamp = new SimpleDateFormat("yyyy_MM_HHmmss").format(Calendar.getInstance().getTime());
		String folderPath = "./test-output/Screenshots/" + folderName;
		File f1 = new File(folderPath);
		if (f1.exists()) {
			screenShotName = new File(folderPath + "/" + methodName + "_" + timeStamp + ".png");
		} else {
			f1.mkdir();
			screenShotName = new File(folderPath + "/" + methodName + "_" + timeStamp + ".png");
		}
		FileHandler.copy(scrFile, screenShotName);
		String filePath = timeStamp + ".png";
		Reporter.log(filePath);
	}

	public static void logout() throws IOException, InterruptedException {
		System.out.println("hi i am in");
		try {
			//WebDriverWait wait = new WebDriverWait(driver,1000);
			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ObjectRepositary.Logout_down_click))).click();
			WebElement e = driver.findElement(By.xpath(ObjectRepositary.Logout_down_click));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].scrollIntoView(true); return arguments[0];", e);
			e.click();	
			driver.findElement(By.xpath(ObjectRepositary.Logout)).click();
			driver.close();
			
		} catch (Exception error) {
			System.out.println(error + "  catch block - element is not present");
		}
	}

}
