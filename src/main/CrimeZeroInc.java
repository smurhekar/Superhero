package main;

import java.util.*;

public class CrimeZeroInc {

	private final Map<Integer, List<String>> keyPad;
	private final List<String> superHeros;

	public CrimeZeroInc(Map<Integer, List<String>> keyPad, List<String> superHeros) {
		this.keyPad = keyPad;
		this.superHeros = superHeros;
	}

	public String callForHelp(List<Integer> sms) {
		return findSuperheroWith("", 0, sms);
	}

	private String findSuperheroWith(String word, int index, List<Integer> sms) {
		List<String> letters = keyPad.get(sms.get(index));
		for (String letter: letters){
			if(isLastNumberInSms(index, sms)){
				if(isSuperhero(word + letter)){
					return word + letter;
				}
			}else{
				String superhero = findSuperheroWith(word + letter, index + 1, sms);
				if(!superhero.equals("No Hero Found")){
					return superhero;
				}
			}
		}
		return "No Hero Found";
	}

	private boolean isSuperhero(String word) {
		return superHeros.contains(word);
	}

	private boolean isLastNumberInSms(int index, List<Integer> sms) {
		return index == sms.size() - 1;
	}
}
