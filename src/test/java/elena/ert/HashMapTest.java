package elena.ert;

import javafx.util.Pair;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class HashMapTest {
    @Test
    public void put() {
        HashMap map = new HashMap(20);
        map.put(12, "errr");
        map.show();
        map.put(12, "yttt");
        map.put(16, "rett");
        map.put("trtr", "yyt");
        map.show();
//        Assert.assertEquals();
    }

    @Test
    public void putNullKey() {
        HashMap map = new HashMap(20);
        map.put(null, "yeu");
    }

    @Test(expected = RuntimeException.class)
    public void putNullValue() {
        HashMap map = new HashMap(20);
        map.put(12, null);
    }

    @Test
    public void get() {
        HashMap map = new HashMap(20);
        map.put(12, "yyt");
        ArrayList<Pair> pairs = map.get(12);
        for (int i = 0; i < pairs.size(); i++) {
            System.out.println(pairs);
        }

        pairs = map.get(5);
        for (int i = 0; i < pairs.size(); i++) {
            System.out.println(pairs);
        }

    }

    @Test
    public void containsKey() {
        HashMap map = new HashMap(20);
        map.put(12, "tyy");
        System.out.println(" Presence of 12: " + map.containsKey(12));
        System.out.println(" Presence of 14: " + map.containsKey(14));
    }

    @Test
    public void isEmpty() {
        HashMap map = new HashMap(20);
        System.out.println(map.isEmpty());
        map.put(12, "sdwe");
        System.out.println(map.isEmpty());
    }
}
