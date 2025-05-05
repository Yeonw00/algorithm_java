package test.example;

public class DigitSumInString {
	public static void main(String[] args) {
		String input = "a1b2c3";
		System.out.println("결과 : " + digitSum(input));
	}
	
	public static int digitSum(String s) {
		int sum = 0;
		
		for (char c : s.toCharArray()) {
			if(Character.isDigit(c)) {
				sum += c - '0';
			}
		}
		return sum;
	}
}
