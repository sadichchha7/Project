package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Transformer implements IAnnotationTransformer {
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

		// System.out.println(testClass);
		String curgroup;
		Test reqannotation = testMethod.getAnnotation(Test.class);
		if (reqannotation.groups().length > 0) {
			curgroup = reqannotation.groups()[0];

		} else {
			curgroup = "No group";

		}
		String scenariotorun[] = null;
		try {
			scenariotorun = getScenarioList();
		} catch (IOException e) {
			e.printStackTrace();

		}
		List<String> list = Arrays.asList(scenariotorun);
		if (list.contains(curgroup)) {
			System.out.println("contains the scenario");
		} else {
			annotation.setEnabled(false);
		}
	}

	public String[] getScenarioList() throws IOException {

		String excelsheetpath = ".\\Inputdata\\BA_Parameter.xlsx";
		String sheetname = "Usecase";
		DataFormatter formatter = new DataFormatter();
		String[] sceanariolist = null;
		FileInputStream fileinputstream = new FileInputStream(excelsheetpath);
		XSSFWorkbook wb = new XSSFWorkbook(fileinputstream);
		XSSFSheet worksheet = wb.getSheet("Usecase");
		XSSFRow row = worksheet.getRow(0);
		int lastRowIndex = worksheet.getLastRowNum();
		for (int j = 0; j <= lastRowIndex; j++) {
			XSSFRow row1 = worksheet.getRow(j);
			XSSFCell c = row1.getCell(0);
			String celllData = formatter.formatCellValue(c);
			if (celllData.equalsIgnoreCase("Scenario")) {
				XSSFCell s = row1.getCell(1);
				String reqdata = formatter.formatCellValue(s);
				sceanariolist = reqdata.split(";");
				break;
			}
		}
		wb.close();
		return sceanariolist;
	}

}
