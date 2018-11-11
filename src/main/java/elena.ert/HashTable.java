package elena.ert;

import javafx.util.Pair;
import sun.awt.SunHints;

import java.util.*;

import static java.lang.System.exit;

public class HashTable<K, V> {
    private ArrayListPair[] table;
    private int num;

    public HashTable(int num) {
        this.num = num;
        this.table = new ArrayListPair[num];
    }

    public int hash(K key) {
        return key.hashCode() % this.num;
    }

    public void add(K key, V element) {
        if (this.table[hash(key)] == null) {
            this.table[hash(key)] = new ArrayListPair();
        }
        this.table[hash(key)].add(new Pair(key, element));
    }

    public ArrayList<Pair> get(K key) {
        ArrayList<Pair> arrayList = this.table[hash(key)];
        if (this.table[hash(key)] == null) {
            return null;
        } else {
            ArrayList<Pair> searchPair = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                Pair pair = arrayList.get(i);
                if (pair.getKey().equals(key)) {
                    searchPair.add(pair);
                }
            }
            return searchPair;
        }
    }

    public ArrayList<Pair> delete(K key) {
        ArrayList<Pair> arrayList = this.table[hash(key)];
        if (this.table[hash(key)] == null) {
            return null;
        } else {
            ArrayList<Pair> searchPair = new ArrayList();
            int i = 0;
            while( i < arrayList.size()) {
                Pair pair = arrayList.get(i);
                if (pair.getKey().equals(key)) {
                    searchPair.add(pair);
                    arrayList.remove(i);
                } else {
                    i++;
                }
            }
            return searchPair;
        }

    }

    public Boolean contains(K key) {
        ArrayList<Pair> arrayList = this.table[hash(key)];
        if (this.table[hash(key)] == null) {
            return false;
        } else {
            for (int i = 0; i < arrayList.size(); i++) {
                Pair pair = arrayList.get(i);
                if (pair.getKey().equals(key)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void show() {
        for (int i = 0; i < this.num; i++) {
            ArrayList<Pair> arrayList = this.table[i];
            if (arrayList != null) {
                for (int j = 0; j < arrayList.size(); j++) {
                    System.out.println(arrayList.get(j));
                }
            }
        }
    }

    public boolean isEmpty() {
        for (int i = 0; i < this.num; i++) {
            if ((this.table[i] != null)&&(this.table[i].size() != 0)){
                return false;
            }
        }
        return true;
    }
}
