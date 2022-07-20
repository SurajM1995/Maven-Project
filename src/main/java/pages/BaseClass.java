package pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public abstract class BaseClass {
	
	Properties prop;
	
	public BaseClass() throws IOException {
		
		prop = new Properties();
		
		String path = System.getProperty("user.dir")+"\\config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		
		
	}
	
	
	public static String readdata(int row, int cell) throws IOException {
		
		File scr = new File("C:\\Users\\Suraj\\Documents\\my sheet 1.xlsx");
		
		FileInputStream fis = new FileInputStream(scr);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Sheet4");
		
		DataFormatter df = new DataFormatter();
		
		String value = df.formatCellValue(sh.getRow(row).getCell(cell));
		
		return value;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
