package BAParameterAutomation;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import java.lang.reflect.Array;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.google.common.base.Objects;
import objectRepository.ObjectRepositary;
import util.Log;
import util.Util;

public class Testcase2{
	public static WebDriver driver;
	// public static String folderName;
	public static ArrayList<String> array1;
	public static ArrayList<String> array2;
	public static ArrayList<String> keyArray;
	public static ArrayList<String> keyArray1;
	public static String page;


	@DataProvider(name = "getLoginData")
	public Object[][] excelDP() throws IOException {
		Object[][] arrObj = Util.getExcelData("D:\\Users\\F2A2VX6\\Documents\\BackupBAParameter\\eclipse-workspace.1\\eclipse-workspace\\automation\\src\\main\\java\\InputData\\InputForUsecase2.xlsx", "01-Real Time SMS Alerts");
		return arrObj;
	}

	// -----------------------------Testcase1------------------------
	@Test(dataProvider = "getLoginData", groups = { "Scenario1" })
	public void Testcase1(String scenario, String buisnessUnit1, String buisnessUnit2, String product, String baseUrl,
						  String ClientId, String UserName, String Password, String browser, String search_val, String title, String BA_keysNeedsToBeUpdated,String  BA_keyValueNeedsToBeUpdated,String keysHeader, String status) throws InterruptedException, IOException {

		//--

		//--
		Baseclass.folderName = "Scenario1";
		String methodName = new Object() {
		}.getClass().getEnclosingMethod().getName();
		try {

			// ----------
			Baseclass.browserInitilization(browser);

			Log.info("----------------Log in to the application------------");
			Baseclass.login(baseUrl, ClientId, UserName, Password, methodName);
			Baseclass.takeScreenshot(methodName);

			Log.info("----------------Verifying the buisnessunit1 ------------");
			search_businessunit_page(search_val);
			Baseclass.takeScreenshot(methodName);
			System.out.println("i am in if");
			System.out.println(buisnessUnit1 + "buisnessUnit1");
			Baseclass.driver.findElement(By.xpath(ObjectRepositary.Business_unit)).sendKeys(buisnessUnit1);
			Baseclass.driver.findElement(By.xpath(ObjectRepositary.Product)).sendKeys(product);
			Baseclass.driver.findElement(By.xpath(ObjectRepositary.Query)).click();
			Log.info("----------------Verifying the buisnessunit 168 all fields ------------");
			array1 = verify_fields_on_buisnessunit_page(title, array1);
			Baseclass.takeScreenshot(methodName);
			System.out.print(array1 + "array1");
			String buisnessUnitVal = Baseclass.driver.findElement((By.xpath(objectRepository.ObjectRepositary.Buissness_unit_val_168))).getAttribute(title);
			System.out.println(buisnessUnitVal +"buisnessUnitVal----");
			String prodVal = Baseclass.driver.findElement((By.xpath(objectRepository.ObjectRepositary.productValue))).getAttribute(title);
			System.out.println(prodVal +"prodVal----");
			String org11 = "org-" + buisnessUnitVal +"-Logo-"+prodVal;
			System.out.println(org11 + "org11");
			page = Baseclass.driver.findElement((By.xpath(objectRepository.ObjectRepositary.page1))).getText();

			Log.info("----------------Verifying the buisnessunit2 ------------");
			Baseclass.driver.findElement(By.xpath(ObjectRepositary.maintain)).click();
			Thread.sleep(15000);
			page = Baseclass.driver.findElement((By.xpath(objectRepository.ObjectRepositary.page1))).getText();
			String[] keysForUpdate = BA_keysNeedsToBeUpdated.split(",");
			String[] respectiveFieldsToBeUpdated = BA_keyValueNeedsToBeUpdated.split(",");
System.out.println(keysForUpdate +"keysForUpdate");
			System.out.println(respectiveFieldsToBeUpdated +"respectiveFieldsToBeUpdated");
			//---Need to update value for respective keys
			for (int i = 0; i < keysForUpdate.length; i++) {
				System.out.println("keysForUpdate[i]"+ keysForUpdate[i]);

				String xpath = "(//label[contains(text(),'" + keysForUpdate[i].trim() + "')])/parent::a/parent::div/input";
				System.out.println("xpath"+ xpath);
				WebElement ele1 = Baseclass.driver.findElement(By.xpath(xpath));
				Actions builder1 = new Actions(Baseclass.driver);
				// WebElement ele1 =
				// Baseclass.driver.findElement(By.xpath(ObjectRepositary.Auth_Approved_MOTO_LTR));
				builder1.doubleClick(ele1);
				ele1.sendKeys(Keys.LEFT_CONTROL + "a" + Keys.DELETE);
				ele1.clear();
				ele1.sendKeys(respectiveFieldsToBeUpdated[i]);
			}

			Log.info("----------------Verifying the buisnessunit 169 all fields ------------");
			array2 = verify_fields_on_buisnessunit_page(title, array2);
			System.out.println(array2 +"array2----");
			String buisnessUnitKey1 = Baseclass.driver.findElement((By.xpath(objectRepository.ObjectRepositary.Buissness_unit_168))).getText();
			System.out.println(buisnessUnitKey1 +"buisnessUnitKey1----");
			String buisnessUnitVal1 = Baseclass.driver.findElement((By.xpath(objectRepository.ObjectRepositary.Buissness_unit_val_169))).getAttribute(title);
			System.out.println(buisnessUnitVal1 +"buisnessUnitVal----");
			String org22 = "org-" + buisnessUnitVal1 +"-Logo-"+prodVal;
			System.out.println(org22 + "org22");
			Baseclass.takeScreenshot(methodName);

			// ----------
			keyArray1 = keys();
			System.out.println(keyArray1 + "---keyArray1");
			Map<String, String> mapForBuisnessUnit1 = mapForBuisnessUnit(array1);

			// print the returned map
			System.out.println(mapForBuisnessUnit1 + "----mapForBuisnessUnit1");

			// call the mapForBuisnessUnit() method over the keys[] array and
			// values[] array
			Map<String, String> mapForBuisnessUnit2 = mapForBuisnessUnit(array2);

			// print the returned map
			System.out.println(mapForBuisnessUnit2 + "----mapForBuisnessUnit2");

			Log.info("----------------Comaparing both page values and pushing to excel as output ------------");
			Map<String, String[]> result = compareMapsAndPushToExcel(mapForBuisnessUnit1, mapForBuisnessUnit2, org11,
					org22, keysHeader, status);
			System.out.println(result + "unmatched map");
			Log.info("---------------------------Ending script---------------------------------");
		} catch (Exception e) {
			Log.error("An error occurred");
		}
	}

