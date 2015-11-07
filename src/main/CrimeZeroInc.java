package main;

import java.util.*;

public class CrimeZeroInc {
	private static final Map<Integer, List<String>> keyPad = new HashMap<Integer, List<String>>(){
		{
			put(2, Arrays.asList("A", "B", "C"));
			put(3, Arrays.asList("D", "E", "F"));
			put(4, Arrays.asList("G", "H", "I"));
			put(5, Arrays.asList("J", "K", "L"));
			put(6, Arrays.asList("M", "N", "O"));
			put(7, Arrays.asList("P", "Q", "R", "S"));
			put(8, Arrays.asList("T", "U", "V"));
			put(9, Arrays.asList("W", "X", "Y", "Z"));
		}
	};

	private static final List<String> superHeros = new ArrayList<String>(){
		{
			add("HULK");
			add("HUL");
		}
	};

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
