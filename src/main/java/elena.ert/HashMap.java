package elena.ert;

import javafx.util.Pair;

import java.util.ArrayList;

public class HashMap<K, V> {
    private HashTable map;

    public HashMap(int num) {
        map = new HashTable(num);
    }

    public boolean check(K key, V element) {
        try {
            if (key == null) {
                throw new NullPointerException();
            }
            if (element == null) {
                throw new ClassCastException(" value shouldn't be equal to null");
            }
        } catch (ClassCastException exc) {
            System.err.println("Caught ClassCastException: " + exc.getMessage());
            return true;
        } catch (NullPointerException exc) {
            System.err.println("Caught NullPointerException: value is equal to " + exc.getMessage());
            return true;
        }
        return false;
    }

    public boolean check(K key) {
        try {
            if (key == null) {
                throw new ClassCastException(" key should be Integer");
            }
        } catch (ClassCastException exc) {
            System.err.println("Caught ClassCastException: " + exc.getMessage());
            return true;
        }
        return false;
    }

    public void put(K key, V value) {
        boolean check = check(key, value);
        if (check) {
            return;
        }
        Boolean contain = this.map.contains(key);
        if (contain) {
            this.map.delete(key);
        }
        this.map.add(key, value);
    }

    public ArrayList<Pair> get(K key) {
        boolean check = check(key);
        if (check) {
            return null;
        }
        return this.map.get(key);
    }

    public Boolean containsKey(K key) {
        boolean check = check(key);
        if (check) {
            return null;
        }
        return this.map.contains(key);
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    public void show() {
        if (this.map.isEmpty()) {
            System.out.println("Map is empty");
        } else {
            this.map.show();
        }
    }
}
