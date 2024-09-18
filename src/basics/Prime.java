package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MAX_VALUE;

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < max; i++) { // 0(N)
            if(isPrime(i)) {
                list.add(i);
            }
            if(list.size()==n){
                break;
            }
        }
        System.out.println(list);
    }

    static boolean  isPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){ // TC - 0(n)
            if(n%i==0)
                count++;
        }
        return count == 2;
    }
}


