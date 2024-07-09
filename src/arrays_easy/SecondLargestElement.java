package arrays_easy;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int res = secondLargestElementOptimal(arr,n);
        System.out.println(res);
    }

    // Sort array and return n-2 which will be second-largest element
    public static int secondLargestElementBruteForce(int[] arr, int n){
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
        return arr[n-2];
    }

    // Better solution - First find the largest element and find second-largest element by
    // Checking same as largest AND compare with the largest make sure it is not equal to largest
    public static int secondLargestElementBetter(int[] arr, int n){
        int largest = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        int secondLargest = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    // First take largest assume it first element in array then take second-largest = -1
    // if current element is greater than the largest make second largest to largest and update largest to current element
    // if current element is less than largest and second-largest is greater than current element then update second-largest to current element
    public  static int secondLargestElementOptimal(int[] arr, int n){
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]< largest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }


    // Optional - Question Second smallest element
    public static int secondSmallestElement(int[] arr, int n){
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]<smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i]>smallest && arr[i] < secondSmallest){
                secondSmallest = arr[i];
            }
        }
        return  secondSmallest;
    }
}
