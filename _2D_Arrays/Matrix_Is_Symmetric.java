public class Matrix_Is_Symmetric {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {2, 4, 5},
                {3, 5, 8}
        };
        System.out.println(isMatrixSymmetric(mat));
    }

    public static boolean isMatrixSymmetric(int[][] a) {
        int n = a.length;
        int[][] b = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[j][i] = a[i][j];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}