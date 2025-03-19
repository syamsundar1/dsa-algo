package string;

import java.util.Stack;

public class BackspaceCharacter {
    public static void main(String[] args) {
        String s1 = "equ#ual";
        String s2 = "ee#quaal#";
        System.out.println(backspaceCharacter(s1,s2));

    }

    private static boolean backspaceCharacter(String s1, String s2) {

        String op1 = genrateBackspace(s1);
        String op2 = genrateBackspace(s2);
        return op1.equals(op2);
    }

    private static String genrateBackspace(String s) {
        char[] arr = s.toCharArray();
        Stack ans = new Stack<>();

        if(arr.length==1 && arr[0] == '#'){
            return "";
        }
        if(arr.length==1){
            return s;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == '#'){
                ans.pop();
            }else{
                ans.add(arr[i]);
            }
        }
        return ans.toString();
    }


}
