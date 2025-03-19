package string;

import java.util.HashMap;

public class PermutationInString {
    public static void main(String[] args) {
        System.out.println(checkInclusion("ab", "eidbaooo"));
    }

    public static boolean checkInclusion(String s1, String s2) {

        // pre compute freq for s1
        HashMap<Character, Integer> mpp2 = new HashMap<>();

        for(char ch : s1.toCharArray()){
            if(mpp2.containsKey(ch)){
                int c = mpp2.get(ch);
                mpp2.put(ch, c + 1);
            }else{
                mpp2.put(ch, 1);
            }
        }

        // sliding window for each s1 size k = s1.lenght()
        int i =0;
        int j =0;
        int k = s1.length();
        while(j<s2.length()){

            if(j-i+1<k){
                j++;
            }
            else if (j-i+1 == k){

                HashMap<Character, Integer> mpp = new HashMap<>();

                for(int m= i;m<=j;m++ ){
                    if(mpp.containsKey(s2.charAt(m))){
                        int c = mpp.get(s2.charAt(m));
                        mpp.put(s2.charAt(m), c + 1);
                    }else{
                        mpp.put(s2.charAt(m), 1);
                    }
                }

                if(mpp.equals(mpp2)){
                    return true;
                }
                i++;
                j++;
            }
        }
        return false;
    }
}
