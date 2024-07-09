package sorting;

import java.util.Scanner;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[] res = bubbleSort(arr,n);
        for(int i : res){
            System.out.println(i);
        }
    }

    // Bubble sort algo
    // Check if adjacent elements and compare if left side element is greater than right side element then swap else move to next element
    public static int[] bubbleSort(int[] arr, int n){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
