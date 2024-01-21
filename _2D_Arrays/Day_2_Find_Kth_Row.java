public class Day_2_Find_Kth_Row {
    public static void main(String[] args) {
        int[][] mat = {
                {0, 1, 1},
                {0, 1, 0},
                {1, 1, 0}
        };
        System.out.println(findRowK(mat));
    }

    public static int findRowK(int[][] mat) {
        int n = mat.length;
        for (int k = 0; k < n; k++) {
            if (isKValid(mat, n, k)) {
                return k;
            }
        }
        return -1;
    }

    public static boolean isKValid(int[][] mat, int n, int k) {
        for (int j = 0; j < n; j++) {
            if (k != j && mat[k][j] != 0) {
                return false;
            }
        }
        for (int i = 0; i < n; i++) {
            if (k != i && mat[i][k] != 1) {
                return false;
            }
        }
        return true;
    }
}