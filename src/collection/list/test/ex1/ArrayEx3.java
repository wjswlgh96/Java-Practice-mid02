package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayEx3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        int sum = 0;
        double average = 0.0;
        while(true) {
            int n = sc.nextInt();
            if(n == 0) {
                break;
            }

            list.add(n);
            sum += n;
        }
        average = (double) sum / list.size();

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
