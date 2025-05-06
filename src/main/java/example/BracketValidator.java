package example;

import java.util.Stack;

public class BracketValidator {
	public static void main(String[] args) {
//		String input = "{[()()]}";
		String input = "{[(])}";
		
		System.out.println("결과 : " + isBracketValid(input));
	}
	
	public static boolean isBracketValid(String brackets) {
		Stack<Character> stack = new Stack<>();
		
		for (char c : brackets.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if(c == ')' || c == '}' || c == ']') {
				if(stack.isEmpty()) return false;
				
				char top = stack.pop();
				
				boolean result = isParenthese(top, c);
				if(!result) return false;
			}
		}
		return stack.isEmpty();
	}
	
	public static boolean isParenthese(char open, char close) {
		return (open == '(' && close == ')')||
				(open == '{' && close == '}')||
				(open == '[' && close == ']');
	}
}
