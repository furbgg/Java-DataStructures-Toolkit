package datenstrukturen;

import java.util.*;

public class DatenStrukturen {
    public static void main(String[] args) {

        System.out.println("\n\n====================================");
        System.out.println("--- MengenOperationen Test ---");
        System.out.println("====================================");
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 3, 5));
        Set<Integer> setB = new HashSet<>(Arrays.asList(3 , 5 , 7));
        Set<Integer> setC = new HashSet<>(Arrays.asList(5 , 7 , 9 ));

        System.out.println("Original Set A: " + setA);
        System.out.println("Original Set B: " + setB);
        System.out.println("Original Set C: " + setC);
        System.out.println("------------------------------------");

        Set<Integer> unionAB = MengenOperationen.getUnion(setA , setB);
        System.out.println("A u B = " + unionAB);
        Set<Integer> unionAC = MengenOperationen.getUnion(setA , setC);
        System.out.println("A u C = " + unionAC);
        Set<Integer> unionBC = MengenOperationen.getUnion(setB, setC);
        System.out.println("B u C = " + unionBC);

        System.out.println("\n--- Intersection  ---");
        Set<Integer> intersectionAB = MengenOperationen.getIntersection(setA , setB);
        System.out.println("A ∩ B = " + intersectionAB);
        Set<Integer> intersectionAC = MengenOperationen.getIntersection(setA, setC);
        System.out.println("A ∩ C = " + intersectionAC);
        Set<Integer> intersectionBC = MengenOperationen.getIntersection(setB, setC);
        System.out.println("B ∩ C = " + intersectionBC);

        System.out.println("\n--- Difference  ---");
        System.out.println("A // B =" + MengenOperationen.getDifference(setA,setB));
        System.out.println("B // A =" + MengenOperationen.getDifference(setB,setA));
        System.out.println("A // C = " + MengenOperationen.getDifference(setA,setC));
        System.out.println("C // A = " + MengenOperationen.getDifference(setC,setA));
        System.out.println("B // C = " + MengenOperationen.getDifference(setB, setC));
        System.out.println("C // B = " + MengenOperationen.getDifference(setC,setB));

        System.out.println("\n----New Operations ---");
     Set<Integer> unionABC = MengenOperationen.getUnion(setA , MengenOperationen.getUnion(setB,setC));
        Set<Integer> complexResult = MengenOperationen.getUnion(setA, MengenOperationen.getIntersection(setB ,setC));
        System.out.println("A u B u C = " + unionABC);
        System.out.println("A ∪ (B ∩ C) = " + complexResult);


        System.out.println("\n\n====================================");
        System.out.println("--- Wörterbuch Test ---");
        System.out.println("====================================");

        Worterbuch dictionary = new Worterbuch();

        System.out.println("Adding ...");
        dictionary.addWord("Dog" , "Hund");
        dictionary.addWord("Cat" , "Katze");
        dictionary.addWord("house","Haus");


        System.out.println("Transalte...");
        String translationofDog = dictionary.translate("Dog");
        if (translationofDog != null){
            System.out.println("Translating 'dog' (EN -> DE) " + translationofDog);
        } else {
            System.out.println("'dog' was not found in dictionary");
        }
       String translateofKatze = dictionary.translate("Katze");
        if (translateofKatze != null) {
            System.out.println("Translating 'Katze' (DE -> EN)" + translateofKatze);
        } else {
            System.out.println("'Katze' was not found in dictionary");
        }
        String translateofCow = dictionary.translate("Cow");
        if (translateofCow != null) {
            System.out.println("Translating 'Cow'(EN -> DE) +" + translateofCow);
        } else {
            System.out.println("'Cow' was not found in dictionary!");
        }


        System.out.println("Removing....");
        dictionary.removeWord("Dog");
        dictionary.removeWord("Cat");
        System.out.println("Was the word “dog” successfully deleted?" + dictionary.translate("Dog"));
        System.out.println("Was the word “Hund” successfully deleted?" + dictionary.translate("Hund"));

        System.out.println("\n\n====================================");
        System.out.println("---Liste Sortieren Test ---");
        System.out.println("====================================");
        List<Integer> unsortedList = new ArrayList<>(Arrays.asList(64,34,25,12,22,11,90));
        System.out.println("Before sorting " + unsortedList);
        ListeSortieren sorter = new ListeSortieren();
        sorter.buubleSortLis(unsortedList);
        System.out.println("After sorting " + unsortedList);


    }
}
