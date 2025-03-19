package arrays_easy;

import java.util.*;

public class KickDrumQ1 {
    public static void main(String[] args) {
        int[] arr = {75, 105, 120, 75, 90, 135};
       // System.out.println(cal(arr1));
        Scanner sc = new Scanner(System.in);

        // Input the number of tasks
//        int n = sc.nextInt();
//
//        // Input the array of task durations
//       // int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
        int n = arr.length;

        // Sort the array in descending order to maximize production time
        Arrays.sort(arr);

        // Reverse the array to make it descending
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        // Calculate the total sum of all tasks
        int totalSum = 0;
        for (int val : arr) {
            totalSum += val;
        }

        // If the total sum is already a multiple of 15, output it
        if (totalSum % 15 == 0) {
            System.out.println(totalSum);
            return;
        }

        // Group the task durations by their remainder when divided by 15
        List<Integer>[] remainders = new ArrayList[15];
        for (int i = 0; i < 15; i++) {
            remainders[i] = new ArrayList<>();
        }
        for (int val : arr) {
            remainders[val % 15].add(val);
        }

        // Sort each group for easier removal of the smallest value
        for (int i = 0; i < 15; i++) {
            Collections.sort(remainders[i]);
        }

        // Try removing one task to make the total sum a multiple of 15
        int minRemoval = Integer.MAX_VALUE;
        int remainder = totalSum % 15;

        // Case 1: Remove a single task with the same remainder as the excess
        if (!remainders[remainder].isEmpty()) {
            minRemoval = Math.min(minRemoval, remainders[remainder].get(0));
        }

        // Case 2: Remove two tasks whose remainders sum up to the excess
        for (int i = 1; i < 15; i++) {
            int j = (remainder - i + 15) % 15; // Ensure non-negative remainders
            if (i == j && remainders[i].size() >= 2) {
                // If both tasks have the same remainder, we need at least two tasks
                minRemoval = Math.min(minRemoval, remainders[i].get(0) + remainders[i].get(1));
            } else if (i != j && !remainders[i].isEmpty() && !remainders[j].isEmpty()) {
                // If the tasks have different remainders, take the smallest from both groups
                minRemoval = Math.min(minRemoval, remainders[i].get(0) + remainders[j].get(0));
            }
        }

        // If no valid removal exists, output 0
        if (minRemoval == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(totalSum - minRemoval);
        }

        sc.close();
    }

    private static int cal(int[] arr){
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%15==0){
                list.add(arr[i]);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }
}
