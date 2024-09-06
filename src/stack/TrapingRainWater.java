package stack;

public class TrapingRainWater {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(arr));
    }

    public static int trap(int[] height) {
        int total = 0;
        int[] prefix = new int[height.length];
        int[] sufix = new int[height.length];
        int leftMax = -1;
        int rightMax = -1;

        //prefix max
        prefix[0] = height[0];
        for(int i=1;i<height.length;i++){
            prefix[i] = Math.max(prefix[i-1],height[i]);
        }

        //sufix max
        sufix[height.length-1] = height[height.length-1];
        for(int i= height.length-2;i>=0;i--){
            sufix[i] = Math.max(sufix[i+1],height[i]);
        }

        for(int i=0;i<height.length;i++){
            leftMax = prefix[i];
            rightMax = sufix[i];
            if(height[i]<leftMax && height[i]<rightMax){
                total += Math.min(leftMax,rightMax) - height[i];
            }
        }
        return total;
    }
}
