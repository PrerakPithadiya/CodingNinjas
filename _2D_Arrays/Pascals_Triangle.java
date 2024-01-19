import java.util.ArrayList;

public class Pascals_Triangle {
    public static void main(String[] args) {
        int n = 6;
        ArrayList<ArrayList<Long>> res = printPascal(n);
        for (ArrayList<Long> list : res) {
            System.out.println(list);
        }
    }

    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> list = new ArrayList<>();
        long val = 0;
        for (int i = 1; i <= n; i++) {
            list.add(new ArrayList<>());
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    val = 1;
                } else {
                    val = val * (i - j + 1) / (j - 1);
                }
                list.get(i - 1).add(j - 1, val);
            }
        }
        return list;
    }
}