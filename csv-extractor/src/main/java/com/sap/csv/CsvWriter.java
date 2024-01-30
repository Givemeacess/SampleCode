package com.sap.csv;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVWriter;

public class CsvWriter {

	public void writeCsv(String filePath, List<String> roles, List<Map<String, String>> data, String header1Value,
			String header2Value) throws Exception {
		File file = new File(filePath);
		try {
			// create FileWriter object with file as parameter
			FileWriter outputfile = new FileWriter(file);

			// create CSVWriter object filewriter object as parameter
			CSVWriter writer = new CSVWriter(outputfile);

			// create a List which contains String array
			List<String[]> csvData = new ArrayList<String[]>();
			csvData.add(new String[] { "Role_Name", "ResName1" });
			if (data != null && roles != null) {
				for (String role : roles) {
					for (Map<String, String> rowData : data) {
						String roleData = rowData.get(role);
						if (roleData != null && !roleData.trim().isEmpty() && "x".equalsIgnoreCase(roleData)) {
							String resName1 = "";
							if (rowData.containsKey(header1Value)) {
								resName1 = rowData.get(header1Value);
							} else if (rowData.containsKey(header2Value)) {
								resName1 = rowData.get(header2Value);
							}
							csvData.add(new String[] { role, resName1 });
						}
					}
				}
			}
			writer.writeAll(csvData);

			// closing writer connection
			writer.close();
		} catch (IOException e) {
			throw new Exception("Error while writing Csv file");
		}

	}
}
