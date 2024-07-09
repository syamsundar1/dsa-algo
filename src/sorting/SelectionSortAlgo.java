package sorting;

import java.util.Scanner;



public class SelectionSortAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] res = selectionSort(arr,n);
        for(int i : res){
            System.out.println(i);
        }
    }
    // Selection Sort - First Select min element and swap
    // example {8,3,2,1} - select 1 because it is min and swap with 8 - {1,3,2,8}
    public static int[] selectionSort(int[] arr, int n){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            // swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

}
