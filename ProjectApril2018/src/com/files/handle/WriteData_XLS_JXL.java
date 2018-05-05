package com.files.handle;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteData_XLS_JXL {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		String fldpath = "D:/Selenium2018downloads/Files/ExcelFiles";
		WritableWorkbook wb;// = 
		WritableSheet ws;// = wb.createSheet(arg0, arg1)
		Label lb;
		Number nb;
		wb = Workbook.createWorkbook(new File(fldpath+"/JXL.xls"));
		wb.createSheet("Shabhash", 0);
		ws = wb.getSheet("Shabhash");
		lb =  new Label(0, 0,"S.NO");
		ws.addCell(lb);
		nb = new Number(0, 1, 1);
		ws.addCell(nb);
		lb = new Label(1, 0, "EmployeeNumber");
		ws.addCell(lb);
		nb = new jxl.write.Number(1, 1, 35927);
		ws.addCell(nb);
		
		nb = new jxl.write.Number(0, 2, 2);
		ws.addCell(nb);
		nb = new jxl.write.Number(1, 2, 35929);
		ws.addCell(nb);

		wb.write();
		wb.close();
	}

}
