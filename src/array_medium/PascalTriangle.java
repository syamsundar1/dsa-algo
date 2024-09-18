package array_medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> x = makePascalTriangle(n);
        for(List<Integer> a : x){
            System.out.println(a);
        }
    }

    private static List<List<Integer>> makePascalTriangle(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        ans.add(row);
        List<Integer> prev = new ArrayList<>(row);

        for (int i = 1; i < n; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int j = 1; j < i; j++) {
                curr.add(prev.get(j) + prev.get(j-1));
            }
            curr.add(1);
            ans.add(curr);
            prev = curr;

        }
        return ans;
    }

}
