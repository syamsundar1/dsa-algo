package arrays_easy;

import java.util.Arrays;
import java.util.Scanner;

public class RotateRightByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] res = rotateRightByK(arr,n,k);
        System.out.println(Arrays.toString(res));
    }

    // Right rotating by k steps (use temp array otherwise data will override) formula - (i + k) % n
    private static int[] rotateRightByK(int[] arr, int n, int k) {
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i+k) % n] = arr[i];
        }
        return temp;
    }
}
