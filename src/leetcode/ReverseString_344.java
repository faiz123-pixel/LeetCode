package leetcode;

public class ReverseString_344 {
	public static void main(String[] args) {
		char[] s = {'h','e','l','l','o'};
		
		int first=0;
        int last=s.length-1;
        while(first<last){
            char ch=s[first];
            s[first]=s[last];
            s[last]=ch;
            first++;
            last--;
        }
	}

}
