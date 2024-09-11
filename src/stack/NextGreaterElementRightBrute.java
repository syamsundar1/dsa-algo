package stack;

import java.util.Arrays;

public class NextGreaterElementRightBrute {

    public static void main(String[] args) {
        int[] arr = {1,3,0,0,2,1}; // O/P : 3,4,2,2,4,-1
        System.out.println(Arrays.toString(nextGreaterElementBrute(arr)));
    }

    public static int[] nextGreaterElementBrute(int[] arr){
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for(int j = i+1;j< arr.length;j++){
                if(arr[j]>arr[i]){
                    ans[i] = arr[j];
                    break;
                }
                ans[i] = -1; // IF there is no next greater element then -1
            }
        }
        ans[arr.length-1] = -1;
        return ans;
    }

}
