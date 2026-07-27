package leetcode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FindAllNumbers_448 {
public static void main(String[] args) {
	
	int[] nums = {4,3,2,7,8,2,3,1};
	ArrayList<Integer> list = new ArrayList<>();
	HashSet<Integer> set = new HashSet<>();
	for (int n:nums) {
		set.add(n);
	}
	for (int i=1;i<=nums.length;i++) {
		if(!set.contains(i)) {
			list.add(i);
		}
	}
	System.out.println(list);
}

}
