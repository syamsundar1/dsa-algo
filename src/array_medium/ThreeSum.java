package array_medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {

        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        List<List<Integer>> op = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> ds = new ArrayList<>();
                        ds.add(nums[i]);
                        ds.add(nums[j]);
                        ds.add(nums[k]);
                        ans.add(new ArrayList<>(ds));

                    }
                }
            }
        }
        System.out.println(ans);

//        for(List<Integer> s : ans){
//            op.add(ans);
//        }
        return op;
    }
}
