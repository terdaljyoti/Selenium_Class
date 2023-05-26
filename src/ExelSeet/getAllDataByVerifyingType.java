package ExelSeet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.sun.jdi.Value;

public class getAllDataByVerifyingType
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("G:\\Velocity Testing\\SeleniumPractice.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		
		int LastRowIndex = sh.getLastRowNum();
		for(int i=0;i<=LastRowIndex;i++)
		{
			int LastCellIndex = sh.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=LastCellIndex;j++)
			{
				 Cell cellInfo = sh.getRow(i).getCell(j);
				 CellType type = cellInfo.getCellType();
				if(type==CellType.STRING)
				{
					String Value = cellInfo.getStringCellValue();
					System.out.print(Value+" ");
				}
				if(type==CellType.NUMERIC)
				{
					double Value = cellInfo.getNumericCellValue();
					System.out.print(Value+" ");
				}
				if(type==CellType.BOOLEAN)
				{
					boolean Value = cellInfo.getBooleanCellValue();
					System.out.print(Value+" ");
				}
			}
			System.out.println();
		}
		
	}

}
