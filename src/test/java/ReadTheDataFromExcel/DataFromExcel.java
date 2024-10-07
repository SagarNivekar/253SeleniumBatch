package ReadTheDataFromExcel;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class DataFromExcel {
	//steps to follow for excel
	//1.Read The File
	//2.Find The Sheets
	//3.Count The Rows
	//4.Count The Columns
    //5.Fetch The Data
	
	@Test
	void data() throws IOException {
		DataFormatter df = new DataFormatter();
		XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\Sagar\\OneDrive\\Desktop\\Testing\\Testng 123.xlsx");
	XSSFSheet sheet  = workbook.getSheet("Sheet1");
	
	
//	int numberOfRows=sheet.getLastRowNum();
//	System.out.println(numberOfRows);
//	
//	int noOfColumn = sheet.getRow(0).getLastCellNum();
//	System.out.println(noOfColumn);
	
	for(Row row:sheet)
	{
		for (Cell cell:row) {
			
//			switch(cell.getCellType())
//			{
//			case STRING:System.out.println(cell.getStringCellValue());
//			case NUMERIC:System.out.println(cell.getNumericCellValue());
//			case BOOLEAN:System.out.println(cell.getBooleanCellValue());
//			
//			}
//		
		
			String data= df.formatCellValue(cell);
			System.out.println(data+"||");
		}
		
	}
	
	
	
	
	
	}
}
