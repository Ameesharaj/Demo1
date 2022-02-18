package propertyfile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class readfromexcel {
public static void main(String[]args) throws IOException {
	FileInputStream fis= new FileInputStream("./excel2.xlsx");
	Workbook wbf = WorkbookFactory.create(fis);
	for (int i=0;i<=1;i++) {
		for(int j=i;j<=10;j++) {
			String value=wbf.getSheet("sheet1").getRow(j).getCell(i).getStringCellValue();
			System.out.println(value);
		}
	}
	
	
}
}
