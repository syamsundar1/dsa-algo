package arrays_easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraySubSequnceLargestK {
    public static void main(String[] args) {
        int[] nums = {2,1,3,3};
        System.out.println(Arrays.toString(maxSubsequence( nums, 2)));

    }

    public static int[] maxSubsequence(int[] nums, int k) {
        HashMap<ArrayList<Integer>,Integer> mpp = new HashMap<>();
        int max = 0;
        int temp = k;

        // int[] ans = new int[k];
        int ch = Integer.MIN_VALUE;
        ArrayList<Integer> largestKey = null;
        for(int i=0;i<=nums.length-k;i++){
            findSubSeq(nums,k,mpp,temp, new ArrayList<>(),i,max);
        }

        for(Map.Entry<ArrayList<Integer>,Integer> entry : mpp.entrySet()){
            if(ch<entry.getValue()){
                ch = entry.getValue();
                largestKey= entry.getKey();
            }
        }

        int[] ans = largestKey.stream().mapToInt(i -> i).toArray();
        return ans;

    }

    public static void findSubSeq(int[] arr, int k, HashMap<ArrayList<Integer>,Integer> mpp, int temp, ArrayList<Integer> list,int ind,int max){

        if(temp==0){
            mpp.put(list,max);
            return;
        }
        list.add(arr[ind]);
        max += arr[ind];
        temp = temp -1;
        findSubSeq(arr,k,mpp,temp, list,ind+1,max);
    }
}
