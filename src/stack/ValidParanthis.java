package stack;

import java.util.Stack;

public class ValidParanthis {
    public static void main(String[] args) {

        System.out.println(isValid("){"));

    }

    public static boolean isValid(String s) {
        if(s.length()%2!=0) return false;

        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(')');
            }else if(s.charAt(i)=='['){
                st.push(']');
            }else if(s.charAt(i)=='{'){
                st.push('}');
            }
            else if(s.charAt(i)==')'){
                if(st.isEmpty()) return false;
                if(!st.peek().equals(')')){
                    return false;
                }
                st.pop();
            }else if(s.charAt(i)==']'){
                if(st.isEmpty()) return false;
                if(!st.peek().equals(']')){
                    return false;
                }
                st.pop();
            }else if(s.charAt(i)=='}'){
                if(st.isEmpty()) return false;
                if(!st.peek().equals('}')){
                    return false;
                }
                st.pop();
            }
        }
        if(st.isEmpty()) return true;

        return true;
    }
}
