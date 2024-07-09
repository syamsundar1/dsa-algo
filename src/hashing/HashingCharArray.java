package hashing;

import java.util.Scanner;

public class HashingCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        // pre-compute
        int[] hashArray = new int[26];
        for(int i=0;i<s.length();i++){
            hashArray[s.charAt(i) - 'a']++;
        }
        int q = sc.nextInt();
        while(q!=0){
            char c = sc.next().charAt(0);
            System.out.println(hashArray[c - 'a']);
            q--;
        }

    }
}
