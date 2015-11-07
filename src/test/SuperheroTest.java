package test;

import org.junit.Test;

import main.CrimeZeroInc;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SuperheroTest {

	@Test
	public void userShouldBeAbleToCallHulkForHelp(){
		CrimeZeroInc inc = new CrimeZeroInc();
		assertEquals("HULK", inc.callForHelp(Arrays.asList(4,8,5,5)));
	}




}
