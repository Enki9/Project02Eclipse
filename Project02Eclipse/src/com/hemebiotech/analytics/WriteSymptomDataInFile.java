package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Simple brute force implementation
 *
 */

public class WriteSymptomDataInFile implements ISymptomWriter {
	
	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to create file and write symptoms in it
	 */
	
	public WriteSymptomDataInFile (String filepath) {
		this.filepath = filepath;
	}

	@Override
	public void WriteSymptom(Map<String, Integer> organizedListSymptoms) throws IOException {
		
		FileWriter writer = new FileWriter (filepath);
		
		for(String s : organizedListSymptoms.keySet()) 
			writer.write(s + ": " + organizedListSymptoms.get(s) + "\n");
		writer.close();
		
	}
}
