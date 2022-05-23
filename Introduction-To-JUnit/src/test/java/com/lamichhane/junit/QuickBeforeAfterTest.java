package com.lamichhane.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest
{
	
	@BeforeClass
	public static void ThisMethodWillRunBeforeExecutingAllTest()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void ThisMethodWillRunAfterExecutingAllTest()
	{
		System.out.println("After Class");
	}
	
	@Before
	public void ThisMethodWillRunBeforeExecutingEveryTest()
	{
		System.out.println("Before Test");
	}
	
	@After
	public void ThisMethodWillRunAfterExecutingEveryTest()
	{
		System.out.println("After Test");
	}

	@Test
	public void test1() 
	{
		System.out.println("Test1 Executed");
	}
	
	@Test
	public void test2() 
	{
		System.out.println("Test2 Executed");
	}

}
