package leetcode;

public class IsSubsequence_392 {
	public static void main(String[] args) {
		String s="abc";
		String t="acjsbskk";
		int i=0;
		for (char n:s.toCharArray()) {
			i=t.indexOf(n,i);
			
			if(i==-1) {
				
				System.out.println(false);
			}
		}
		System.out.println(true);
	}

}
