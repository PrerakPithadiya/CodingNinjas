public class Search_In_A_2D_Matrix {
    public static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        int r = mat.size(), c = mat.getFirst().size(), i = 0, j = c - 1;
        while ((i < r && j > -1) && (i != r - 1 || j != 0)) {
            if (mat.get(i).get(j) == target) {
                return true;
            } else if (mat.get(i).get(j) < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
