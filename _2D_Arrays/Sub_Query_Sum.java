import java.util.ArrayList;

public class Sub_Query_Sum {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> queries = new ArrayList<>();
        System.out.println(findSubmatrixSum(list, queries));
    }

    public static ArrayList<Integer> findSubmatrixSum(ArrayList<ArrayList<Integer>> mat, ArrayList<ArrayList<Integer>> queries) {
        ArrayList<Integer> result = new ArrayList<>();
        int r = mat.size(), c = mat.getFirst().size();
        makeChanges(mat, r, c);
        for (ArrayList<Integer> list : queries) {
            int l1 = list.get(0);
            int r1 = list.get(1);
            int l2 = list.get(2);
            int r2 = list.get(3);
            int ans;
            if (l1 == 0 && r1 == 0) ans = mat.get(l2).get(r2);
            else if (l1 == 0) ans = mat.get(l2).get(r2) - mat.get(l2).get(r1 - 1);
            else if (r1 == 0) ans = mat.get(l2).get(r2) - mat.get(l1 - 1).get(r2);
            else
                ans = mat.get(l2).get(r2) - mat.get(l2).get(r1 - 1) + mat.get(l1 - 1).get(r1 - 1) - mat.get(l1 - 1).get(r2);
            result.add(ans);
        }
        return result;
    }

    public static void makeChanges(ArrayList<ArrayList<Integer>> mat, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                mat.get(i).set(j, mat.get(i).get(j) + mat.get(i).get(j - 1));
            }
        }
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                mat.get(i).set(j, mat.get(i).get(j) + mat.get(i - 1).get(j));
            }
        }
    }
}
