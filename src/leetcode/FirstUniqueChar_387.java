package leetcode;

public class FirstUniqueChar_387 {

    public int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {
            // String s1 = s.substring(0,i)+s.substring(i + 1);
            // if (!s1.contains(String.valueOf(s.charAt(i)))) {
            //     return i;
            // }
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}