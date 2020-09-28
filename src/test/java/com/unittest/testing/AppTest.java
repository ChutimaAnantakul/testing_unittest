package com.unittest.testing;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.both;

import org.junit.Before;
import org.junit.Test;
public class AppTest 
{
	Fahrengeit object;
	
	@Before
	public void newClassfahrenheit() {
		object = new Fahrengeit();
	}
	@Test
	public void testResult0input0() {
		double input = 0;
		double expected = 0;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual, 2);
	}
	@Test
	public void testResult1000input1000() {
		double input = 1000;
		double expected = 1000;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual, 2);
	}
	@Test
	public void testResultMinus1000inputMinus1000() {
		double input = -1000;
		double expected = -1000;
		object.input(input);
		double actual = object.getCelcius();
		assertEquals(expected,actual, 2);
	}
	@Test
	public void testResultTrueinput0() {
		double input = 0;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinput1() {
		double input = 1;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinputMinus1() {
		double input = -1;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinput499() {
		double input = 499;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinputMinus499() {
		double input = -499;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinput500() {
		double input = 500;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinputMinus500() {
		double input = -500;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinput501() {
		double input = 501;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinputMinus501() {
		double input = -501;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinput999() {
		double input = 999;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinputMinus999() {
		double input = -999;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinput1000() {
		double input = 1000;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinputMinus1000() {
		double input = -1000;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinput2000() {
		double input = 2000;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinputMinus2000() {
		double input = -2000;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinput1001() {
		double input = 1001;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinputMinus1001() {
		double input = -1001;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinput1010() {
		double input = 1010;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueinputMinus1010() {
		double input = -1010;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
//	-------endtest
}