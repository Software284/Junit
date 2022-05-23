package com.lamichhane.junit;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParametrizedTest2 
{
	
	private String input;
	private String expectedOutptu;
	StringHelper helper=new StringHelper();
	
	
	
	public StringHelperParametrizedTest2(String input, String expectedOutptu) {
		this.input = input;
		this.expectedOutptu = expectedOutptu;
	}
	
	@Test
	public void Payment_WithValidAmount_UpdateBalance() 
	{
	   String customer = "VIT";
	   double begingingBalance = 11.99;
	   double paymentAmount = 4.45;
	   double expected = 7.44;
	   
	   FoodOrder account = new FoodOrder(customer, begingingBalance);
	   
	   assertEquals(account.makePayment(paymentAmount),expected);




	@Parameters
	public static List<Object> testConditions()
	{
		String expectedOutputs[][]= {{"AACD","CD"},{"ACD","CD"}};
		return Arrays.asList(expectedOutputs);
	}
	
	
	

	@Test
	public void testTruncateAInFirst2Position_AInFirstTwoPosition() 
	{
	   assertEquals(expectedOutptu,helper.truncateAInFirst2Position(input));
	}
	

	

}
