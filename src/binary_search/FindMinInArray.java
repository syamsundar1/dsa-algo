package binary_search;

public class FindMinInArray {
    public static void main(String[] args) {
        int[] arr = {2,1};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = nums.length -1;
        int mid =0;
        if(nums.length == 1) return nums[0];
        while(low<=high){
            mid = (low + high) / 2;
            if(nums[low] <= nums[mid]){
                min = Math.min(min,nums[low]);
                low = mid + 1;
            }else{
                min = Math.min(min,nums[mid]);
                high = mid -1;
            }
        }
        return min;
    }
}
