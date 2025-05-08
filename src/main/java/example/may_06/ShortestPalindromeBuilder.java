package example.may_06;

public class ShortestPalindromeBuilder {
	public static void main(String[] args) {
		String input = "abcd";
		System.out.println("결과 : " + makePalindrome(input));
	}
	
	public static String makePalindrome(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i=s.length()-1; i>0; i--) {
			sb.append(s.charAt(i));
		}
		sb.append(s);
		return sb.toString();
	}
}
