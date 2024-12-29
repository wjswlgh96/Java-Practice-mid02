package collection.compare;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortMain4 {

    public static void main(String[] args) {
        MyUser user1 = new MyUser("a", 30);
        MyUser user2 = new MyUser("b", 20);
        MyUser user3 = new MyUser("c", 10);

        List<MyUser> list = new LinkedList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        System.out.println("기본 데이터");
        System.out.println(list);

        System.out.println();

        System.out.println("Comparable 기본 정렬");
        list.sort(null);
        // Collections.sort(list);
        System.out.println(list);


        System.out.println();
        System.out.println("IdComparator 정렬");
        list.sort(new IdComparator());
        // Collections.sort(list, new IdComparator());
        System.out.println(list);

    }
}
