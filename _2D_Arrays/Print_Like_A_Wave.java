import java.util.Arrays;

public class Print_Like_A_Wave {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {7, 2, 6, 5},
                {0, 2, 8, 5}
        };
        int r = mat.length, c = mat[0].length;
        int[] ans = wavePrint(mat, r, c);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] wavePrint(int[][] mat, int r, int c) {
        int[] result = new int[r * c];
        int k = 0;
        for (int j = 0; j < c; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < r; i++) {
                    result[k++] = mat[i][j];
                }
            } else {
                for (int i = r - 1; i >= 0; i--) {
                    result[k++] = mat[i][j];
                }
            }
        }
        return result;
    }
}