package test;

import org.junit.Test;

import main.CrimeZeroInc;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class SuperheroTest {

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

	@Test
	public void userShouldBeAbleToCallHulkForHelp(){
		CrimeZeroInc inc = new CrimeZeroInc(keyPad, superHeros);
		assertEquals("HULK", inc.callForHelp(Arrays.asList(4,8,5,5)));
	}




}
