package fr.afpa.apicollec;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WordCounter {

    public static boolean isValid(String sentence) {
        // création du tableau associatif résultat
        Map<Character, Integer> characterCount = new HashMap<>();

        // Le code suivant transforme une String en chaîne de character (Exemple : "Une phrase." > "U", "n", "e", "p", "h", "r", "a", "s", "e", ".")
        // L'exemple d'Alexis traite une phrase pour en compté les mots, se référer à son git.
        
        // Boucle for qui instancie c = la phrase transformé en character placé dans un tableau (.toCharArray())
        for (char c : sentence.toCharArray()) {
            if (c == '(') { // recherche la paranthèse ouvrante.
                characterCount.put(c, characterCount.getOrDefault(c, 0) + 1); // Ajoute +1 à la valeur Key dans le tableau HashMap.
            } else if (c == ')') { // recherche la paranthèse fermante.
                characterCount.put(c, characterCount.getOrDefault(c, 0) + 1); // Ajoute +1 à la valeur Value dans le tableau HashMap.
            } 
        } 
        // SI Key et Value instancié gràçe à la boucle for sont égaux ET que le characterCount n'est pas vide alors return True. Sinon return False.
        if (characterCount.get('(') == characterCount.get(')') && !characterCount.isEmpty()) {
            return true;
        }
        assert return false;
            }
        
            /**
             * Explication sur !characterCounter.isEmpty() : Une phrase ne comportant pas de paranthèse rendra un résultat de 0 pour Key et Value (logique).
             * 
             * Le moyen d'y remidier est d'ajouter un "!" devant charracterCount.isEmpty. 
             * "!" en code est égal à une négation. La boucle If vérifiant si Key et Value sont égaux en valeurs rendent soit Vrai ou Faux.
             * Pour que la boucle soit validé entiérement, !characterCount.isEmpty() doit aussi être vrai. Si le HashMap (Key et Value) n'est pas vide,
             * la négation transforme le Faux en Vrai. 
             * De même si le HashMap est vide (Pas de paranthèse donc 0) alors il transforme le Vrai en Faux, permettant de contrer le vrai de :
             * (characterCount.get('(') == characterCount.get(')').
     */

}