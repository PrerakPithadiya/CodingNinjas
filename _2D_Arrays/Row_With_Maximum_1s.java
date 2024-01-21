import java.util.ArrayList;
import java.util.Arrays;

public class Row_With_Maximum_1s {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        list.add(new ArrayList<>(Arrays.asList(0, 0, 1)));
        list.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
        System.out.println(rowMaxOnes(list, list.size(), list.getFirst().size()));
    }

    public static int rowMaxOnes(ArrayList<ArrayList<Integer>> mat, int r, int c) {
        int max = 0, row = -1, i = 0;
        for (ArrayList<Integer> arr : mat) {
            int l = firstIndex(arr, c);
            if (l != -1) {
                int occurrence = c - l;
                if (max < occurrence) {
                    max = occurrence;
                    row = i;
                }
            }
            i++;
        }
        return row;
    }

    public static int firstIndex(ArrayList<Integer> arr, int n) {
        int start = 0, end = n - 1, firstOccurrence = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr.get(mid) == 1) {
                firstOccurrence = mid;
                end = mid - 1;
            } else if (arr.get(mid) < 1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return firstOccurrence;
    }
}