package leetcode;

public class ProductOfArray_238 {
	public static void main(String[] args) {
		int[] nums= {1,2,3,4};
		int[] result=new int[nums.length];
		int mul=1;
		for (int i=0;i<nums.length;i++) {
			result[i]=mul;
			mul*=nums[i];
		}
		mul=1;
		for(int i=nums.length-1;i>=0;i--) {
			result[i] *=mul;
			mul *=nums[i];
		}
		for(int n:result) {
			System.out.println(n);
		}
//		for (int i=0;i<nums.length;i++) {
//			int mul=1;
//			for (int j=0;j<nums.length;j++) {
//				if(i==j) {
//					continue;
//				}
//				mul*=nums[j];
//			}
//			result[i]=mul;
//		}
//		for(int n:result) {
//			System.out.println(n);
//		}
	}

}
