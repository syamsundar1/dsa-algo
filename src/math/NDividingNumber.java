package math;

public class NDividingNumber {
    public static void main(String[] args) {

        int n = 8;
        System.out.println(findNDivdeNumber(n));

    }

    private static String findNDivdeNumber(int n) {
        for (int i = 1; i < n; i++) {
            int f = i;
            int s = n - i;
            boolean a = checkEven(f);
            boolean b = checkEven(s);
            if(a&&b){
                return "Yes";
            }
        }
        return "No";
    }

    private static boolean checkEven(int f) {
        return f % 2 == 0;
    }
}
