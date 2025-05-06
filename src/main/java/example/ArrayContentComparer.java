package example;

import java.util.HashMap;
import java.util.Map;

public class ArrayContentComparer {
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,2};
		int[] nums2 = {2,3,1,2};
		int[] nums3 = {1,2,3};
		int[] nums4 = {1,1,2};
		System.out.println("결과 : " + isSameContent(nums1, nums2));
		System.out.println("결과 : " + isSameContent(nums3, nums4));
	}
	
	public static boolean isSameContent(int[] a, int[] b) {
        if (a.length != b.length) return false;

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : a) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : b) {
            if (!countMap.containsKey(num)) return false;

            countMap.put(num, countMap.get(num) - 1);
            if (countMap.get(num) < 0) return false;
        }

        return true;
    }
}
