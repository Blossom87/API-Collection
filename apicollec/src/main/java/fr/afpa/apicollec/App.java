package fr.afpa.apicollec;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

	public static void main(String[] args) {

		System.out.println("----- Exercice d'entraînement à l'utilisation de \"Stack\"");

		boolean result = DoubleQuoteChecker.isClosed("(<c>)");
		System.out.println("Resultat + " + result);
		result = DoubleQuoteChecker.isClosed("(<c>");
		System.out.println("Resultat + " + result);
		result = DoubleQuoteChecker.isClosed("(<c)");
		System.out.println("Resultat + " + result);
		result = DoubleQuoteChecker.isClosed("c>)");
		System.out.println("Resultat + " + result);
		result = DoubleQuoteChecker.isClosed("<c>)");
		System.out.println("Resultat + " + result);

		System.out.println( "\n----- Exercice d'entraînement à l'utilisation de \"HashMap\"" );
		
		boolean test = WordCounter.isValid("C");
		System.err.println("TEST + " + test);
		boolean test1 = WordCounter.isValid("(C)");
		System.err.println("TEST + " + test1);
		boolean test2 = WordCounter.isValid("C)");
		System.err.println("TEST + " + test2);
	}
}
