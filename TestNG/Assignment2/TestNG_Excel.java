//Employee ID:-20450630
//Write the Automation script to reading excel file (f1.xlsx)
//which contains 5 name and write only the last name from f1.xlsx to f2.xlsx file  
package testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Excel {
      FileInputStream fin1,fin2;
      FileOutputStream fout;

      XSSFWorkbook wb1,wb2;
      XSSFSheet ws1,ws2;

      Row row1,row2;
      Cell cell;

      @BeforeClass
      public void initialize() throws Exception
      {
            fin1=new FileInputStream("d:\\f1.xlsx");
            fin2=new FileInputStream("d:\\f2.xlsx");
            
            wb1=new XSSFWorkbook(fin1);
            wb2=new XSSFWorkbook(fin2);

            ws1=wb1.getSheet("Sheet1");
            ws2=wb2.getSheet("Sheet1");         
      }

      @Test
      public void readandwrite() throws Exception
      {
            
            for(int i=0;i<=ws1.getLastRowNum();i++)
            {
                  row1=ws1.getRow(i);
                  row2=ws2.createRow(i);
                  String str=row1.getCell(0).getStringCellValue().split(" ")[1];                            
                  row2.createCell(0).setCellValue(str); // In first column                
            }
            fout=new FileOutputStream("d:\\f2.xlsx");
            wb2.write(fout);        
      }

      @AfterClass
      public void tearDown() throws Exception
      {
            fout.close();
      }
      
      }