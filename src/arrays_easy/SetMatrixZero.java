package arrays_easy;

import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(setMatrixZero(mat)));
    }

    private static int[][] setMatrixZero(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] row = new int[m];
        int[] col = new int[n];

        Arrays.fill(row,0);
        Arrays.fill(col,0);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(mat[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(row[i] == 1 || col[j] == 1){
                    mat[i][j] = 0;
                }

            }
        }

        return mat;
    }

}
