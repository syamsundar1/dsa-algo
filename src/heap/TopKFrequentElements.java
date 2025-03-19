package heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(Arrays.toString(topKFrequent(arr,2)));
    }

    static class Pair{
        int freq;
        int value;
        Pair(int freq, int value){
            this.freq = freq;
            this.value = value;
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> minHeap = new PriorityQueue<>( (a, b) -> {
            if(a.freq == b.freq) return a.value - b.value;
            else return a.freq - b.freq;
        } );

        //precompute hashing
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int[] ans = new int[k];

        for(int i =0;i<nums.length;i++){
            if(mpp.containsKey(nums[i])){
                mpp.put(nums[i], mpp.get(nums[i]) + 1);
            }
            else{
                mpp.put(nums[i], 1);
            }
        }

        for(int num : nums){
            minHeap.offer(new Pair(mpp.get(num), num));
            if(minHeap.size() >k){
                minHeap.poll();
            }
        }

        for(int i=0;i<ans.length;i++){
            ans[i] = minHeap.poll().value;
        }
        return ans;
    }
}
