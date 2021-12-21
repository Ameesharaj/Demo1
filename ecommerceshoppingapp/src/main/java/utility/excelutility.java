package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class excelutility {
	public String readdata(String Sheet,int row,int cell) throws IOException {
		FileInputStream fis=new FileInputStream(Ipathconstants.Excelpath);
		Workbook wbf=WorkbookFactory.create(fis);
		String cellvalue=wbf.getSheet(Sheet).getRow(row).getCell(cell).getStringCellValue();
		return cellvalue;
		
	}
}


