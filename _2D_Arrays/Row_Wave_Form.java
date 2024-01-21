import java.util.ArrayList;
import java.util.Arrays;

public class Row_Wave_Form {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(0, 1, 1)));
        list.add(new ArrayList<>(Arrays.asList(8, 0, 9)));
        list.add(new ArrayList<>(Arrays.asList(5, 4, 1)));
        System.out.println(rowWaveForm(list));
    }

    public static ArrayList<Integer> rowWaveForm(ArrayList<ArrayList<Integer>> mat) {
        int r = mat.size(), c = mat.getFirst().size();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < c; j++) {
                    list.add(mat.get(i).get(j));
                }
            } else {
                for (int j = c - 1; j >= 0; j--) {
                    list.add(mat.get(i).get(j));
                }
            }
        }
        return list;
    }
}