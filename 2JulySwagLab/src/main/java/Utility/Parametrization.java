package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Parametrization{
public static String Getsheetdata(String Sheet, int row, int cell) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("C:\\Users\\Rohit Ombase\\Desktop\\Workspace\\2JulySwagLab\\src\\test\\resources\\TestData.xlsx");
    String Value = WorkbookFactory.create(file).getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
	return Value;
}	
}