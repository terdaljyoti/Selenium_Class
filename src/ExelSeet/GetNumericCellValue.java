package ExelSeet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetNumericCellValue

{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("G:\\Velocity Testing\\28JanEve.xlsx");
		double value = WorkbookFactory.create(file).getSheet("sheet2").getRow(1).getCell(1).getNumericCellValue();
		System.out.println(value);
	}
	 

	 

 

}

