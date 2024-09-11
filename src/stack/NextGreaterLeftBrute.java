package stack;

import java.util.Arrays;

public class NextGreaterLeftBrute {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4}; // O/P : -1 -1 3 -1

        System.out.println(Arrays.toString(nextGreaterLeftBrute(arr)));
    }

    private static int[] nextGreaterLeftBrute(int[] arr) {
        int[] ans = new int[arr.length];
        ans[0] = -1;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >=0 ; j--) {
                if(arr[j]>arr[i]){
                    ans[i] = arr[j];
                    System.out.println(arr[j]);
                    break;
                }
                ans[i] = -1;
            }

        }
        return ans;
    }
}
