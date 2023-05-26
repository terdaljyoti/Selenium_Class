package ExelSeet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortBy;

import com.sun.jdi.Value;
public class getAllDataFromColByVerifyingType 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("G:\\Velocity Testing\\SeleniumPractice.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
		int LastRowIndex = sh.getLastRowNum();
		
		for(int i=0;i<=LastRowIndex;i++)
		{
			Cell cellInfo = sh.getRow(i).getCell(0);
			CellType type = cellInfo.getCellType();
			
			if(type==CellType.STRING)
			{
				String Value = cellInfo.getStringCellValue();
				System.out.println(Value);
				
			}
			if(type==CellType.NUMERIC)
			{
				double Value = cellInfo.getNumericCellValue();
				System.out.println(Value);
				
			}
			if(type==CellType.BOOLEAN)
			{
				boolean Value = cellInfo.getBooleanCellValue();
				System.out.println(Value);
				
			}
			
		}
		
	}

}
