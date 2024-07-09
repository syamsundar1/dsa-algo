package sorting;

import java.util.Scanner;

public class InsertionSortAlgo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] res = insertionSort(arr,n);
        for(int i : res){
            System.out.println(i);
        }

    }

    // Select the element and insert in correct position
    public static int[] insertionSort(int[] arr, int n){
        for (int i = 0; i <= n-1; i++) {
            int j = i;
            while (j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }
}
