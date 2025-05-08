package example.may_06;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordFrequencyCounter {
	public static void main(String[] args) {
		String input = "Apple banana apple orange apple Banana";
		countWord(input);
	}
	
	public static void countWord(String s) {
		String[] words = s.split(" ");
		Map<String, Integer> wordMap = new LinkedHashMap<>();
		for (String word : words) {
			String lowerWord = word.toLowerCase();
			wordMap.put(lowerWord, wordMap.getOrDefault(lowerWord, 0) + 1);
		}
		
		for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
