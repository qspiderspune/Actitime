package com.actitime.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this class is used to read and write the data from external file
 * @author sandeep
 */
public class FileLib {
	/**
	 * used to read the data from property file
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyData(String key) throws IOException {
    FileInputStream fis=new FileInputStream("./data/commondata.properties");
	Properties p=new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;
	}
	/**
	 * used to read the data from Excel file
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return value
	 * @throws Exception
	 */
	public String getExcelData(String sheetname,int row,int cell) throws Exception {
FileInputStream fis=new FileInputStream("./data/testScriptData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
String value = wb.getSheet(sheetname).getRow(row).getCell(cell).toString();
	return value;
	}
/**
 * writting the data back to excel	
 * @param sheetname
 * @param row
 * @param cell
 * @param setvalue
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public void setExcelData(String sheetname,int row,int cell,String setvalue) throws Exception {
FileInputStream fis=new FileInputStream("./data/testScriptData.xlsx");
Workbook wb = WorkbookFactory.create(fis);
wb.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(setvalue);
FileOutputStream fos=new FileOutputStream("./data/testScriptData.xlsx");
wb.write(fos);
wb.close();		
	}
}
