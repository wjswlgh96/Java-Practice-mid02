package collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {

    public static void main(String[] args) {
        // of로 생성시 편리한 불변 컬렉션 생성
        List<Integer> list = List.of(1, 2, 3);
        // list.add(1); // 불변이라 값 추가, 업데이트 등등 불가능 !런타임 오류니까 조심해야함

        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two");

        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);
        System.out.println("list.getClass() = " + list.getClass());
        System.out.println("set.getClass() = " + set.getClass());

    }
}
