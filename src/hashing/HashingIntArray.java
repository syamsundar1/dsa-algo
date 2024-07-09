package hashing;

import java.util.Scanner;

public class HashingIntArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // pre-compute / pre-fetch / preloading hashing
        int[] hashArray = new int[(int)1e6];
        for(int i=0;i<n;i++){
            hashArray[arr[i]]++;
        }
        //Take queries Q
        int q = sc.nextInt();
        while(q!=0){
            int s = sc.nextInt();
            System.out.println(hashArray[s]);
            q--;
        }
    }
}
