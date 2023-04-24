package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example2_PrintRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\java\\new\\ExcelSheets\\Excel1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		  short Cellsize = sh.getRow(3).getLastCellNum();
		  
		  for(int i = 0;i <= Cellsize -1; i++) {
		 String data = sh.getRow(3).getCell(i).getStringCellValue();
		System.out.println(data);
		
	}
}
}