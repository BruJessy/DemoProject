package excelFile1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelReadWrite {
	
	//to read and write into excel we need 3 jar files 
	////excel : apache poi, apache poi ooxml, apache poi ooxml schema from mvnrepository
	@Test
	public void m1() throws IOException {
	File f = new File("C:\\Users\\BRUBRU\\Desktop\\Bru.xlsx");
	FileInputStream fis = new FileInputStream (f);
	
	//xlsx:XSSFWrokbook
	//xls:HSSFWorkbook
	
	XSSFWorkbook wb= new XSSFWorkbook(fis);  //converting sheet into workbook
	XSSFSheet sheet = wb.getSheetAt(0); //getting access to first sheet in the workbook and storing it in sheet
	
	//getting the number of rows
	int row = sheet.getLastRowNum();
	System.out.println("Number of rows " +row);
	
	//number of columns
	
	int col = sheet.getRow(0).getLastCellNum();
	System.out.println("Number of columns " +col);
	
	//reading
	XSSFCell data = sheet.getRow(2).getCell(2);
	System.out.println(data);

	//get a row : iterate column wise
	//Row1
	System.out.println("Row content : ");
	for(int i=0;i<col;i=i+1)
	{
		XSSFCell data1 = sheet.getRow(1).getCell(i);
		System.out.println(data1);
		//1,0   1,1  1,2   1,3   1,4   1,5
		}
	
	//column : row wise iteration
		System.out.println("column content : ");
		for(int i=0;i<row+1;i=i+1)
		{
		XSSFCell data2 = sheet.getRow(i).getCell(0);
		System.out.println(data2);
		//0,0   1,0   2,0  3,0      70,0 
		}
		
		//to write into excel
		//while writing into excel it need to be closed 
		
		sheet.getRow(10).createCell(2).setCellValue("bye");
		FileOutputStream fos= new FileOutputStream(f);
		wb.write(fos);
		
		  

	
	
	}
	


}