package ExelSeet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class getColSizeInRow
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{

		FileInputStream file=new FileInputStream("G:\\Velocity Testing\\SeleniumPractice.xlsx");
		short ColSize = WorkbookFactory.create(file).getSheet("Sheet3").getRow(0).getLastCellNum();
		
		System.out.println(ColSize); 
		
	}

}
