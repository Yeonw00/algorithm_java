package example.may_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentChar {
	public static void main(String[] args) {
		String input = "aaabbbccdd";
		System.out.println("결과 : " + mostFrequentChar(input));
	}
	
	public static String mostFrequentChar(String word) {
		Map<Character, Integer> freqMap = new HashMap<>();
		
		for(char c : word.toCharArray()) {
			freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
		}
		
		int maxFreq = Collections.max(freqMap.values());
		
		List<String> result = new ArrayList<>();
		for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == maxFreq) {
                result.add(entry.getKey() + ": " + entry.getValue());
            }
        }
		
		return String.join(", ", result);
		
	}
}
