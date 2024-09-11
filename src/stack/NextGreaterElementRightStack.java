package stack;

import java.util.*;

public class NextGreaterElementRightStack {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4}; // O/P : 3,4,2,2,4,-1
        System.out.println(nextGreaterElementStack(arr));
    }

    public static List<Integer> nextGreaterElementStack(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length-1; i >=0 ; i--) {
            while(!stack.empty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans.add(-1);
            }
            if(!stack.empty() && stack.peek() > arr[i]){
                ans.add(stack.peek());
            }
            stack.push(arr[i]);
        }
        Collections.reverse(ans);
        return ans;

    }
}
