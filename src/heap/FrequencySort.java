package heap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {
    public static void main(String[] args) {
        int[] arr = {2,3,1,3,2};
        System.out.println(Arrays.toString(frequencySort(arr)));
    }

    static class Pair{
        int freq;
        int value;
        Pair(int freq, int value){
            this.freq = freq;
            this.value = value;
        }
    }
    public static int[] frequencySort(int[] nums) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>( (a, b) -> {
            if(a.freq == b.freq) return b.value - a.value;
            else return a.freq - b.freq;
        }  );
        HashMap<Integer,Integer> mpp = new HashMap<>();
        //pre compute
        for(int i=0;i<nums.length;i++){
            if(mpp.containsKey(nums[i])){
                mpp.put(nums[i], mpp.get(nums[i]) + 1);
            }else{
                mpp.put(nums[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> m : mpp.entrySet()){
            maxHeap.offer(new Pair(m.getValue(), m.getKey()));
        }
        int i =0;
        while(i<nums.length){
            Pair p = maxHeap.poll();
            int freq = p.freq;
            int value = p.value;
            while(freq>0){
                nums[i] = value;
                i++;
                freq--;
            }
        }
        return nums;
    }
}
