package example.may_06;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubstring {
	public static void main(String[] args) {
		String input = "abcabcbb";
		System.out.println("결과 : " + substringWord(input));
	}
	
	public static int substringWord(String s) {
		Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // 중복 있으면 왼쪽 포인터 앞으로 이동하면서 제거
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
	} 
}
