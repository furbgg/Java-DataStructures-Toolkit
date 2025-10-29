package datenstrukturen;

import java.util.HashMap;
import java.util.Map;

public class Worterbuch {
    private Map<String ,String> englishToGerman = new HashMap<>();
    private Map<String , String> germanToEnglish = new HashMap<>();

    public void addWord (String englischW , String germanW) {
        this.englishToGerman.put(englischW, germanW);
        this.germanToEnglish.put(germanW , englischW);
        System.out.println("Added : " + englischW + "=(DE) " + germanW);

    }
    public void removeWord (String word) {
        if (this.englishToGerman.containsKey(word)){
            String germanTranslate = this.englishToGerman.remove(word);
            this.germanToEnglish.remove(germanTranslate);
        }else if (this.germanToEnglish.containsKey(word)) {
            String englischTranslate = this.germanToEnglish.remove(word);

            this.englishToGerman.remove(englischTranslate);
        } else {
            System.out.println("Cannot remove these Word. Please Try Again!");

        }
    }

    public String translate(String word) {
        if (englishToGerman.containsKey(word)) {
            return englishToGerman.get(word);
        } else if (germanToEnglish.containsKey(word)) {
            return germanToEnglish.get(word);
        } else {
            return null;
        }
    }
}
