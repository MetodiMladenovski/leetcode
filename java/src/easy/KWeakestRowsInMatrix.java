package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class KWeakestRowsInMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        int countSoldiers = 0;
        Map<Integer, Integer> mappedRows = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) {
                    ++countSoldiers;
                }
            }
            mappedRows.put(i, countSoldiers);
            countSoldiers = 0;
        }
        System.out.println(mappedRows);
        return mappedRows
                .entrySet()
                .stream()
                .sorted((i1, i2) -> {
                    int vK = i1.getValue().compareTo(i2.getValue());
                    if (vK == 0) {
                        return i1.getKey().compareTo(i2.getKey());
                    }
                    return vK;
                }).map(Map.Entry::getKey).flatMapToInt(IntStream::of).limit(k).toArray();
    }

}
