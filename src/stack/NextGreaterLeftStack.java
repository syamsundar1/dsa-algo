package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NextGreaterLeftStack {

    public static void main(String[] args) {
        int[] arr = {1,3,2,4}; // O/P : -1 -1 3 -1
        System.out.println(nextGreaterLeftStack(arr));

    }

    private static List<Integer> nextGreaterLeftStack(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while(!stack.empty() && stack.peek() <= arr[i]){
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
        return ans;
    }

}
