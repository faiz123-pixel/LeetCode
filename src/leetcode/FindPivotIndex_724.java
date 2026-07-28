package leetcode;

public class FindPivotIndex_724 {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		for (int i=1;i<nums.length;i++) {
			nums[i]+=nums[i-1];
		}
		for(int j=0;j<nums.length;j++) {
			if(j==0) {
				if(nums[nums.length-1]-nums[j]==0) {
					System.out.println(j);
				}
			}
			else if(nums[j-1]==nums[nums.length-1]-nums[j]) {
				System.out.println(j);
			}
			
		}
		System.out.println("-1");
	}

}
