package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTravesal {

    class Node {
        int data;
        Node left;
        Node right;

        // Constructor to initialize
        // the node with a value
        Node(int val) {
            data = val;
            left = null;
            right = null;
        }
    }

    // Function to perform zigzag level
    // order traversal of a binary tree
    public List<List<Integer>> ZigZagLevelOrder(TreeNode root) {
        // List to store the
        // result of zigzag traversal
        List<List<Integer>> result = new ArrayList<>();

        // Check if the root is null,
        // return an empty result
        if (root == null) {
            return result;
        }

        // Queue to perform
        // level order traversal
        Queue<TreeNode> nodesQueue = new LinkedList<>();
        nodesQueue.add(root);

        // Flag to determine the direction of
        // traversal (left to right or right to left)
        boolean leftToRight = true;

        // Continue traversal until
        // the queue is empty
        while (!nodesQueue.isEmpty()) {
            // Get the number of nodes
            // at the current level
            int size = nodesQueue.size();

            // List to store the values
            // of nodes at the current level
            List<Integer> row = new ArrayList<>();

            // Traverse nodes at
            // the current level
            for (int i = 0; i < size; i++) {
                TreeNode node = nodesQueue.poll();
                int index = leftToRight ? i : (size - 1 - i);
                if(leftToRight){
                    row.add(node.val);
                }else{
                    row.add(0,node.val);
                }
                if (node.left != null) {
                    nodesQueue.add(node.left);
                }
                if (node.right != null) {
                    nodesQueue.add(node.right);
                }
            }

            // Switch the traversal
            // direction for the next level
            leftToRight = !leftToRight;

            // Add the current level's
            // values to the result list
            result.add(row);
        }

        // Return the final result of
        // zigzag level order traversal
        return result;
    }
}

// Helper function to print the result
class Main {
    static void printResult(List<List<Integer>> result) {
        for (List<Integer> row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        ZigZagTravesal solution = new ZigZagTravesal();

        // Get the zigzag level order traversal
        List<List<Integer>> result = solution.ZigZagLevelOrder(root);

        // Print the result
        printResult(result);
    }
}
