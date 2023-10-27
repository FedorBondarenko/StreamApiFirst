import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> cutIntList = new ArrayList<>();
        for (int i : intList) {
            if (i > 0 && i % 2 == 0) {
                cutIntList.add(i);
            }
            Collections.sort(cutIntList);
        }
        System.out.println(cutIntList);
    }
}


