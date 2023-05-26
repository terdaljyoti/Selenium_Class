package ExelSeet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.sun.jdi.Value;

public class getDataByVerifyingTypeOfCell
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("G:\\Velocity Testing\\SeleniumPractice.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		Cell cellInfo = sh.getRow(0).getCell(0);
		CellType type = cellInfo.getCellType();
		
		if(type==CellType.STRING)
		{
			String Value = cellInfo.getStringCellValue();
			System.out.println(Value);
		}
		else if(type==CellType.NUMERIC)
		{
			double Value = cellInfo.getNumericCellValue();
			System.out.println(Value);
			
		}
		else if (type==CellType.BOOLEAN)
		{
		boolean Value = cellInfo.getBooleanCellValue();
		System.out.println(Value);
		}
	}

}
