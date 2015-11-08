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
		List<String> wordsForNumber = keyPad.get(sms.get(index));
		for (String wordForNumber: wordsForNumber){
			if(index == sms.size() - 1){
				if(superHeros.contains(word + wordForNumber)){
					return word + wordForNumber;
				}
			}else{
				String superhero = findSuperheroWith(word + wordForNumber, index + 1, sms);
				if(!superhero.equals("No Hero Found")){
					return superhero;
				}
			}
		}
		return "No Hero Found";
	}
}
