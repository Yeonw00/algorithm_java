package test.example;

public class StringCompression {
    public static void main(String[] args) {
        String word = "aaabbcddddd";
        System.out.println("결과 : " + compressString(word));
    }

    public static String compressString(String s) {
        if (s == null || s.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        char prev = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == prev) {
                count++;
            } else {
                sb.append(prev);
                if (count > 1) sb.append(count);
                prev = curr;
                count = 1;
            }
        }

        // 마지막 문자 처리
        sb.append(prev);
        if (count > 1) sb.append(count);

        return sb.toString();
    }
}