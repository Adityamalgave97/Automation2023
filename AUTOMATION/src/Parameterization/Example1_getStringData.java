package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1_getStringData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\java\\new\\ExcelSheets\\Excel1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		String data1 = sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
		
		String data2 = sh.getRow(1).getCell(0).getStringCellValue();
	    System.out.println(data2);
	    
	     double data3 = sh.getRow(0).getCell(1).getNumericCellValue();
	    System.out.println(data3);
	    
	    int D3 = (int)data3;
	    System.out.println(D3);
	    
	    boolean data4 = sh.getRow(0).getCell(2).getBooleanCellValue();
	    System.out.println(data4);
	    
	     String data5 = sh.getRow(1).getCell(1).getStringCellValue();
	    System.out.println(data5);
	    
	     int rowsize = sh.getLastRowNum();
	     System.out.println(rowsize);
	     System.out.println(rowsize+1);
	     
	     short data6 = sh.getRow(0).getLastCellNum();
	     System.out.println(data6);
	
	}
	
}
