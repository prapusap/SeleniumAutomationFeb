package excelExample;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2 {

	public static void main(String[] args) throws Exception {
		

		FileInputStream fis = new FileInputStream("./data/RegisterStudent.xls");
		
		
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		
		
		
		//workbook.getSheetAt(1); 				//indexing start from 0
		HSSFSheet sheet = workbook.getSheet("smokeTest");			//SheetName - smokeTest/Student

	
		//no of rows in Sheet
		int rowcount = sheet.getLastRowNum();     		
		
		
		//Column count
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		
		System.out.println("Rows Count: " + rowcount);
		System.out.println("Columns Count: " + columnCount);
	
		
		
		for (int i = 1; i <= rowcount; i++) {
			
			
			
			//column - 0
			String firstName = sheet.getRow(i).getCell(0).toString();
			
			System.out.println("FirstName : " + firstName);
			
		}
		
	
	}

	
	
	
}
