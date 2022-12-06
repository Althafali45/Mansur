package datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	private static void readData() throws IOException {
		File f = new File("https://d.docs.live.net/3b1c9b465458e1fb/Documents/Details.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheetAt = wb.getSheetAt(0);

		Row row = sheetAt.getRow(0);

		Cell cell = row.getCell(0);

		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);

		}
		else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int data = (int)numericCellValue;
			System.out.println(data);
			
		}
		wb.close();
		

	}
	public static void main(String[] args) throws IOException {
		readData();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
