package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

/**
 * Receive a dictionary with a value associated with each symptom
 * The dictionary is copied 
 */

public interface ISymptomWriter {
	
	void writeSymptom(Map<String, Integer> organizedListSymptoms) throws IOException;

}
