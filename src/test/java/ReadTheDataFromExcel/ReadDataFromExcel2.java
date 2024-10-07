package ReadTheDataFromExcel;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel2 {

	
	void data() throws IOException {
		DataFormatter df = new DataFormatter();
		XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\Sagar\\OneDrive\\Desktop\\Testing\\Testng 123.xlsx");
	XSSFSheet sheet  = workbook.getSheet("Sheet1");
	
	
	int numberOfRows=sheet.getLastRowNum();
//	System.out.println(numberOfRows);
//	
	int noOfColumn = sheet.getRow(0).getLastCellNum();
//	System.out.println(noOfColumn);
	
	for(int i=0; i<=numberOfRows;i++)
	{
	XSSFRow	row =sheet.getRow(i);
		
		for (int j=0;j<noOfColumn;j++) 
		{
			XSSFCell cell =row.createCell(j);
			
		
			String data= df.formatCellValue(cell);
			System.out.println(data+" || ");
		}
		
	}
	
	
	
	
	
	}
}

