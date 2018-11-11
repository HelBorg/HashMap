package elena.ert;

import javafx.util.Pair;

import java.util.ArrayList;

public class ArrayListPair<K, V> extends ArrayList {
    public ArrayList<Pair<K, V>> arrayList;
    public ArrayListPair() {
        this.arrayList = new ArrayList<Pair<K, V>>();
    }
}
