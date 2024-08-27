package binary_search;

import java.util.Arrays;

public class KoKoEatingBanana {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 5;
        System.out.println(minEatingSpeed(piles,h));
        System.out.println(calReqTime(piles,15));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int max = piles[piles.length-1];
        int low = 1;
        int high = max;
        int mid = 1;
        int ans = 1;
        while(low<=high){
            mid = low + (high-low) / 2;
            int reqTime = calReqTime(piles, mid);
            if(reqTime==h) return mid;
            if(reqTime<h){
                ans = reqTime;
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return ans;
    }

    public static int calReqTime(int[] arr , int mid){
        int ans = 0;
        for(int i=1;i<arr.length;i++){
            ans += (arr[i] / mid) + 1;
        }
        return ans;
    }
}
