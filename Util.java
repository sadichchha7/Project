package util;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

public class Util {
	public static Object[][] getExcelData(String excelsheetpath, String sheetname) throws IOException {
		System.out.println(excelsheetpath + "excelsheetpath");
		System.out.println(sheetname + "sheetname");
		Object[][] Data = null;
		DataFormatter formatter = new DataFormatter();
		FileInputStream fileinputstream = new FileInputStream(excelsheetpath);
		XSSFWorkbook wb = new XSSFWorkbook(fileinputstream);
		XSSFSheet worksheet = wb.getSheet(sheetname);
		Assert.assertNotNull(worksheet);
		XSSFRow row = worksheet.getRow(0);
		System.out.println(row + "row");
		int lastRowIndex = worksheet.getLastRowNum();
		System.out.println(lastRowIndex + "lastRowIndex");
		int Coloumn = row.getLastCellNum();
		System.out.println(Coloumn + "Coloumn");
		int totalNumberOfColoumn = row.getLastCellNum() - 1;
		System.out.println(totalNumberOfColoumn + "totalNumberOfColoumn");
		
		Data = new Object[totalNumberOfColoumn][lastRowIndex];
		System.out.println(Data +"Data");
		for (int i = 1; i <= totalNumberOfColoumn; i++) {
			for (int j = 0; j < lastRowIndex; j++) {
				XSSFRow row1 = worksheet.getRow(j + 1);
				XSSFCell c = row1.getCell(i);
				String cellData = formatter.formatCellValue(c);
				System.out.println(cellData + "cellData");
				
				Data[i-1][j] = cellData;
				

			}
			System.out.println("---------------------");
		}
		wb.close();
		return Data;
	}

}
