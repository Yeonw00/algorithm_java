package test.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentNumber {
	public static void main(String[] args) {
		int[] nums = {1, 2, 2, 3, 3, 3, 4};
		System.out.println("결과 : " + frequentNumber(nums));
	}
	
	public static int frequentNumber(int[] nums) {
		Map<Integer, Integer> freqMap = new HashMap<>();
		
		for (int num : nums) {
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
		}
		
		int maxFreq = 0;
        int mostFrequent = nums[0];

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        return mostFrequent;
	}
}
