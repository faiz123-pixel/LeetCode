package leetcode;

public class ReverseWords_557 {
	public static void main(String[] args) {
		
		String s = "Let's take LeetCode contest";
		String newStr="";
		String[] arr=s.split(" ");
		for (String n:arr) {
			newStr+=reverse(n)+" ";
			
			
		}
		System.out.println(newStr.trim());
	}
	
	public static String reverse(String s){
		String newstr="";
		for (int i=s.length()-1;i>=0;i--) {
			newstr+=s.charAt(i);
		}
		return newstr;
	}
	

}

//
//class Solution {
//    // public static String reverse(String s){
//	// 	String newstr="";
//	// 	for (int i=s.length()-1;i>=0;i--) {
//	// 		newstr+=s.charAt(i);
//	// 	}
//	// 	return newstr;
//	// }
//    //  public String reverseWords(String s) {
//
//    //     String newStr="";
//	// 	String[] arr=s.split(" ");
//	// 	for (String n:arr) {
//	// 		newStr+=reverse(n)+" ";
//	// 	}
//    //     return newStr.trim();
//    // }
//    public static void reverse(char[] s,int left,int right){
//		while(left<right){
//            char ch= s[left];
//            s[left]=s[right];
//            s[right]=ch;
//            left++;
//            right--;
//        }
//	}
//    public String reverseWords(String s) {
//		char[] arr=s.toCharArray();
//        int j=0;
//		for (int i=0;i<arr.length;i++) {
//			if(arr[i]==' '){
//                reverse(arr,j,i-1);
//                j=i+1;
//            }
//		}
//        reverse(arr,j,arr.length-1);
//        return new String(arr);
//    }
//}