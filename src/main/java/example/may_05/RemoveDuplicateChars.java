package example.may_05;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateChars {
	public static void main(String[] args) {
		String input = "banana";
		System.out.println("결과 : " + removeDuplicate(input));
	}
	
	public static String removeDuplicate(String s) {
	    Set<Character> seen = new LinkedHashSet<>();
	    for (char c : s.toCharArray()) {
	        seen.add(c);  // 이미 있으면 자동으로 무시됨
	    }

	    StringBuilder sb = new StringBuilder();
	    for (char c : seen) {
	        sb.append(c);
	    }

	    return sb.toString();
	}
}
