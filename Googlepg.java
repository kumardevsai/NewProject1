package seleniumprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Googlepg {

	public static void main(String[] args) {

		try {
			File src = new File("C:\\Personel\\ExcelReadingEmailids.xlsx");
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = 	wb.getSheet("Empids");
		int numrows = sh.getLastRowNum();
			for(int i =0;i<=numrows;i++)
			{
			String emailid = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(emailid);
			}
			} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
				
				e.printStackTrace();
			}
		
	}

}
