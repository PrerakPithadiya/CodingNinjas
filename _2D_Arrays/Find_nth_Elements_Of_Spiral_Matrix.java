public class Find_nth_Elements_Of_Spiral_Matrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int val = 10;
        System.out.println(findKthElement(mat, val));
    }

    public static int findKthElement(int[][] mat, int k) {
        int top = 0, bottom = mat.length - 1, left = 0, right = mat[0].length - 1, num = 0;
        while (top <= bottom && left <= right) {
            // top
            for (int j = left; j <= right; j++) {
                num++;
                if (num == k) {
                    return mat[top][j];
                }
            }

            // right
            for (int i = top + 1; i <= bottom; i++) {
                num++;
                if (num == k) {
                    return mat[i][right];
                }
            }

            // bottom
            for (int j = right - 1; j >= left; j--) {
                if (top == bottom) {
                    break;
                }
                num++;
                if (num == k) {
                    return mat[bottom][j];
                }
            }

            // left
            for (int i = bottom - 1; i >= top + 1; i--) {
                if (left == right) {
                    break;
                }
                num++;
                if (num == k) {
                    return mat[i][left];
                }
            }

            top++;
            bottom--;
            left++;
            right--;
        }
        return 0;
    }
}