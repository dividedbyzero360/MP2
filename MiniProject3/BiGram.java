package MiniProject3;

import java.util.*;

public class BiGram {

	private double delta;

	public BiGram(double delta) {
		this.delta = delta;
	}

	private static List<Character> dictCharacters = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
			'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

	private HashMap<Language, double[][]> languageBiagram = new HashMap<Language, double[][]>();
	private HashMap<Language, double[]> languageCountOfRows = new HashMap<Language, double[]>();

	public void fit(List<Character> characters, Language language) {
		double[][] storage = new double[characters.size()][characters.size()];
		double[] countOfRows = new double[characters.size()];
		languageBiagram.put(language, storage);
		languageCountOfRows.put(language, countOfRows);
		for (int i = 0; i < characters.size() - 1; i++) {
			if (characters.get(i) != '+' && characters.get(i + 1) != '+') {
				int rowNo = dictCharacters.indexOf(characters.get(i));
				int columnNo = dictCharacters.indexOf(characters.get(i + 1));
				storage[rowNo][columnNo]++;
				countOfRows[rowNo]++;
			}

		}

	}
	
	public double getConditionalProbabilty(char first, char second)
	{
		int rowNo = dictCharacters.indexOf(first);
		int columnNo = dictCharacters.indexOf(second);
		return 0;
	}

}
