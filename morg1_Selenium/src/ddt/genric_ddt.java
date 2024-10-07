package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class genric_ddt 
{
	static String path="C:\\Users\\lenovo\\Desktop\\data123.xlsx";
	static String value;
	public  static String ddt(String sheet,int row,int cell )
	{
		try 
		{
			FileInputStream fis=new FileInputStream(path);
			Workbook book = WorkbookFactory.create(fis);
			Sheet sh = book.getSheet(sheet);
		    value = sh.getRow(row).getCell(cell).toString();	
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return value;
	
	}
}
