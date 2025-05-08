package example.may_06;

import java.util.Stack;

public class MinAddToMakeValidParentheses {
	public static void main(String[] args) {
		String input = "())";
		
		System.out.println("결과 : " + makeValidParentheses(input));
	}
	
	
	public static int makeValidParentheses(String s) {
		// 스택 사용 ver.
//		Stack<Character> stack = new Stack<>();
//		int result = 0;
//		
//		for(char c : s.toCharArray()) {
//			if (c == '(') {
//				stack.push(c);
//			} else if (c == ')') {
//				if(stack.isEmpty()) {
//					result ++;
//				} else {
//					stack.pop();
//				}
//			}
//		}
//		return stack.size() + result;
		
		// 스택 사용하지 않은 ver.
		int open = 0;   // 닫혀야 하는 '(' 개수
        int add = 0;    // 추가로 필요한 '(' 개수

        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;  // 여는 괄호 하나 늘림
            } else {  // 닫는 괄호
                if (open > 0) {
                    open--;  // 대응되는 여는 괄호 닫음
                } else {
                    add++;  // 짝이 없는 닫는 괄호 → 여는 괄호 하나 필요
                }
            }
        }

        // open: 닫히지 않은 여는 괄호 개수 (→ ')' 필요)
        // add: 짝 없는 닫는 괄호 개수 (→ '(' 필요)
        return open + add;
	}
}
