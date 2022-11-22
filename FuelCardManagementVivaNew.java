package webAutomation;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Util.util;
import objectRepository.FuelCardMagmentVivaObjectRepo;

public class FuelCardManagementVivaNew extends FuelCardMagmentVivaObjectRepo {
	public static WebDriver driver;
	public String username, password;
	public String browser;
	public static WebElement element;
	public String folderName;
	public String status;
	
	// -----------------Read
	// excel---------------------------------------------------------------------------------
	@DataProvider(name = "getLoginData")
	public Object[][] excelDP() throws IOException {
		util samp = new util();
		Object[][] arrObj = samp.getExcelData("D:\\Users\\F9Y5ANL\\Documents\\Testing.xlsx", "FuelCardManagementViva");
		System.out.println(Arrays.toString(arrObj));
		return arrObj;
	}

	// --------------------------Test Case 1 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 1)
	public void TestcaseFCMV_1(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			openBrowser(browser);
			login(url, username, password, methodName);
			takeScreenshot(methodName);
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 2 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 2)
	public void TestcaseFCMV_2(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
			Actions action = new Actions(driver);
			action.moveToElement(e1).perform();
			driver.findElement(By.xpath(fuel_card_management2)).click();
			takeScreenshot(methodName);
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 3 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 3)
	public void TestcaseFCMV_3(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			Thread.sleep(3000);
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(card_search_link)).isDisplayed();
			String actual = driver.findElement(By.xpath(card_search_link)).getText();
			System.out.println(actual + "actual");
			Assert.assertEquals(actual, card_search1);
			takeScreenshot(methodName);
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 4 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 4)
	public void TestcaseFCMV_4(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			driver.findElement(By.xpath(card_number_textbox)).sendKeys(card_number);
			Thread.sleep(3000);
			takeScreenshot(methodName);
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 5 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 5)
	public void TestcaseFCMV_5(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			try {
				driver.findElement(By.xpath(search_button)).click();
			} catch (Exception e) {
				System.out.println(e);
			}
			driver.findElement(By.xpath(institution_id)).isDisplayed();
			driver.findElement(By.xpath(institution_name)).isDisplayed();
			driver.findElement(By.xpath(card_type)).isDisplayed();
			driver.findElement(By.xpath(card_status)).isDisplayed();
			takeScreenshot(methodName);
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 6 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 6)
	public void TestcaseFCMV_6(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			driver.findElement(By.xpath(bt_refresh)).isDisplayed();
			driver.findElement(By.xpath(bt_save)).isDisplayed();
			driver.findElement(By.xpath(bt_refresh)).isEnabled();
			driver.findElement(By.xpath(bt_save)).isEnabled();
			status ="PASS";
			takeScreenshot(methodName);
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 7 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 7)
	public void TestcaseFCMV_7(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			WebElement e1 = driver.findElement(By.xpath(card_search_link_homepage));
			Actions action = new Actions(driver);
			Thread.sleep(2000);
			action.moveToElement(e1).perform();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(card_search_link_homepage)).isDisplayed();
			WebElement e2 = driver.findElement(By.xpath(card_holder_info));
			Actions action1 = new Actions(driver);
			Thread.sleep(2000);
			action1.moveToElement(e2).perform();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(card_holder_info)).isDisplayed();
			WebElement e3 = driver.findElement(By.xpath(pin_info_reset));
			Actions action2 = new Actions(driver);
			Thread.sleep(2000);
			action2.moveToElement(e3).perform();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(pin_info_reset)).isDisplayed();
			WebElement e4 = driver.findElement(By.xpath(fmi_validation));
			Actions action3 = new Actions(driver);
			Thread.sleep(2000);
			action3.moveToElement(e4).perform();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(fmi_validation)).isDisplayed();
			WebElement e5 = driver.findElement(By.xpath(purchase_control));
			Actions action4 = new Actions(driver);
			Thread.sleep(2000);
			action4.moveToElement(e5).perform();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(purchase_control)).isDisplayed();
			WebElement e7 = driver.findElement(By.xpath(restriction_day_time));
			Actions action6 = new Actions(driver);
			Thread.sleep(2000);
			action6.moveToElement(e7).perform();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(restriction_day_time)).isDisplayed();
			WebElement e6 = driver.findElement(By.xpath(product_codes));
			Actions action5 = new Actions(driver);
			Thread.sleep(2000);
			action5.moveToElement(e6).perform();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(product_codes)).isDisplayed();
			WebElement e8 = driver.findElement(By.xpath(acc_information));
			Actions action7 = new Actions(driver);
			Thread.sleep(2000);
			action7.moveToElement(e8).perform();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(acc_information)).isDisplayed();
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 8 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 8)
	public void TestcaseFCMV_8(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			Select select = new Select(driver.findElement(By.xpath(card_status)));
			java.util.List<WebElement> card_status_List = select.getOptions();
			int size = card_status_List.size();
			for (int i = 0; i < size; i++) {
				String options = card_status_List.get(i).getText();
				System.out.println(options);
			}
			driver.findElement(By.xpath(card_status)).click();
			takeScreenshot(methodName);
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 9 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 9)
	public void TestcaseFCMV_9(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();

			Thread.sleep(5000);
			try {
				driver.findElement(By.xpath(pin_info_reset)).click();
				driver.findElement(By.xpath(cb_pinreset)).click();
				Select select1 = new Select(driver.findElement(By.xpath(cb_pinreset)));
				takeScreenshot(methodName);
				java.util.List<WebElement> pin_reset_List = select1.getOptions();
				int size = pin_reset_List.size();
				for (int i = 0; i < size; i++) {
					String options1 = pin_reset_List.get(i).getText();
					System.out.println(options1);
				}
			} catch (Exception e) {
				System.out.println(e);
			}
			WebElement n = driver.findElement(By.xpath(pin_reset));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", n);
			takeScreenshot(methodName);
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 10 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" }, priority = 10)
	public void TestcaseFCMV_10(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario1";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			driver.findElement(By.xpath(view_pan)).isEnabled();
			String card_no_masked = driver.findElement(By.xpath(card_number_masked)).getAttribute("value");
			System.out.println(card_no_masked + "card_no_masked");
			boolean value = card_no_masked.contains("*******");
			driver.findElement(By.xpath(view_pan)).click();
			Thread.sleep(3000);
			takeScreenshot(methodName);
			driver.switchTo().defaultContent();
			WebElement n = driver.findElement(By.xpath(logout));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", n);
			driver.close();
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 11 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 11)
	public void TestcaseFCMV_11(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			openBrowser(browser);
			login(url, username, password, methodName);
			WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
			Actions action = new Actions(driver);
			action.moveToElement(e1).perform();
			driver.findElement(By.xpath(fuel_card_management2)).click();
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(card_number_textbox)).sendKeys(card_number);
			driver.findElement(By.xpath(search_button)).click();
			driver.findElement(By.xpath(view_pan)).click();
			takeScreenshot(methodName);
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 12 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 12)
	public void TestcaseFCMV_12(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			driver.findElement(By.xpath(bt_refresh)).click();
			takeScreenshot(methodName);
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 13 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 13)
	public void TestcaseFCMV_13(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			driver.findElement(By.xpath(acc_information)).click();
			takeScreenshot(methodName);
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 14 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 14)
	public void TestcaseFCMV_14(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			driver.findElement(By.xpath(pin_info_reset)).click();
			takeScreenshot(methodName);
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 15 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 15)
	public void TestcaseFCMV_15(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			driver.findElement(By.xpath(fmi_validation)).click();
			takeScreenshot(methodName);
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 16 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 16)
	public void TestcaseFCMV_16(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			WebElement e5 = driver.findElement(By.xpath(purchase_control));
			Actions action4 = new Actions(driver);
			action4.moveToElement(e5).perform();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(purchase_control)).isDisplayed();
			driver.findElement(By.xpath(purchase_control)).click();
			takeScreenshot(methodName);
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 17 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 17)
	public void TestcaseFCMV_17(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			WebElement e2 = driver.findElement(By.xpath(restriction_day_time));
			Actions action1 = new Actions(driver);
			action1.moveToElement(e2).perform();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(restriction_day_time)).isDisplayed();
			driver.findElement(By.xpath(restriction_day_time)).click();
			takeScreenshot(methodName);
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 18 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 18)
	public void TestcaseFCMV_18(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			WebElement e6 = driver.findElement(By.xpath(product_codes));
			Actions action5 = new Actions(driver);
			action5.moveToElement(e6).perform();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(product_codes)).isDisplayed();
			driver.findElement(By.xpath(product_codes)).click();
			takeScreenshot(methodName);
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 19 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 19)
	public void TestcaseFCMV_19(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			WebElement e2 = driver.findElement(By.xpath(card_holder_info));
			Actions action1 = new Actions(driver);
			action1.moveToElement(e2).perform();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(card_holder_info)).isDisplayed();
			driver.findElement(By.xpath(card_holder_info)).click();
			takeScreenshot(methodName);
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 20 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario2" }, priority = 20)
	public void TestcaseFCMV_20(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario2";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			WebElement e1 = driver.findElement(By.xpath(card_search));
			Actions action = new Actions(driver);
			action.moveToElement(e1).perform();
			takeScreenshot(methodName);
			driver.findElement(By.xpath(card_search)).isDisplayed();
			driver.findElement(By.xpath(card_search)).click();
			takeScreenshot(methodName);
			driver.switchTo().defaultContent();
			WebElement n = driver.findElement(By.xpath(logout));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", n);
			takeScreenshot(methodName);
			driver.close();
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 21 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 21)
	public void TestcaseFCMV_21(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			openBrowser(browser);
			login(url, username, password, methodName);
			WebElement e1 = driver.findElement(By.xpath(home_page_bt_tools));
			Actions action = new Actions(driver);
			Thread.sleep(2000);
			action.moveToElement(e1).perform();
			driver.findElement(By.xpath(fuel_card_management2)).click();
			driver.switchTo().frame(0);
			driver.findElement(By.xpath(card_number_textbox)).sendKeys(card_number);
			driver.findElement(By.xpath(search_button)).click();
			try {
				Select select = new Select(driver.findElement(By.xpath(pin_reset)));
				select.selectByVisibleText(pin_reset_list);
				String option = select.getFirstSelectedOption().getText();
				System.out.println(option + "options");
				Assert.assertEquals(option, pin_reset_list);
				takeScreenshot(methodName);
				driver.findElement(By.xpath(save)).click();
				takeScreenshot(methodName);
			} catch (Exception e) {
				System.out.println(e);
			}
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 22 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 22)
	public void TestcaseFCMV_22(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(bt_refresh)).click();
			takeScreenshot(methodName);
			Select select = new Select(driver.findElement(By.xpath(pin_reset)));
			select.selectByVisibleText(pin_reset_list);
			String option = select.getFirstSelectedOption().getText();
			System.out.println(option + "options");
			Assert.assertEquals(option, pin_reset_list);
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 23 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 23)
	public void TestcaseFCMV_23(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(product_codes)).click();
			driver.findElement(By.xpath(product_code_enabled)).sendKeys(enabled);
			driver.findElement(By.xpath(save)).click();
			String data_saved = new Select(driver.findElement(By.xpath(product_code_enabled))).getFirstSelectedOption()
					.getAttribute("label");
			System.out.println(data_saved + "DataSaved");
			Assert.assertEquals(data_saved, enabled);
