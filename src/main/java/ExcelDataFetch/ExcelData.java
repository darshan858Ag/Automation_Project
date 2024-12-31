package ExcelDataFetch;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\VMCS\\Desktop\\Selenium\\Test_NG\\ExcelSheet\\newExcel.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(file);
        
        XSSFSheet sheet=workbook.getSheet("Sheet1");
        //fetch particular data from excel
       // String text1=sheet.getRow(0).getCell(0).getStringCellValue();
       // String text2=sheet.getRow(0).getCell(1).getStringCellValue();
       // System.out.println(text1);
       // System.out.println(text2);
        
        //fetch all data from excel at a time
        int numberofRows=sheet.getLastRowNum();
        System.out.println(numberofRows);
        
       int numberofcolumns= sheet.getRow(0).getLastCellNum();
       System.out.println(numberofcolumns);
       
       for(int i=0;i<numberofRows;i++)
       {
    	   XSSFRow row=sheet.getRow(i);
    	   for(int j=0;j<numberofcolumns;j++)
    	   {
    		   XSSFCell cell=row.getCell(j);
    		   String data=cell.getStringCellValue();
    		   System.out.println(data+" | ");
    	   }
    	   System.out.println();
       }
	}

}
