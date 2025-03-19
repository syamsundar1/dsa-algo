package string;

import java.util.Arrays;
import java.util.HashMap;

public class StringCompression {
    public static void main(String[] args) {
        String s = "abbccc";
        System.out.println(precompute(s));
    }

    private static String precompute(String s) {
        HashMap<Character, Integer> mpp = new HashMap<>();

        for(char ch : s.toCharArray()){
            if(mpp.containsKey(ch)){
                int freq = mpp.get(ch);
                mpp.put(ch, freq + 1);
            }else{
                mpp.put(ch, 1);
            }
        }

        int i =0;
        StringBuffer sb = new StringBuffer();
        while(i<s.length()){
            if(mpp.get(s.charAt(i)) == 1){
                sb.append(s.charAt(i));
                i++;
            }
            else{
                sb.append(s.charAt(i));
                sb.append(mpp.get(s.charAt(i)));
                i = i + mpp.get(s.charAt(i));
            }

        }

        String fin = sb.toString();
        char[] chars = new char[7];
        for(int j=0;j<sb.length();j++){
            if(j>fin.length()) break;
            chars[j] = fin.charAt(j);
        }
        System.out.println(Arrays.toString(chars));
        System.out.println(fin.length());

        return sb.toString();
    }
}
