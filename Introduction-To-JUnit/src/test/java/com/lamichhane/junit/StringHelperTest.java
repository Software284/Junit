package com.lamichhane.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest 
{
	StringHelper helper;
	
	@Before
    public void InitilizeStringHelperBeforeEveryTestCall()
    {
		helper=new StringHelper();
    }
	

	@Test
	public void testTruncateAInFirst2Position_AInFirstTwoPosition() 
	{
	   assertEquals("CD",helper.truncateAInFirst2Position("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Position_AInFirstPosition() 
	{
	   assertEquals("CD",helper.truncateAInFirst2Position("ACD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario()
	{
		//assertFalse("FirstAndLastTwoCharactersWithNegative Output Test Failed",true);
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario()
	{
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	

}
