package com.sap.csv;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	public static void main(String[] args) {
		ExcelReader reader = new ExcelReader();
		List<String> roles = new ArrayList<String>();
		roles.add("Compliance Operator Lv1");
		roles.add("Alert Reviewer Level1");
		roles.add("Alert Reviewer Lev 1 SE1");
		roles.add("Alert Reviewer Level2");
		roles.add("Compliance Supervisor");
		roles.add("Compliance Auditor");
		roles.add("Compliance Support");
		roles.add("ListGo V");
		roles.add("System Admin");
		roles.add("User Admin");
		CsvWriter csvWriter = new CsvWriter();
		System.out.println("inside the parsers");
		try {
			csvWriter.writeCsv("/Users/harishgowrishetti/Desktop/SAP.csv", roles,
					reader.readExcel("/Users/harishgowrishetti/Desktop/Sample.xlsm", "SAP", 10), "Location ID", "Category");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<Map<String, String>> readExcel(String filePath, String sheetNameToParse, int categoryRowIndex)
			throws Exception {
		List<Map<String, String>> excelData = new ArrayList<Map<String, String>>();
		Map<Integer, String> locationColumnNames = new HashMap<Integer, String>();
		Map<Integer, String> categoryColumnNames = new HashMap<Integer, String>();
		FileInputStream excelFile = null;
		Workbook workBook = null;
		try {
			workBook = WorkbookFactory.create(new File(filePath));
			Sheet sheet = workBook.getSheet(sheetNameToParse);
			// Iterate through each rows one by one
			Iterator<Row> rowIterator = sheet.rowIterator();
			int rowIndex = 0;
			while (rowIterator.hasNext()) {
				Map<String, String> rowData = new HashMap<String, String>();
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				int columnIndex = 0;
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					if (rowIndex == 0) {
						locationColumnNames.put(columnIndex, cell.toString());
					} else if (categoryRowIndex == rowIndex) {
						categoryColumnNames.put(columnIndex, cell.toString());
					} else {
						if (rowIndex < categoryRowIndex) {
							rowData.put(locationColumnNames.get(cell.getColumnIndex()), cell.toString());
						} else if (rowIndex > categoryRowIndex) {
							rowData.put(categoryColumnNames.get(cell.getColumnIndex()), cell.toString());
						}
					}
					columnIndex++;
				}
				rowIndex++;
				if (!rowData.isEmpty()) {
					excelData.add(rowData);
				}
			}
		} catch (IOException e) {
			throw new Exception("Error while parsing excel");
		} finally {
			if (excelFile != null) {
				try {
					excelFile.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

		return excelData;
	}
	
}
