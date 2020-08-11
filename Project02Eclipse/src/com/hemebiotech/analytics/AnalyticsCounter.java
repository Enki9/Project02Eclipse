package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Put the elements of a list in a dictionary
 * The value of each symptom increases with each repetition
 */

public class AnalyticsCounter {
	
	public Map<String, Integer> count(List<String> listSymptoms) {
		Map<String, Integer> result = new TreeMap<String, Integer>();
		for(String line : listSymptoms) {
			if(result.containsKey(line)) {
				int number = result.get(line);
				result.put(line, number+1);
			}
			else 
				result.put(line, 1);
		}
		return result;
	}
}
