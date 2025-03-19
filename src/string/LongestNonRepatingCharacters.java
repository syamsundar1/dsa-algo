package string;

public class LongestNonRepatingCharacters
{
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            int curr = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]) {
                    break;
                }
                if(arr[i] != arr[j]) curr++;
            }
            max = Math.max(max,curr);
            curr= 1;
        }
        return max;
    }
}
