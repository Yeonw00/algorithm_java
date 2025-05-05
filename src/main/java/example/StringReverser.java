package test.example;

public class StringReverser {
	public static void main(String[] args) {
		String input = "hello";
		System.out.println("결과 : " + reverseString(input));
	}
	
	public static String reverseString(String word) {
		return new StringBuilder(word).reverse().toString();
	}
}
