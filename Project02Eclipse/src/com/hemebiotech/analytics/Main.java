package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
	
	public static void main(String args[]) throws Exception {

		ISymptomReader read = new ReadSymptomDataFromFile("symptoms.txt");
		List<String> listSymptoms = read.GetSymptoms();
			
		AnalyticsCounter counter = new AnalyticsCounter();
		Map<String, Integer> organizedListSymptoms = counter.count(listSymptoms);
		
		ISymptomWriter write = new WriteSymptomDataInFile("result.out");
		write.WriteSymptom(organizedListSymptoms);
	}

}
