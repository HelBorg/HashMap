package elena.ert;

import java.util.*;

import com.sun.org.apache.bcel.internal.generic.TABLESWITCH;
import javafx.util.Pair;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashTableTest {

    @Test
    public void addEl() {
        HashTable<Object, Object> table = new HashTable<>(20);
        table.add(12, "rtu");
        table.add(12, "fgejw");
        table.add(9, "ewo");
        table.add(9, "ewo");
        table.add("oo9", "hhhe");
        table.show();
    }

//    @Test(expected = NullPointerException.class)
//    public void addNullKey() {
//        HashTable table = new HashTable(20);
//        table.add(null, "bh");
//    }
//
//    @Test(expected = NullPointerException.class)
//    public void addNullVal() {
//        HashTable table = new HashTable(20);
//        table.add(12, null);
//    }

    @Test
    public void get() {
        HashTable table = new HashTable(20);
        table.add(12, "fryy");
        table.add(12, "orrr");
        table.add(13, "lol");

        table.show();

        ArrayList<Pair> arrayList = table.get(12);
        System.out.println("\n Key = 12");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        arrayList = table.get(9);
        System.out.println("\n Key = 9");
        if (arrayList == null){
            System.out.println("null");
        } else {
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
            }
        }
    }

    @Test
    public void delEl() {
        HashTable table = new HashTable(20);
        table.add(12, "rtu");
        table.add(32, "uftc");
        table.add(12, "fgejw");
        table.add(9, "ewo");
        table.add(9, "ewo");
        table.show();
        table.delete(12);
        System.out.println();
        System.out.println("After deleting 12:");
        table.show();
        System.out.println();
        System.out.println(" After deleting 9:");
        table.delete(9);
        table.show();
    }

    @Test
    public void delNotExist() {
        HashTable table = new HashTable(20);
        table.add(32, "rrtt");
        table.delete(12);
        table.delete(13);
    }

//    @Test
//    public void delNullEl() {
//        HashTable table = new HashTable(20);
//        table.delete(null);
//    }

    @Test
    public void pres() {
        HashTable table = new HashTable(20);
        table.add(12, "rtu");
        table.add(32, "uftc");
        table.add(12, "fgejw");
        table.show();
        Boolean pres12 = table.contains(12);
        System.out.println(" Presence of 12: " + pres12);
        Boolean pres14 = table.contains(14);
        System.out.println(" Presence of 14: " + pres14);
    }

//    @Test
//    public void presNullKey() {
//        HashTable table = new HashTable(20);
//        Boolean check = table.contains(null);
//        System.out.println(check);
//    }

    @Test
    public void isEmpty() {
        HashTable table = new HashTable(20);
        System.out.println(table.isEmpty());
        table.add(12, "rre");
        System.out.println(table.isEmpty());
    }
}