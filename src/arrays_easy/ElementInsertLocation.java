package arrays_easy;

public class ElementInsertLocation {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        System.out.println(findElementLocation(arr,6));
    }

    private static int findElementLocation(int[] arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>= target){
                return i;
            }
        }
        return arr.length;
    }
}
