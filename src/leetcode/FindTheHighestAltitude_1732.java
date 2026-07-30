package leetcode;

public class FindTheHighestAltitude_1732 {
	public static void main(String[] args) {
		int[] gain= {1,2,-7,-4,3};
		int max=0;
        int[] newArr=new int[gain.length+1];
        newArr[0]=0;
        for (int i=0;i<gain.length;i++){
            newArr[i+1]=newArr[i]+gain[i];
        }
        for (int n:newArr){
            if (max<n){
                max=n;
            }

        }
	}

}
