package ExelSeet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class getTypoeOfCell
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("G:\\Velocity Testing\\SeleniumPractice.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		CellType type =sh.getRow(0).getCell(0).getCellType();
		System.out.println(type); 
		
		CellType type_1 =sh.getRow(1).getCell(1).getCellType();
		System.out.println(type_1);
		
		
	}

}
