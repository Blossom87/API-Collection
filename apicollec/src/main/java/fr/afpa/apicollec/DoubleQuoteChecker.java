package fr.afpa.apicollec;

import java.util.EmptyStackException;
import java.util.Stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DoubleQuoteChecker {

    /**
     * Trouver si toutes les guillemets et chevrons ouvrant d'une phrase sont correctement
     * fermées.
     * || = ou && = et
     */

    public static boolean isClosed(String sentence) throws EmptyStackException {

        // création d'un nouvelle pile abritant la paranthèse et chevron ouvrant.
        Stack<Character> paranthese = new Stack<>();
        Stack<Character> chevron = new Stack<>();

        try {
        // on passe en revu tous les caractères de la chaîne de caractères à tratier
        for (char ch : sentence.toCharArray()) {
            // si parenthèse ouvrant -> on ajoute un élément à la pile paranthese
            if (ch == '(') {
                paranthese.push(ch);
                // aussi si chevron ouvrant -> on ajoute un élément à la pile chevron
            } else if (ch == '<') {
                chevron.push(ch);
            } else if (ch == '>') { // si chevron fermant, on enlève l'élément de la pile
                if (chevron.isEmpty() || chevron.pop() == '>') {
                    return false;
                }
            } else if (ch == ')') { // si parenthèse fermante, on enlève l'élément de la pile 
                if (paranthese.isEmpty() || paranthese.pop() == ')') {
                    return false;
                }
            }
        }

    } catch (EmptyStackException exception) {
        // gestion de l'erreur
        System.err.println(exception.getMessage());
    }
        return paranthese.isEmpty() && chevron.isEmpty();
    }
}