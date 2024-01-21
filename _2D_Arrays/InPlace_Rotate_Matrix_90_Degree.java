import java.util.Arrays;

public class InPlace_Rotate_Matrix_90_Degree {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        inPlaceRotate(mat, mat.length);
        printTheMatrix(mat);
    }

    public static void inPlaceRotate(int[][] mat, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for (int col = 0; col < n; col++) {
            int i = 0, j = n - 1;
            while (i < j) {
                int temp = mat[i][col];
                mat[i][col] = mat[j][col];
                mat[j][col] = temp;
                i++;
                j--;
            }
        }
    }

    public static void printTheMatrix(int[][] mat) {
        for (int[] arr : mat) {
            System.out.println(Arrays.toString(arr));
        }
    }
}