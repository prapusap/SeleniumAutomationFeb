package excelExample;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws Exception {
		

		FileInputStream fis = new FileInputStream("./data/RegistrationData.xlsx");
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		
		
		//workbook.getSheetAt(1); 				//indexing start from 0
		XSSFSheet sheet = workbook.getSheet("Student");			//SheetName - smokeTest/Student

	
		//no of rows in Sheet
		int rowcount = sheet.getLastRowNum();     		
		
		
		
		//no of rows  sheet.getLastRowNum() - sheet.getFirstRowNum()
		
		
		
		
		
		//sheet.getPhysicalNumberOfRows();
		
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
