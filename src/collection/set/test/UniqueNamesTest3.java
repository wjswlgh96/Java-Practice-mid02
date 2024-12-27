package collection.set.test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {

    public static void main(String[] args) {
        int[] intArr = {30, 20, 20, 10, 10};
        Integer[] inputArr = Arrays.stream(intArr).boxed().toArray(Integer[]::new);
        Set<Integer> set = new TreeSet<>(List.of(inputArr));

        for (Integer s : set) {
            System.out.println(s);
        }
    }
}
