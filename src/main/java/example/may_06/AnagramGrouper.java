package example.may_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGrouper {
	public static void main(String[] args) {
		String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println("결과 : " + groupingWords(words));
	}
	
	public static List<List<String>> groupingWords(String[] words) {
		Map<String, List<String>> map = new HashMap<>();
		
		for (String word : words) {
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			String key = new String(chars);
			
			// 해당 키에 해당하는 그룹에 단어 추가
			// 람다 사용ver
//           map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
			
			// 람다 없이 키 존재 여부 확인 후 처리
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<String>());
            }

            map.get(key).add(word);
		}
		// 모든 그룹을 리스트로 반환
        return new ArrayList<>(map.values());
	}
}
