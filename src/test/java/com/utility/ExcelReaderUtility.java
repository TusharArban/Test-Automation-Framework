package com.utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ui.pojo.User;

public class ExcelReaderUtility {

	public static Iterator<User> readExcelData(String fileName) {

		File xlsxFile = new File(System.getProperty("user.dir") + "//testData//" + fileName);
		XSSFWorkbook xssfWorkbook;
		XSSFSheet xssfSheet;
		Iterator<Row> rowIterator;
		List<User> listUser = null;
		Row row;
		Cell usernameCell;
		Cell passwordCell;
		User user;

		try {
			xssfWorkbook = new XSSFWorkbook(xlsxFile);
			xssfSheet = xssfWorkbook.getSheet("LoginTestData");
			rowIterator = xssfSheet.iterator();
			listUser = new ArrayList<User>();
			rowIterator.next();

			while (rowIterator.hasNext()) {

				row = rowIterator.next();

				usernameCell = row.getCell(0);
				passwordCell = row.getCell(1);

				user = new User(usernameCell.toString(), passwordCell.toString());
				listUser.add(user);
				xssfWorkbook.close();

			}

		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listUser.iterator();

	}

}
