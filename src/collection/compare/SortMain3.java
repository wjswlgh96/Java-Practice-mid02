package collection.compare;

import java.util.Arrays;

public class SortMain3 {

    public static void main(String[] args) {
        MyUser user1 = new MyUser("a", 30);
        MyUser user2 = new MyUser("b", 20);
        MyUser user3 = new MyUser("c", 10);

        MyUser[] users = {user1, user2, user3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(users));

        System.out.println();
        System.out.println("Comparable 기본 정렬");
        Arrays.sort(users);
        System.out.println(Arrays.toString(users));

        // 추가
        System.out.println();
        System.out.println("IdComparator 정렬");
        Arrays.sort(users, new IdComparator());
        System.out.println(Arrays.toString(users));

        System.out.println("IdComparator.reversed() 정렬");
        Arrays.sort(users, new IdComparator().reversed());
        System.out.println(Arrays.toString(users));
    }
}
