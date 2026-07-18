package leetcode;

public class ThirdMaxNumber_414 {

    public static void main(String[] args) {

        int[] nums = {3, 2, 1};

        Integer first = null;
        Integer second = null;
        Integer third = null;

        for (Integer i : nums) {

       
            if (i.equals(first) || i.equals(second) || i.equals(third)) {
                continue;
            }

            if (first == null || i > first) {
                third = second;
                second = first;
                first = i;
            } 
            else if (second == null || i > second) {
                third = second;
                second = i;
            } 
            else if (third == null || i > third) {
                third = i;
            }
        }

        if (third == null) {
            System.out.println(first);
        } else {
            System.out.println(third);
        }
    }
}