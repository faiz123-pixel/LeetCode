package leetcode;

import java.util.Arrays;

public class SquaresOfSortedArray_977 {
	public static void main(String[] args) {
		int[] nums= {-4,-1,0,9,10};
		for (int i=0;i<nums.length;i++) {
			nums[i]=nums[i]*nums[i];
		}
		Arrays.sort(nums);
		for (int n:nums) {
		System.out.println(n);
		}
	}
}
