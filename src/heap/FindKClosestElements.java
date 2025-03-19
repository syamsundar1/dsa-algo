package heap;

import java.util.*;

public class FindKClosestElements {

    public static List<Integer> closet_element_using_queue(List<Integer> nums, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> {
            if (a.dist == b.dist) {
                return b.value - a.value;
            }
            return b.dist - a.dist;
        });

        for (int num : nums) {
            int dist = Math.abs(num - x);
            pq.offer(new Pair(dist, num));
            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            res.add(pq.poll().value);
        }
        Collections.sort(res);
        return res;
    }

    static class Pair {
        int dist;
        int value;

        Pair(int dist, int value) {
            this.dist = dist;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10, 15, 7, 3, 4);
        int k = 3;
        int x = 8;
        System.out.println(closet_element_using_queue(nums, k, x));  // Output: [7, 10, 15]
    }
}
