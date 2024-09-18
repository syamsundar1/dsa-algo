package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation_I {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        List<List<Integer>> result = permutation(arr);
        System.out.println(result);
    }

    private static List<List<Integer>> permutation(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] used = new boolean[arr.length];
        Arrays.fill(used,false);
        backtracking(arr, ans, ds, used);
        return ans;
    }

    private static void backtracking(int[] arr, List<List<Integer>> ans, List<Integer> ds, boolean[] used) {
        if(ds.size() == arr.length){
            ans.add(new ArrayList<>(ds));
        }
        else{
            for (int i = 0; i < arr.length; i++) {
                if(used[i]) {
                    continue;
                }

                ds.add(arr[i]);
                used[i] = true;
                backtracking(arr,ans, ds ,used);
                used[i] = false;
                ds.remove(ds.size() -1 );
            }
        }
    }
}
