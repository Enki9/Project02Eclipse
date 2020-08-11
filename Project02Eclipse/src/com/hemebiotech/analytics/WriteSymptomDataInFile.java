package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * Receive a dictionary with a value associated with each symptom
 * The dictionary is copied to a file
 */

public class WriteSymptomDataInFile implements ISymptomWriter {

	@Override
	public void WriteSymptom(Map<String, Integer> organizedListSymptoms) throws IOException {
		
		FileWriter writer = new FileWriter ("result.out");
		
		for(String s : organizedListSymptoms.keySet()) 
			writer.write(s + ": " + organizedListSymptoms.get(s) + "\n");
		writer.close();
		
	}
}
