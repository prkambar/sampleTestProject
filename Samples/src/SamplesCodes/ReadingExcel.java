package SamplesCodes;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src = new File("E:\\PR\\Software\\demo.xlsx");
		try{
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("SampleCredentials");
				System.out.println(sheet.getSheetName());
		}
		catch(Exception r) {
			System.out.println("failed");
		}
		
		
		
	}

}
