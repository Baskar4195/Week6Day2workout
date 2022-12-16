package Week6Day2Workout;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readData(String fileName) throws IOException {
		// Setup the path for workbook
		XSSFWorkbook wb = new XSSFWorkbook("./SampleData/"+fileName+".xlsx");

		// Get into the respective sheet
		// wb.getSheet("Sheet1");
		XSSFSheet ws = wb.getSheetAt(0);

		// get the number of rows with data
		int rowCount = ws.getLastRowNum();
		// int allRowsCount = ws.getPhysicalNumberOfRows();

		//to get the number of column with data
		int cellCount = ws.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowCount][cellCount];
		// Get into the specific row
		for (int i = 1; i <= rowCount; i++) {
			for(int j = 0; j < cellCount; j++) {
			XSSFRow row = ws.getRow(i);
			XSSFCell cell = row.getCell(j);
			String cellValue = cell.getStringCellValue();
			data[i-1][j]= cellValue;
			
			
			System.out.println(cellValue);
			}
		}

		// Get into the specific row
		// XSSFRow row = ws.getRow(1);

		// Get into the specific column or cell
		/*
		 * XSSFCell cell = row.getCell(0);
		 * 
		 * //read the data from the cell String SampleData = cell.getStringCellValue();
		 * System.out.println(SampleData);
		 */
		// close the workbook
		wb.close();
		
		return data;
	}

}
