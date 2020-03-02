package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//convert physical file or external file to java object		
FileInputStream fis=new FileInputStream("C:\\Users\\sandeep\\Desktop\\testScriptData.xlsx");
Workbook wb = WorkbookFactory.create(fis);
//set the cell value for writting
wb.getSheet("CreateCustomer").getRow(1).getCell(5).setCellValue("fail");
//open the file in write mode
FileOutputStream fos=new FileOutputStream("C:\\Users\\sandeep\\Desktop\\testScriptData.xlsx");
// write and save the file
wb.write(fos);
//close the file
wb.close();
	}
} 
