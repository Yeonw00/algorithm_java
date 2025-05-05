package test.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesAndSort {
	public static void main(String[] args) {
		String[] words = {"banana", "apple", "banana", "cherry"};
		System.out.println("결과 : " + removeDuplicatesAndSort(words));
	}
	
	public static List<String> removeDuplicatesAndSort(String[] words) {
		Set<String> newWords = new HashSet<>(Arrays.asList(words));
		List<String> list = new ArrayList<>(newWords);
		Collections.sort(list);
		return list;
	}
}
