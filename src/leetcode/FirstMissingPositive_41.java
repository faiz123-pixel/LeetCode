package leetcode;
import java.util.HashSet;

public class FirstMissingPositive_41 {
	public static void main(String[] args) {
		
	int[] nums= {-1,0,2,3,4,1,7};
	HashSet<Integer> list=new HashSet<>();
    for (int n:nums){
        list.add(n);
    }
    for (int i=1;i<=nums.length+1;i++){
        if(list.contains(i)){
            continue;
        }
        System.out.println(i);
    }
    System.out.println("1");
	}
}
