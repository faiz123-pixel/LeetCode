package leetcode;

public class ValidPalindrome_125 {

	public static void main(String[] args) {
		
		String s = "A man, a plan, a canal: Panama";
		StringBuilder str = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                str.append(Character.toLowerCase(ch));
            }
        }
//        return str.toString().equals(str.reverse().toString());
	}
}
