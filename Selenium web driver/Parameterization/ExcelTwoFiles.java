//Employee Id: 20450630
//Consider 2 excel file file1.xlsx and file2.xlsx with 5 names in each file. Names can be same or different. Wirte the code to display common names in the console after comparing both files, if any.


package javaProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelTwoFiles
{
      FileInputStream f1, f2;
      XSSFWorkbook wb1, wb2;
      XSSFSheet sh1,sh2;
      
      public void file1SetUp() throws Exception
      {
            f1 = new FileInputStream("D:\\file1.xlsx");
            wb1 = new XSSFWorkbook(f1);
            sh1 = wb1.getSheet("Sheet1");
      }
      public void file2SetUp() throws Exception
      {
            f2 = new FileInputStream("D:\\file2.xlsx");
            wb2 = new XSSFWorkbook(f2);
            sh2 = wb2.getSheet("Sheet1");
      }
      public void FileSameContent()
      {
            Row row1, row2;
            for(int i=0; i<sh1.getLastRowNum(); i ++)
            {
                  row1 = sh1.getRow(i);
                  for(int j=0; j<sh2.getLastRowNum(); j ++)
                  {
                        row2 = sh2.getRow(j);
                        if(row1.getCell(0).getStringCellValue().matches(row2.getCell(0).getStringCellValue()))
                        {
                              System.out.println(row1.getCell(0).getStringCellValue());
                        }
                  }
            }
      }

      public static void main(String[] args) throws Exception
      {
            ExcelTwoFiles etc = new ExcelTwoFiles();
            etc.file1SetUp();
            etc.file2SetUp();
            etc.FileSameContent();
      }

}