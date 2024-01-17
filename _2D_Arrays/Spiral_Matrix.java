import java.util.List;
import java.util.ArrayList;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        System.out.println(spiralOrder(mat));
    }

    public static List<Integer> spiralOrder(int[][] mat) {
        List<Integer> list = new ArrayList<>();
        int top = 0, bottom = r - 1, left = 0, right = c - 1;
        while (top <= bottom && left <= right) {
            // top
            for (int j = left; j <= right; j++) {
                list.add(mat[top][j]);
            }

            // right
            for (int i = top + 1; i <= bottom; i++) {
                list.add(mat[i][right]);
            }

            // bottom
            for (int j = right - 1; j >= left; j--) {
                if (top == bottom) {
                    break;
                }
                list.add(mat[bottom][j]);
            }

            // left
            for (int i = bottom - 1; i >= top + 1; i--) {
                if (left == right) {
                    break;
                }
                list.add(mat[i][left]);
            }

            top++;
            bottom--;
            left++;
            right--;
        }
        return list;
    }
}