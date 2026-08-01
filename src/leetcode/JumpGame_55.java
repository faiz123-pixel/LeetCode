package leetcode;

public class JumpGame_55 {
	public static void main(String[] args) {
		
		int goal = nums.length - 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (i + nums[i] >= goal) {
                goal = i;
            }
        }
		System.out.println(goal==0);
	}
}
