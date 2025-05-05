package test.example;

public class PalindromeCheck {
	public static void main(String[] args) {
		String input = "RaceCar";
		System.out.println("결과 : " + isPalindrome(input));
	}
	
	 public static boolean isPalindrome(String word) {
        String lowerWord = word.toLowerCase();
        String reverseWord = new StringBuilder(lowerWord).reverse().toString();
        return lowerWord.equals(reverseWord);
	 }
}
