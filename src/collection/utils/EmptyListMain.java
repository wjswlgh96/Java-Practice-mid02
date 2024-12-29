package collection.utils;

import java.util.*;

public class EmptyListMain {

    public static void main(String[] args) {
        // 빈 가변 리스트 생성
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        // 빈 불변 리스트 생성
        List<Integer> list3 = Collections.emptyList();  // 자바5 에 추가됨
        List<Integer> list4 = List.of();                // 자바 9에 추가됨

        System.out.println("list3.getClass() = " + list3.getClass());
        System.out.println("list4.getClass() = " + list4.getClass());

        System.out.println();
        List<Integer> list5 = Arrays.asList(1, 2, 3);
        List<Integer> list6 = List.of(1, 2, 3);

        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> arrList = Arrays.asList(arr);             // Arrays.asList 는 참조값을 공유함
        arrList.set(0, 100);
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arrList = " + arrList);


        List<Integer> ofList = List.of(arr);
    }
}
