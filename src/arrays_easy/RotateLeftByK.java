package arrays_easy;

import java.util.Arrays;
import java.util.Scanner;


public class RotateLeftByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] res = rotateLeftByK(arr,n,k);
        System.out.println(Arrays.toString(res));
    }

    private static int[] rotateLeftByK(int[] arr, int n, int k) {
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
        return arr;
    }

    private static void reverse(int[] arr, int start, int end) {
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
