package excelApachePOIconcept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DataProviderExcel {
	
	@DataProvider
	public String[][] dataDrivenData() throws IOException {
		String username,password;
		String[][] data;
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\User\\Desktop\\eclipse"
				+ "\\JavaTraining\\src\\excelApachePOIconcept\\Book1.xlsx"));
		Workbook excelWorkbook = new XSSFWorkbook(fis);
		Sheet sheet = excelWorkbook.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		data = new String[rowCount-1][2];
		for(int i=1; i<rowCount; i++) {
			Row row = sheet.getRow(i);
			username = row.getCell(0).toString();
			password = row.getCell(1).toString();
			data[i-1][0] = username;
			data[i-1][1] = password;
		}
		return data;
	}

}
