package readExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class REadExcel 
{

	public static void main(String[] args) throws IOException
	{

//		String loc= System.getProperty("user.dir");
//		FileInputStream file = new  FileInputStream(System.getProperty("user.dir")+ "/testData/caldata.xlsx");
		
		FileInputStream file = new  FileInputStream("/Users/milangowda/Documents/Java Eclipse- Pavan/JavaProgramming/OpencartV123/testData/data.xlsx"); 
		
        XSSFWorkbook workbook=new XSSFWorkbook(file);
//		
//		XSSFSheet sheet=workbook.getSheet("Sheet1");
//		
//		int totalrows=sheet.getLastRowNum(); //5
//		int totalcols=sheet.getRow(1).getLastCellNum();  //4
//		
//		System.out.println("Rows:"+totalrows);
//		System.out.println("Cells:"+totalcols);
//		
//		for(int r=0;r<=totalrows;r++)  //0 1 2
//		{
//			XSSFRow currentrow=sheet.getRow(r);  //0
//			
//			for(int c=0;c<totalcols;c++)
//			{
//				XSSFCell cell=currentrow.getCell(c);
//				System.out.print(cell.toString()+"      ");
//			}
//			System.out.println();
//		}
//		

     XSSFSheet sheet = workbook.getSheet("Sheet1");
     int totalrow= sheet.getLastRowNum();
	
     int totalcol = sheet.getRow(2).getLastCellNum();
     
     
     System.out.println("Rows:"+totalrow);
	System.out.println("Cells:"+totalcol);
	
	for(int r=0; r<=totalrow; r++)
	{
		XSSFRow currentrow = sheet.getRow(r);
		
		for(int c=0; c<totalcol; c++)
		{
			XSSFCell cell=currentrow.getCell(c);
			
			System.out.print(cell.toString()+"     ");
		}
		System.out.println();
		
	}
     
		
		
		
		
		
		file.close();
		
		
	}

}
