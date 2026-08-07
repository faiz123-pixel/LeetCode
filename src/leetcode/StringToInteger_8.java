package leetcode;

public class StringToInteger_8 {
	public static void main(String[] args) {
		String s="   -12v34";
		s=s.trim();
		if (s.equals(null) && s.length()<=0) {
			System.out.println(0);
		}
		int max=Integer.MAX_VALUE;
		int min=Integer.MIN_VALUE;
		int sign=1;
		int value=0;
		int index=0;
		if(s.charAt(0)=='+') {
			sign=1;
			index++;
		}
		else if(s.charAt(0)=='-') {
			sign=-1;
			index++;
		}
		while(index<s.length() && Character.isDigit(s.charAt(index))) {
			int digit=s.charAt(index)-'0';
			System.out.println(digit);
			value=value*10+digit;
			if(value*sign>max) {
				System.out.println(max);
			}
			if(value*sign<min) {
				System.out.println(min);
			}
			index++;
		}
		System.out.println(value*sign);
		
		
		
	}

}
