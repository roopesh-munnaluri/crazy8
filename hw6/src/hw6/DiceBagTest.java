package hw6;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

public class DiceBagTest 
{
	DiceBag diceBag;
	Token t = null;

	@Before
	public void setUp() throws Exception 
	{
		diceBag = new DiceBag();
		t = new OrderDie("Suresh","green");
	}

	@After
	public void tearDown() throws Exception 
	{
		diceBag = null;
		t = null;
	}

	@Test
	public void testAddToken() 
	{
		
		  int size1 = diceBag.bag.size(); 
		  diceBag.addToken(new OrderDie("Tom","red"));
		  int size2 = diceBag.bag.size(); 
		  assertEquals(size1+1,size2);
		 
	}

	
	@Test
	public void testDrawToken() throws Exception 
	{
		diceBag.addToken(t);
		diceBag.addToken(t);
		Token actual = diceBag.drawToken();
		assertEquals(String.valueOf(actual),"Suresh");
	}
	@Test 
	public void testToString() 
	{   
		String expected = " Dice left: 0\n";
		assertEquals(diceBag.toString(),expected); 
	}
}
