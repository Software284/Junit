package com.lamichhane.junit;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompateTest {

	@Test
	public void testArraysSort_RandomArray()
	{
		int[] actual= {1,8,6,2};
		int[] expected= {1,2,6,8};
		Arrays.sort(actual);
		assertArrayEquals(expected,actual);
	}
	
	@Test(expected=NullPointerException.class)
	public void testArraySort_NullArray()
	{
		int numbers[]=null;
		Arrays.sort(numbers);
	}
	
	@Test(timeout=100)
	public void testSort_Performance()
	{
		int[] array= {12,23,4};
		for(int i=1;i<=1000000;i++)
		{
			array[0]=i;
			Arrays.sort(array);
		}
	}

}