//			WebElement n = driver.findElement(By.xpath(product_code_enabled));
//			Actions actions = new Actions(driver);
//			actions.moveToElement(n).build().perform();
			WebElement n = driver.findElement(By.xpath(product_code_enabled));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", n);
			takeScreenshot(methodName);
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 24 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 24)
	public void TestcaseFCMV_24(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(bt_refresh)).click();
			String data_saved = new Select(driver.findElement(By.xpath(product_code_enabled))).getFirstSelectedOption()
					.getAttribute("label");
			System.out.println(data_saved + "DataSaved");
			Assert.assertEquals(data_saved, enabled);
			WebElement n = driver.findElement(By.xpath(product_code_enabled));
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", n);
			
			takeScreenshot(methodName);
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 25 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 25)
	public void TestcaseFCMV_25(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(card_status)).sendKeys(card_status2);
			driver.findElement(By.xpath(save)).click();
			String card_status_data = new Select(driver.findElement(By.xpath(card_status))).getFirstSelectedOption()
					.getText();
			Assert.assertEquals(card_status_data, card_status2);
			takeScreenshot(methodName);
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 26 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 26)
	public void TestcaseFCMV_26(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(bt_refresh)).click();
			String card_status_data = new Select(driver.findElement(By.xpath(card_status))).getFirstSelectedOption()
					.getText();
			Assert.assertEquals(card_status_data, card_status2);
			takeScreenshot(methodName);
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 27 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 27)
	public void TestcaseFCMV_27(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(card_search_link_homepage)).click();
			// driver.switchTo().frame(0);
			driver.findElement(By.xpath(search_button2)).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(error_message)).isDisplayed();
			takeScreenshot(methodName);
			String actual = driver.findElement(By.xpath(error_message)).getText();
			Assert.assertEquals(actual, "Invalid Card Number");
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 28 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 28)
	public void TestcaseFCMV_28(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.findElement(By.xpath(card_number_textbox)).sendKeys(invalid_cardnumber);
			driver.findElement(By.xpath(search_button)).click();
			Thread.sleep(2000);
			String actual = driver.findElement(By.xpath(invalid_card)).getText();
			takeScreenshot(methodName);
			Assert.assertEquals(actual, "Invalid Card Number");
			System.out.println(actual + "actual");
			takeScreenshot(methodName);
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// --------------------------Test Case 29 started-----------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario3" }, priority = 29)
	public void TestcaseFCMV_29(String url, String username, String password, String browser, String scenario,
			String card_number, String pin_reset_list, String enabled, String card_status2, String invalid_cardnumber)
			throws Exception {
		try {
			folderName = "Scenario3";
			String methodName = new Object() {
			}.getClass().getEnclosingMethod().getName();
			System.out.println(methodName + "methodName");
			driver.switchTo().defaultContent();
			WebElement n = driver.findElement(By.xpath(logout));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", n);
			takeScreenshot(methodName);
			driver.close();
			status ="PASS";
		} catch (Exception e) {
			System.out.println(e);
			status ="FAIL";
		}
	}

	// -----------------------Take Screenshot------------------------
	public void takeScreenshot(String methodName) throws Exception {
		String timeStamp;
		File screenShotName = null;
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		timeStamp = new SimpleDateFormat("yyyy_MM_dd_HHmmss").format(Calendar.getInstance().getTime());
		System.out.println(timeStamp);
		String folderPath = "./test-output/Screenshots/" + folderName;
		System.out.println(folderPath + "folderPath");
		File f1 = new File(folderPath);
		if (f1.exists()) {
			screenShotName = new File(folderPath + "/" + methodName + "_" + timeStamp + ".png");
		} else {
			boolean bool = f1.mkdir();
			screenShotName = new File(folderPath + "/" + methodName + "_" + timeStamp + ".png");
		}
		FileHandler.copy(scrFile, screenShotName);
		String filePath = timeStamp + ".png";
		Reporter.log(filePath);

	}

	// -------------------Launch
	// browser------------------------------------------------
	public void openBrowser(String browser) {
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Users\\F9Y5ANL\\Downloads\\geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
			options.addPreference("browser.download.folderList", 1);
			options.addPreference("browser.helperApps.neverAsk.saveToDisk",
					"application/x-download, application/pdf, application/octet-stream, application/x-winzip, application/x-pdf");
			driver = new FirefoxDriver(options);
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
			// options.addArguments("--kiosk-printing");
			System.setProperty("webdriver.chrome.driver",
					"D:\\Users\\F9Y5ANL\\Downloads\\chromedriver_win32 (11)\\chromedriver.exe");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",
					"D:\\Users\\F9Y5ANL\\Downloads\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
	}

	// -------------------------------Login to the
	// application--------------------------------------------
	public void login(String url, String username, String password, String methodName) throws Exception {
		driver.get(url);
		Thread.sleep(3000);
		driver.findElement(By.xpath(login_tb_username)).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.xpath(login_tb_password)).sendKeys(password);
		takeScreenshot(methodName);
		Thread.sleep(5000);
		driver.findElement(By.xpath(login_bt_login)).click();
	}
	@AfterMethod
	public void afterMethod() {
		if (status == "FAIL") {
			String methodName = new Object() {
				}.getClass().getEnclosingMethod().getName();
				System.out.println(methodName + "--------------------inside after method methodName");
			try {
				takeScreenshot(methodName);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@AfterSuite
	public void afterSuite() {
		driver.quit();
	}
}

