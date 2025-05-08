package example.may_06;

public class RotatedArrayMinFinder {
	public static void main(String[] args) {
		int[] nums = {4, 5, 6, 1, 2, 3};
		System.out.println("결과 : " + findMinNum(nums));
	}
	
	public static int findMinNum(int[] nums) {
		int left = 0;
	    int right = nums.length - 1;

	    while (left < right) {
	        int mid = (left + right) / 2;

	        if (nums[mid] > nums[right]) {
	            left = mid + 1;
	        } else {
	            right = mid;
	        }
	    }
	    return nums[left];
	}
}
