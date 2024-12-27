package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] textArr = text.split(" ");

        Map<String, Integer> map = new HashMap<>();
        for (String s : textArr) {
            Integer count = map.get(s);
            if (count == null) {
                count = 0;
            }
            count++;
            map.put(s, count);
        }

        System.out.println(map);
    }
}
