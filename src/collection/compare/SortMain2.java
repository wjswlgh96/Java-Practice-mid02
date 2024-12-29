package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {

    public static void main(String[] args) {
        Integer[] array = {3, 2, 1};
        System.out.println(Arrays.toString(array));

        System.out.println();
        System.out.println("AscComparator 비교");
        Arrays.sort(array, new AscComparator());
        System.out.println(Arrays.toString(array));

        System.out.println();
        System.out.println("DescComparator 비교");
        Arrays.sort(array, new DescComparator());
        System.out.println(Arrays.toString(array));

        System.out.println();
        Arrays.sort(array, new AscComparator().reversed());     // DESC 와 같다.
        System.out.println(Arrays.toString(array));
    }

    static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1: " + o1 + ", o2: " + o2);
            return o1.compareTo(o2);
        }
    }

    static class DescComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1: " + o1 + ", o2: " + o2);
            return o1.compareTo(o2) * -1;
        }
    }
}
