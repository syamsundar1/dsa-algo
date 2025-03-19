package array_medium;

public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n = matrix.length;
        for(int i=0;i<matrix.length;i++){
            for(int j=i + 1;j<matrix.length;j++){

                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;

            }
        }

        for (int i = 0; i < n; i++) {
            reverse(matrix[i]);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void reverse(int[] arr){
        int i =0;
        int j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
