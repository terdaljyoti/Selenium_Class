package ExelSeet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.sun.jdi.Value;

public class getAllDataInACol
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("G:\\Velocity Testing\\SeleniumPractice.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		int lastRowIndex = sh.getLastRowNum();
		
		for(int i=0;i<=lastRowIndex;i++)
		{
			String Value = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(Value);
		}
		
	}
	

}
