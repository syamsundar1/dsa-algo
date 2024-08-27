package binary_search;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        System.out.println(search(new int[]{3,1},1));
    }

    public  static int  search(int[] nums, int key) {
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        while(low<=high){
            mid = (low+high) / 2;
            if(nums[mid] == key) return mid;
            if(nums[low]<=nums[mid]){
                if(key>=nums[low] && key<nums[mid]){
                    high = mid -1;
                }else{
                    low = mid + 1;
                }
            }else{
                if(key<=nums[high] && key>nums[mid]){
                    low = mid + 1;
                }else{
                    high = mid -1;
                }
            }
        }
        return -1;
    }
}
