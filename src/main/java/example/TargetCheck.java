package test.example;

import java.util.HashSet;
import java.util.Set;

public class TargetCheck {
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		System.out.println("결과 : " + isTargetIn(nums, target));
	}
	
	public static boolean isTargetIn(int[] nums, int target) {
		Set<Integer> seen = new HashSet<>();

        for (int num : nums) {
            int complement = target - num;
            if (seen.contains(complement)) {
                return true;
            }
            seen.add(num);
        }

        return false;
	}
}
