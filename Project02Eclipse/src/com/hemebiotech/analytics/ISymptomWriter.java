package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

public interface ISymptomWriter {
	
	void WriteSymptom(Map<String, Integer> organizedListSymptoms) throws IOException;

}
