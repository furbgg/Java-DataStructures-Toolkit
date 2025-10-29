package datenstrukturen;

import java.util.HashSet;
import java.util.Set;

public class MengenOperationen {

    public static Set<Integer> getUnion(Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> ergebnis = new HashSet<>(setA);
        ergebnis.addAll(setB);
        return ergebnis;
    }

    public static Set<Integer> getIntersection ( Set<Integer> setA, Set<Integer> setB) {
        Set<Integer> ergebnis2 = new HashSet<>(setA);
        ergebnis2.retainAll(setB);
        return ergebnis2;
    }
    public static Set<Integer> getDifference ( Set<Integer> setA, Set<Integer> setB){
        Set<Integer> ergebnis3 = new HashSet<>(setA);
        ergebnis3.removeAll(setB);
        return ergebnis3;
    }
}