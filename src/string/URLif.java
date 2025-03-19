package string;

public class URLif {
    public static void main(String[] args) {
        String ip = "Mr John Smith ";
        String replace = "%20";

        StringBuffer sb = new StringBuffer();
        for(char ch : ip.toCharArray()){
            if(ch == ' '){
                sb.append(replace);
            }else {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
