package leetcode;

import java.util.HashMap;

public class ContainsDublicates_217 {
	public static void main(String[] args) {
		int[] nums= {1,2,2,32,1};
		
		HashMap<Integer, Integer> map=new HashMap();
        for (int num:nums){
            if(map.containsKey(num)){
                System.out.println("True");
                break;
            }
            else{
                map.put(num,1);
            }
        }
       System.out.println("false");
	}

}
