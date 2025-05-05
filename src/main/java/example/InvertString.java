package test.example;

public class InvertString {
	public static void main(String[] args) {
        String input = "I love CyberDigm";
        String reversed = reverseWordOrder(input);
        System.out.println("결과: " + reversed);
    }

    public static String reverseWordOrder(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }

        return sb.toString();
    }
}
