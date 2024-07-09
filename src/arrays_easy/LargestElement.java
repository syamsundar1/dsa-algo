package arrays_easy;

import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = largestElementOptimal(arr,n);
        System.out.println(res);
    }
    // Brute Force approach - sort array and return n-1 element
    public static int largestElementBruteForce(int[] arr ,int n){
        // Arrays.sort(arr);
        // Selection sort
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr[n-1];
    }

    // Optimal Solution
    public static int largestElementOptimal(int[] arr, int n){
        int largest = 0;
        for (int j : arr) {
            if (j > largest) {
                largest = j;
            }
        }
        return largest;
    }
}
