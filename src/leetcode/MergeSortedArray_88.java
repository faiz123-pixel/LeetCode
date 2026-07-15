package leetcode;

public class MergeSortedArray_88 {
	public static void main(String[] args) {
		
		int[] nums1 = {4,5,6,0,0,0};
		int m = 3;
		int[] nums2 = {1,2,3};
		int n = 3;
		int i=m-1;
        int j=n-1;
        int p=m+n-1;
        while(j>=0){
            if(i>= 0 && nums1[i]>nums2[j]){
                nums1[p--]=nums1[i--];
            }
            else{
                nums1[p--]=nums2[j--];
            }
        }
		
	}

}
