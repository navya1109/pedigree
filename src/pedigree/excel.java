package pedigree;


	
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class excel {
		
		public static String value1;
		public static String value2;
		
		public static String getvalue1() throws Exception 
		{
			try {
			FileInputStream fi = new FileInputStream("C://Users//welcome//Desktop//Input.xlsx"); 
			XSSFWorkbook wb = new XSSFWorkbook(fi); 
			XSSFSheet sh = wb.getSheet("sheet1"); 
			value1=sh.getRow(0).getCell(0).getStringCellValue(); 
			wb.close();
			  }
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return value1;
			 

		    
		    
			
		}
		public static void setvalue2(String var) throws Exception
		{
			FileOutputStream fo=new FileOutputStream("C://Users//welcome//Desktop//Output.xlsx");
			XSSFWorkbook wb2=new XSSFWorkbook();
			XSSFSheet sh2=wb2.createSheet("New");
			sh2.createRow(0).createCell(1).setCellValue(var);
			wb2.write(fo);
			wb2.close();
			
			
			
			
		}

	}


