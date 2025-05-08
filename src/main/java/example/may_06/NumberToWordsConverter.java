package example.may_06;

public class NumberToWordsConverter {
	// 기본 단어 배열
    static String[] belowTwenty = {
        "", "one", "two", "three", "four", "five", "six",
        "seven", "eight", "nine", "ten", "eleven", "twelve",
        "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
        "eighteen", "nineteen"
    };

    static String[] tens = {
        "", "", "twenty", "thirty", "forty", "fifty",
        "sixty", "seventy", "eighty", "ninety"
    };
	
    public static String convertNumber(int num) {
    	if (num == 0) {
            return "zero";
        }

        StringBuilder result = new StringBuilder();

        // 100 이상인 경우
        if (num >= 100) {
            result.append(belowTwenty[num / 100]).append(" hundred");
            num %= 100;
            if (num != 0) result.append(" ");
        }

        // 1~19
        if (num < 20 && num > 0) {
            result.append(belowTwenty[num]);
        }
        // 20 이상
        else if (num >= 20) {
            result.append(tens[num / 10]);
            if (num % 10 != 0) {
                result.append(" ").append(belowTwenty[num % 10]);
            }
        }

        return result.toString();
    }
    
	public static void main(String[] args) {
		int input = 342;
		System.out.println("결과 : " + convertNumber(input));
	}
	
}
