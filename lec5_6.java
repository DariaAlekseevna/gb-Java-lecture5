package lectures.lec5;

import java.util.*;

public class lec5_6 {
    public static void main(String[] args) {
        Map<Integer, String> table = new Hashtable<>();
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один");
        System.out.println(table); // {2=один, 1=два, 11=один один}
        // table.put(null, "один"); // java.lang.NullPointerException
    }
}
