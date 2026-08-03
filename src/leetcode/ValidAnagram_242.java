package leetcode;

import java.util.Arrays;

public class ValidAnagram_242 {
	public static void main(String[] args) {
		String s="car";
		String t="rac";
		if(s.length()!=t.length()){
			System.out.println("false");
        }
        // TreeMap<Character,Integer> m1=new TreeMap<>();
        
        // for (char ch:s.toCharArray()){
        //     m1.put(ch,m1.getOrDefault(ch,0)+1);
        // }
        // for (char ch:t.toCharArray()){
        //     m1.put(ch,m1.getOrDefault(ch,0)-1);
        //     if(m1.get(ch)<0){
        //         return false;
        //     }
        // }
        // return true;
        char[] arr1=s.toCharArray();
        char[] arr2=t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println( Arrays.equals(arr1,arr2));
	}

}
