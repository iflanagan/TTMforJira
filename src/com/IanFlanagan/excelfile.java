package com.IanFlanagan;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;

import static com.IanFlanagan.excelfile.MyEnum.CELL_TYPE_NUMERIC;
import static com.IanFlanagan.excelfile.MyEnum.CELL_TYPE_STRING;
import static org.apache.poi.ss.usermodel.Cell.*;

/*
import static com.IanFlanagan.excelfile.MyEnum.CELL_TYPE_NUMERIC;
import static com.IanFlanagan.excelfile.MyEnum.CELL_TYPE_STRING;
*/


public class excelfile {

    private static final String FILE_NAME = "testcasefile.xlsx";

    enum MyEnum { CELL_TYPE_NUMERIC, CELL_TYPE_STRING };

    public static void main(String[] args) throws IOException {

        /*
        try
        {
            FileInputStream file = new FileInputStream(new File("howtodoinjava_demo.xlsx"));

            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext())
            {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();

                while (cellIterator.hasNext())
                {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType())
                    {
                     //   case Cell.CELL_TYPE_NUMERIC:
                        case CELL_TYPE_NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "t");
                            break;
                        case CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue() + "t");
                            break;
                        default:
                            System.out.println("Major issue");
                    }
                }
                System.out.println("");
            }
            file.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        // here


         */
    }

}

