package leetcode;

public class PlusOne_66 {

	public static void main(String[] args) {
		int[] digits = {9};
		int sum=0;
		for(int i=0;i<digits.length;i++) {
			sum=sum*10+digits[i];
		}
		sum++;
		
		System.out.println(sum);
		int j=digits.length-1;
		while(j>=0) {
			digits[j]=digits[j]+1;
			if(digits[j]==10) {
				digits[j]=0;
				j--;
				continue;
			}
			break;
		}
		if (j<0) {
			int[] newarr=new int[digits.length+1];
			newarr[0]=1;
			for(int i=1;i<=digits.length;i++) {
				newarr[i]=digits[i-1];
			}
		
		for(int i=0;i<=digits.length;i++) {
			System.out.println(newarr[i]);
		}
		}
		else {
		for(int i=0;i<digits.length;i++) {
			System.out.println(digits[i]);
		}
		}
	}

}
