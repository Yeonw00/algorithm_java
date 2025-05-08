package example.may_06;

public class MissingNumberSum {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 6, 7, 8, 0};
		int n = 9;
		System.out.println("결과 : " + findSum(nums, 9));
	}
	
	public static int findSum(int[] nums, int N) {
	    int expectedSum = N * (N + 1) / 2;
	    int actualSum = 0;
	    for (int num : nums) {
	        actualSum += num;
	    }
	    return expectedSum - actualSum;
	}
}
