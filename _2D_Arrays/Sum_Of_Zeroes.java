import java.util.ArrayList;
import java.util.Arrays;

public class Sum_Of_Zeroes {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
        list.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
        list.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
        System.out.println(coverageOfMatrix(list));
    }

    public static Integer coverageOfMatrix(ArrayList<ArrayList<Integer>> mat) {
        int r = mat.size(), c = mat.getFirst().size(), sum = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (mat.get(i).get(j) == 0) {
                    if (i > 0 && mat.get(i - 1).get(j) == 1) sum++;
                    if (j > 0 && mat.get(i).get(j - 1) == 1) sum++;
                    if (i < r - 1 && mat.get(i + 1).get(j) == 1) sum++;
                    if (j < c - 1 && mat.get(i).get(j + 1) == 1) sum++;
                }
            }
        }
        return sum;
    }
}