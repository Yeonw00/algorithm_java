package example.may_05;

import java.util.*;

public class CharFrequencyCounter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
		String input = scanner.nextLine();
		
		Map<Character, Integer> freqMap = new LinkedHashMap<>();
		
		for(char c : input.toCharArray()) {
			freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
		}
		
		for(Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		scanner.close();
	}
}
