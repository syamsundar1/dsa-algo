package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderInterative {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1,new TreeNode(2),new TreeNode(3));
        List<Integer> x = inOrderTreeIterative(node);
        System.out.println(x);
    }

    private static List<Integer> inOrderTreeIterative(TreeNode node) {
        List<Integer> ans = new ArrayList<>();
        if(node == null) return  ans;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode n = node;
        while (true){
            if(n!=null){
                stack.push(n);
                n = n.left;
            }else{
                if(stack.isEmpty()){
                    break;
                }
                n = stack.pop();
                ans.add(n.val);
                n = n.right;
            }
        }
        return ans;
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val = val;
    }

    TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
