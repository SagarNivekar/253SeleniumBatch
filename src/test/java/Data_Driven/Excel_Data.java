package Data_Driven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFTableStyleInfo;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Data {
	public static Object[][] data123() throws IOException {
		
		DataFormatter df = new DataFormatter();
		FileInputStream input = new FileInputStream("C:\\Users\\Sagar\\OneDrive\\Desktop\\Testing\\Testng 123.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int noOfRows = sheet.getLastRowNum();
		int noOfCell = sheet.getRow(0).getLastCellNum();
		
		System.out.println(noOfRows);
		System.out.println(noOfCell);
		
		Object obj[][]=new Object [noOfRows+1][noOfCell];
		for(int i=0;i<=noOfRows;i++)
		{
			XSSFRow row=sheet.getRow(i);
			for (int j=0;j<noOfCell;j++)
			{
				XSSFCell cell = row.getCell(j);
				obj [i][j] =df.formatCellValue(cell);
			}
		}
		return obj;
	}
}
