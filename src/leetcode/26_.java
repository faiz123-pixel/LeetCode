// Remove Duplicates from Sorted Array

class Solution {
    public int removeDuplicates(int[] nums) {
        int i=1;
        if (nums.length==0){
            return 0;
        }
        for (int k=1;k<nums.length;k++){
            if (nums[k]==nums[i-1]){
                continue;
            }
            nums[i]=nums[k];
            i++;
        }
        return i;
    }
}
