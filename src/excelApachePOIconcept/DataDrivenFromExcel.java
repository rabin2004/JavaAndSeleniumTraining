package excelApachePOIconcept;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenFromExcel {

	public static void main(String[] args) throws IOException {
		// provide path of the excel file
		File file = new File("C:\\Users\\User\\Desktop\\eclipse\\JavaTraining\\src\\"
				+ "excelApachePOIconcept\\Book1.xlsx");
		// read excel file
		FileInputStream fis = new FileInputStream(file);
		// create workbook
		Workbook excelWorkbook = new XSSFWorkbook(fis);
		// get to the specific sheet of the workbook
		Sheet workbookSheet = excelWorkbook.getSheet("Sheet1");
		
		// get the number of rows with data - as first row has column name only
		int rowCount = workbookSheet.getLastRowNum()-workbookSheet.getFirstRowNum();
		
		System.out.println(rowCount);
		
		// traversing through rows
		for(int i=0; i<=rowCount; i++) {
			Row row = workbookSheet.getRow(i);
			
			// traversing through each column in each row
			for (int j = 0; j < row.getLastCellNum(); j++) {
				// extracting data through each cell
				System.out.print(row.getCell(j).getStringCellValue()+"|| ");
			}
			System.out.println();
		}
	}

	
}