	@AfterTest
	public void ClosingBrowser() throws IOException, InterruptedException {
		// Baseclass.logout();
	}

	public static ArrayList<String> verify_fields_on_buisnessunit_page(String title, ArrayList<String> array) {
		String auth_approved_moto_ltr = Baseclass.driver.findElement(By.xpath(ObjectRepositary.Auth_Approved_MOTO_LTR))
				.getAttribute(title);
		String auth_approved_overlimit_ltr = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.Auth_Approved_Overlimit_LTR))).getAttribute(title);
		String auth_auth_approved_moto_overlimit_ltr = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.AUth_Approved_MOTO_OverLImit_LTR))).getAttribute(title);
		String auth_approved_ltr = Baseclass.driver.findElement((By.xpath(ObjectRepositary.Auth_Approved_LTR)))
				.getAttribute(title);
		String auth_delined_invalid_PIN = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.Auth_DEclined_Invalid_PIN))).getAttribute(title);
		String auth_delined_invalid_try_exceeded = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.Auth_Declined_Invalid_Try_Exceeded))).getAttribute(title);
		String auth_delined_invalid_local_only = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.Auth_Declined_Local_Only))).getAttribute(title);
		String auth_delined_invalid_exp_date = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.Auth_Declined_Invalid_Exp_Date))).getAttribute(title);
		String auth_delined_blocked_card = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.Auth_Declined_Blocked_Card))).getAttribute(title);
		String auth_delined_invalid_cvx = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.Auth_Declined_Invalid_CVX))).getAttribute(title);
		String auth_reversal_messages = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.Auth_Reversal_Messages))).getAttribute(title);
		String other_non_mon_updates = Baseclass.driver.findElement((By.xpath(ObjectRepositary.Other_Non_Mon_Updates)))
				.getAttribute(title);
		String block_code_update = Baseclass.driver.findElement((By.xpath(ObjectRepositary.Block_Code_Update)))
				.getAttribute(title);
		String wSP_iDV_oTP = Baseclass.driver.findElement((By.xpath(ObjectRepositary.WSP_IDV_OTP))).getAttribute(title);
		String apix_tXN_ebanking = Baseclass.driver.findElement((By.xpath(ObjectRepositary.Apix_TXN_Ebanking)))
				.getAttribute(title);
		String real_time_payment_TXN = Baseclass.driver.findElement((By.xpath(ObjectRepositary.Real_Time_Payment_TXN)))
				.getAttribute(title);
		String quick_redeem = Baseclass.driver.findElement((By.xpath(ObjectRepositary.Quick_Redeem)))
				.getAttribute(title);
		String spend_limit_Updated = Baseclass.driver.findElement((By.xpath(ObjectRepositary.Spend_Limit_Updated)))
				.getAttribute(title);
		String card_ctls_upd = Baseclass.driver.findElement((By.xpath(ObjectRepositary.Card_Ctls_upd)))
				.getAttribute(title);
		String spend_lIm_Decl = Baseclass.driver.findElement((By.xpath(ObjectRepositary.Spend_LIm_Decl)))
				.getAttribute(title);
		String card_ctls_decl = Baseclass.driver.findElement((By.xpath(ObjectRepositary.Card_ctls_decl)))
				.getAttribute(title);
		String dGTL_pMT_oTP = Baseclass.driver.findElement((By.xpath(ObjectRepositary.DGTL_PMT_OTP)))
				.getAttribute(title);
		String auth_dEcl_oTB = Baseclass.driver.findElement((By.xpath(ObjectRepositary.Auth_DEcl_OTB)))
				.getAttribute(title);
		String auth_decl_generic = Baseclass.driver.findElement((By.xpath(ObjectRepositary.Auth_Decl_Generic)))
				.getAttribute(title);
		String prod_xFR_LTR_Id = Baseclass.driver.findElement((By.xpath(ObjectRepositary.Prod_XFR_LTR_ID)))
				.getAttribute(title);
		String auth_declined_sI_Hub = Baseclass.driver.findElement((By.xpath(ObjectRepositary.Auth_Declined_SI_Hub)))
				.getAttribute(title);
		String falcon_decline_LTR_ID = Baseclass.driver.findElement((By.xpath(ObjectRepositary.Falcon_Decline_LTR_ID)))
				.getAttribute(title);
		String inact_card_LtR_ID = Baseclass.driver.findElement((By.xpath(ObjectRepositary.Inact_Card_LTR_ID)))
				.getAttribute(title);
		String advices_lTR_iD = Baseclass.driver.findElement((By.xpath(ObjectRepositary.Advices_LTR_ID)))
				.getAttribute(title);
		String sI_rEG_LTR_Id = Baseclass.driver.findElement((By.xpath(ObjectRepositary.SI_REG_LTR_ID)))
				.getAttribute(title);
		String sI_eDIT_LTR_iD = Baseclass.driver.findElement((By.xpath(ObjectRepositary.SI_EDIT_LTR_ID)))
				.getAttribute(title);
		String sI_rEG_REV_lTR_ID = Baseclass.driver.findElement((By.xpath(ObjectRepositary.SI_REG_REV_LTR_ID)))
				.getAttribute(title);
		String sI_eDIT_REV_lTR_ID = Baseclass.driver.findElement((By.xpath(ObjectRepositary.SI_EDIT_REV_LTR_ID)))
				.getAttribute(title);
		String sI_pRE_DEB_lTR_ID = Baseclass.driver.findElement((By.xpath(ObjectRepositary.SI_PRE_DEB_LTR_ID)))
				.getAttribute(title);
		String sRD_aCTVTE_lTR_ID = Baseclass.driver.findElement((By.xpath(ObjectRepositary.CRD_ACTVTE_LTR_ID)))
				.getAttribute(title);
		String sRD_eXP_dECLINE_LTR_ID = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.CRD_EXP_DECLINE_LTR_ID))).getAttribute(title);
		array = new ArrayList<String>();
		array.add(auth_approved_moto_ltr);
		array.add(auth_approved_overlimit_ltr);
		array.add(auth_auth_approved_moto_overlimit_ltr);
		array.add(auth_approved_ltr);
		array.add(auth_delined_invalid_PIN);
		array.add(auth_delined_invalid_try_exceeded);
		array.add(auth_delined_invalid_local_only);
		array.add(auth_delined_invalid_exp_date);
		array.add(auth_delined_blocked_card);
		array.add(auth_delined_invalid_cvx);
		array.add(auth_reversal_messages);
		array.add(other_non_mon_updates);
		array.add(block_code_update);
		array.add(wSP_iDV_oTP);
		array.add(apix_tXN_ebanking);
		array.add(real_time_payment_TXN);
		array.add(quick_redeem);
		array.add(spend_limit_Updated);
		array.add(card_ctls_upd);
		array.add(spend_lIm_Decl);
		array.add(card_ctls_decl);
		array.add(dGTL_pMT_oTP);
		array.add(auth_dEcl_oTB);
		array.add(auth_decl_generic);
		array.add(prod_xFR_LTR_Id);
		array.add(auth_declined_sI_Hub);
		array.add(falcon_decline_LTR_ID);
		array.add(inact_card_LtR_ID);
		array.add(advices_lTR_iD);
		array.add(sI_rEG_LTR_Id);
		array.add(sI_eDIT_LTR_iD);
		array.add(sI_rEG_REV_lTR_ID);
		array.add(sI_eDIT_REV_lTR_ID);
		array.add(sI_pRE_DEB_lTR_ID);
		array.add(sRD_aCTVTE_lTR_ID);
		array.add(sRD_eXP_dECLINE_LTR_ID);
		return array;
	}

	public static void search_businessunit_page(String search_val)
			throws InterruptedException {
		Thread.sleep(18000);
		Baseclass.driver.findElement(By.xpath(ObjectRepositary.Search_box)).click();
		Baseclass.driver.findElement(By.xpath(ObjectRepositary.Search_box)).sendKeys(search_val);
		Baseclass.driver.findElement(By.xpath(ObjectRepositary.Search_box_val)).click();
	}

	public static ArrayList<String> keys() {
		// -------keys--

		String key_auth_approved_moto_ltr = Baseclass.driver
				.findElement(By.xpath(ObjectRepositary.key_Auth_Approved_MOTO_LTR)).getText();
		String key_auth_approved_overlimit_ltr = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.key_Auth_Approved_Overlimit_LTR))).getText();
		String key_auth_auth_approved_moto_overlimit_ltr = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.key_AUth_Approved_MOTO_OverLImit_LTR))).getText();
		String key_auth_approved_ltr = Baseclass.driver.findElement((By.xpath(ObjectRepositary.key_Auth_Approved_LTR)))
				.getText();
		String key_auth_delined_invalid_PIN = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.key_Auth_DEclined_Invalid_PIN))).getText();
		String key_auth_delined_invalid_try_exceeded = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.key_Auth_Declined_Invalid_Try_Exceeded))).getText();
		String key_auth_delined_invalid_local_only = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.key_Auth_Declined_Local_Only))).getText();
		String key_auth_delined_invalid_exp_date = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.key_Auth_Declined_Invalid_Exp_Date))).getText();
		String key_auth_declined_blocked_card = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.key_Auth_Declined_Blocked_Card))).getText();
		String key_auth_delined_invalid_cvx = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.key_Auth_Declined_Invalid_CVX))).getText();
		String key_auth_reversal_messages = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.key_Auth_Reversal_Messages))).getText();
		String key_other_non_mon_updates = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.key_Other_Non_Mon_Updates))).getText();
		String key_block_code_update = Baseclass.driver.findElement((By.xpath(ObjectRepositary.key_Block_Code_Update)))
				.getText();
		String key_wSP_iDV_oTP = Baseclass.driver.findElement((By.xpath(ObjectRepositary.key_WSP_IDV_OTP))).getText();
		String key_apix_tXN_ebanking = Baseclass.driver.findElement((By.xpath(ObjectRepositary.key_Apix_TXN_Ebanking)))
				.getText();
		String key_real_time_payment_TXN = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.key_Real_Time_Payment_TXN))).getText();
		String key_quick_redeem = Baseclass.driver.findElement((By.xpath(ObjectRepositary.key_Quick_Redeem))).getText();
		String key_spend_limit_Updated = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.key_Spend_Limit_Updated))).getText();
		String key_card_ctls_upd = Baseclass.driver.findElement((By.xpath(ObjectRepositary.key_Card_Ctls_upd)))
				.getText();
		String key_spend_lIm_Decl = Baseclass.driver.findElement((By.xpath(ObjectRepositary.key_Spend_LIm_Decl)))
				.getText();
		String key_card_ctls_decl = Baseclass.driver.findElement((By.xpath(ObjectRepositary.key_Card_ctls_decl)))
				.getText();
		String key_dGTL_pMT_oTP = Baseclass.driver.findElement((By.xpath(ObjectRepositary.key_DGTL_PMT_OTP))).getText();
		String key_auth_dEcl_oTB = Baseclass.driver.findElement((By.xpath(ObjectRepositary.key_Auth_DEcl_OTB)))
				.getText();
		String key_auth_decl_generic = Baseclass.driver.findElement((By.xpath(ObjectRepositary.key_Auth_Decl_Generic)))
				.getText();
		String key_prod_xFR_LTR_Id = Baseclass.driver.findElement((By.xpath(ObjectRepositary.key_Prod_XFR_LTR_ID)))
				.getText();
		String key_auth_declined_sI_Hub = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.key_Auth_Declined_SI_Hub))).getText();
		String key_falcon_decline_LTR_ID = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.key_Falcon_Decline_LTR_ID))).getText();
		String key_inact_card_LtR_ID = Baseclass.driver.findElement((By.xpath(ObjectRepositary.key_Inact_Card_LTR_ID)))
				.getText();
		String key_advices_lTR_iD = Baseclass.driver.findElement((By.xpath(ObjectRepositary.key_Advices_LTR_ID)))
				.getText();
		String key_sI_rEG_LTR_Id = Baseclass.driver.findElement((By.xpath(ObjectRepositary.key_SI_REG_LTR_ID)))
				.getText();
		String key_sI_eDIT_LTR_iD = Baseclass.driver.findElement((By.xpath(ObjectRepositary.key_SI_EDIT_LTR_ID)))
				.getText();
		String key_sI_rEG_REV_lTR_ID = Baseclass.driver.findElement((By.xpath(ObjectRepositary.key_SI_REG_REV_LTR_ID)))
				.getText();
		String key_sI_eDIT_REV_lTR_ID = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.key_SI_EDIT_REV_LTR_ID))).getText();
		String key_sI_pRE_DEB_lTR_ID = Baseclass.driver.findElement((By.xpath(ObjectRepositary.key_SI_PRE_DEB_LTR_ID)))
				.getText();
		String key_sRD_aCTVTE_lTR_ID = Baseclass.driver.findElement((By.xpath(ObjectRepositary.key_CRD_ACTVTE_LTR_ID)))
				.getText();
		String key_sRD_eXP_dECLINE_LTR_ID = Baseclass.driver
				.findElement((By.xpath(ObjectRepositary.key_CRD_EXP_DECLINE_LTR_ID))).getText();
		keyArray = new ArrayList<String>();
		keyArray.add(key_auth_approved_moto_ltr);
		keyArray.add(key_auth_approved_overlimit_ltr);
		keyArray.add(key_auth_auth_approved_moto_overlimit_ltr);
		keyArray.add(key_auth_approved_ltr);
		keyArray.add(key_auth_delined_invalid_PIN);
		keyArray.add(key_auth_delined_invalid_try_exceeded);
		keyArray.add(key_auth_delined_invalid_local_only);
		keyArray.add(key_auth_delined_invalid_exp_date);
		keyArray.add(key_auth_declined_blocked_card);
		keyArray.add(key_auth_delined_invalid_cvx);
		keyArray.add(key_auth_reversal_messages);
		keyArray.add(key_other_non_mon_updates);
		keyArray.add(key_block_code_update);
		keyArray.add(key_wSP_iDV_oTP);
		keyArray.add(key_apix_tXN_ebanking);
		keyArray.add(key_real_time_payment_TXN);
		keyArray.add(key_quick_redeem);
		keyArray.add(key_spend_limit_Updated);
		keyArray.add(key_card_ctls_upd);
		keyArray.add(key_spend_lIm_Decl);
		keyArray.add(key_card_ctls_decl);
		keyArray.add(key_dGTL_pMT_oTP);
		keyArray.add(key_auth_dEcl_oTB);
		keyArray.add(key_auth_decl_generic);
		keyArray.add(key_prod_xFR_LTR_Id);
		keyArray.add(key_auth_declined_sI_Hub);
		keyArray.add(key_falcon_decline_LTR_ID);
		keyArray.add(key_inact_card_LtR_ID);
		keyArray.add(key_advices_lTR_iD);
		keyArray.add(key_sI_rEG_LTR_Id);
		keyArray.add(key_sI_eDIT_LTR_iD);
		keyArray.add(key_sI_rEG_REV_lTR_ID);
		keyArray.add(key_sI_eDIT_REV_lTR_ID);
		keyArray.add(key_sI_pRE_DEB_lTR_ID);
		keyArray.add(key_sRD_aCTVTE_lTR_ID);
		keyArray.add(key_sRD_eXP_dECLINE_LTR_ID);
		return keyArray;
	}

	public static HashMap mapForBuisnessUnit(ArrayList<String> values) {
		int keysSize = keyArray1.size();
		int valuesSize = values.size();

		// if the size of both arrays is not equal, throw an
		// IllegalArgumentsException
		if (keysSize != valuesSize) {
			throw new IllegalArgumentException("The number of keys doesn't match the number of values.");
		}

		// if the length of the arrays is 0, then return an
		// empty HashMap
		if (keysSize == 0) {
			return new HashMap();
			// return;
		}

		// create a new HashMap of the type of keys arrays
		// and values array
		HashMap<String, String> map = new HashMap<String, String>();

		// for every key, value
		for (int i = 0; i < keysSize; i++) {
			String[] keyArray = String.join(",", keyArray1).split(",");
			String[] arrayTest = new String[valuesSize];
			System.out.println(Arrays.toString(keyArray) + "keyArray--77777777--inside map");
			System.out.println(Arrays.toString(values.toArray(arrayTest)) + "values1--77777777--inside map");
			System.out.println(" ----values1[i]" + (values.toArray(arrayTest))[i]);
			System.out.println(" ------keyArray[i]" + keyArray[i]);
			map.put(keyArray[i], (values.toArray(arrayTest))[i]);

		}
		System.out.println(map + "----------map-----");
		// return the HashMap
		return map;
	}

	@SuppressWarnings("unchecked")

	public static <K, V> Map<K, V[]> compareMapsAndPushToExcel(Map<K, V> map1, Map<K, V> map2, String org1, String org2, String keysHeader, String status) throws IOException {
	    Set<K> keys = new HashSet<K>(map1.keySet());
	    keys.addAll(map2.keySet());
	    Map<K, V[]> result = new HashMap<K, V[]>();
	    for (K key : keys) {
	        V value1 = map1.get(key);
	        V value2 = map2.get(key);
	        String[] values = new String[2];
	        values[0] = value1 != null ? value1.toString() : "";
	        values[1] = value2 != null ? value2.toString() : "";
	        result.put(key, (V[]) values);
	    }

	    // write the comparison result to an Excel file
	    XSSFWorkbook workbook = new XSSFWorkbook();
	    XSSFSheet sheet = workbook.createSheet(page);
	    Row headerRow = sheet.createRow(0);

	    Cell headerCell1 = headerRow.createCell(0);
	    headerCell1.setCellValue(keysHeader);
	    Cell headerCell2 = headerRow.createCell(1);
	    headerCell2.setCellValue(org1);
	    Cell headerCell3 = headerRow.createCell(2);
	    headerCell3.setCellValue(org2);
	    Cell headerCell4 = headerRow.createCell(3);
	    headerCell4.setCellValue(status);
		Cell headerCell5 = headerRow.createCell(4);
		headerCell5.setCellValue("Date");
	    int rowNumber = 1;
	    for (K key : result.keySet()) {
	        Row row = sheet.createRow(rowNumber++);
	        Cell cell1 = row.createCell(0);
	        cell1.setCellValue(key.toString());

	        V[] values = result.get(key);
	        Cell cell2;
	        Cell cell3;
	        Cell cell4;
			Cell cell5;
	        if (values.length >= 1) {
	            cell2 = row.createCell(1);
	            cell2.setCellValue(values[0].toString());
	        }

	        if (values.length >= 2) {
	            cell3 = row.createCell(2);
	            cell3.setCellValue(values[1].toString());
	        }
	        System.out.println(values[0].toString() +"-- values[0].toString()");
	        System.out.println(values[1].toString() +"-- values[1].toString()");
	        
	        if (values[0].toString().equals(values[1].toString()) || 
	        		(values[0].toString().trim().isEmpty() && values[1].toString().trim().isEmpty())) {
	            cell4 = row.createCell(3);
	            cell4.setCellValue("Not Updated");
	        } else {
	            cell4 = row.createCell(3);
	            cell4.setCellValue("Updated");
	        }
			cell5 = row.createCell(4);
			cell5.setCellValue(new Date().toLocaleString());
		}

		// autosize the columns
		sheet.autoSizeColumn(0);
		sheet.autoSizeColumn(1);
		sheet.autoSizeColumn(2);
		sheet.autoSizeColumn(3);
		sheet.autoSizeColumn(4);

	    // write the workbook to a file
	    FileOutputStream fileOutputStream = new FileOutputStream(new File("D:\\Users\\F2A2VX6\\Documents\\BackupBAParameter\\eclipse-workspace.1\\eclipse-workspace\\automation\\test-output\\Screenshots\\Usecase2_Update_output.xlsx"));
	    workbook.write(fileOutputStream);
	    fileOutputStream.close();
	    workbook.close();
	    return result;
	}

}
