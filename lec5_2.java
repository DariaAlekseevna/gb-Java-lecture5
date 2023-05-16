package lectures.lec5;

import java.util.*;

public class lec5_2 {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.putIfAbsent(1, "один");
        db.put(2, "два");
        db.put(3, "три");
        db.putIfAbsent(1, "gznm");
        db.putIfAbsent(4, "один");
        System.out.println(db);
        for (var item : db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
    }
}
