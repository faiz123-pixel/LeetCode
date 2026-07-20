package leetcode;

public class SortColor_75 {
	public static void main(String[] args) {
		
		int[] nums= {1,2,0,1,2,0};
		int i=0;
		int p=0;
		int j=nums.length-1;
		while(p<=j) {
			if(nums[p]==0) {
				int temp=nums[i];
				nums[i]=nums[p];
				nums[p]=temp;
				i++;
				p++;
			}
			else if(nums[p]==2) {
				int temp=nums[j];
				nums[j]=nums[p];
				nums[p]=temp;
				j--;
			}
			else {
				p++;
			}
		}
		for(int n:nums) {
			System.out.println(n);
		}
//		int[] nums= {1,2,0,1,2,0};
//		for(int i=0;i<nums.length;i++) {
//		for(int n=0;n<nums.length-i-1;n++) {
//			if(nums[n]>nums[n+1]) {
//				int temp=nums[n+1];
//				nums[n+1]=nums[n];
//				nums[n]=temp;
//			}
//		}}
//		for(int n:nums) {
//			System.out.println(n);
//		}
		
	}

}
