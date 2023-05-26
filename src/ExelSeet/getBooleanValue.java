package ExelSeet;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getBooleanValue 
{
	 public static void main(String[] args) throws EncryptedDocumentException, IOException
	 {
		 
		 FileInputStream file=new FileInputStream("G:\\Velocity Testing\\28JanEve.xlsx");
		 boolean value = WorkbookFactory.create(file).getSheet("sheet1").getRow(2).getCell(2).getBooleanCellValue();
		 System.out.println(value);
	 }
}
