// public class RotateImage {
//     public static void rotate (int matrix[][]) {
//      int i=0;
//          int k =0;
//         int l =matrix.length-1;
//           int m = matrix.length-1;
//         for(int j=0;j<matrix.length-1;j++) {
//         int temp=matrix[i][j];
//         matrix[i][j]=matrix[m][i];
//         matrix[m][i]=matrix[l][m];
//         matrix[l][m]=matrix[k][l];
//         matrix[k][l]=temp;
//             k++;
//             m--;
//         }
     
//      for(int o=0;o<matrix.length;o++){
//         for(int j=0;j<matrix.length;j++){
//             System.out.print(matrix[o][j]+" ");
//         }
//         System.out.println();
//      }
//     }
//     public static void main(String[] args) {
//         int matrix [][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
//         rotate(matrix);
//     }
// }

public class RotateImage {

    public static void rotate(int[][] matrix) {

        int n = matrix.length;

        // Step 1: Transpose
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for(int i = 0; i < n; i++) {

            int start = 0;
            int end = n - 1;

            while(start < end) {

                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;

                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {

        int matrix[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotate(matrix);

        // Print rotated matrix
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
