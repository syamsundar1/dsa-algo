package dynamic_programming;

public class ClimbingStairs {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(helper(n));
    }

    private static int helper(int n) {
        if(n==1 || n==0) return  1;

        int left = helper(n-1);
        int right = helper(n-2);

        return left + right;
    }

}
