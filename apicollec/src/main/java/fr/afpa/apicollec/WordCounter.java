package fr.afpa.apicollec;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static boolean isValid(String sentence) {
        
        Map<Character, Integer> characterCount = new HashMap<>();

        for (char c : sentence.toCharArray()) {
            if (c == '(') {
                characterCount.put(c, characterCount.getOrDefault(c, 0) + 1);
            } else if (c == ')') {
                characterCount.put(c, characterCount.getOrDefault(c, 0) + 1);
            } 
        } 
        
        if (characterCount.get('(') == characterCount.get(')') && !characterCount.isEmpty()) {
            return true;
        }
        return false;
    }
}