package com.unittest.testing;
import static org.junit.Assert.assertEquals;
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
	public void testResultTrueInput0() {
		double input = 0;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInput1() {
		double input = 1;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputMinus1() {
		double input = -1;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInput499() {
		double input = 499;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
 	@Test
	public void testResultTrueInputMinus499() {
		double input = -499;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInput500() {
		double input = 500;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputMinus500() {
		double input = -500;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInput501() {
		double input = 501;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputMinus501() {
		double input = -501;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInput999() {
		double input = 999;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputMinus999() {
		double input = -999;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInput1000() {
		double input = 1000;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultTrueInputMinus1000() {
		double input = -1000;
		boolean expected = true;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultFalseInput1001() {
		double input = 1001;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultFalseInputMinus1001() {
		double input = -1001;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultFalseInput1010() {
		double input = 1010;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultFalseInputMinus1010() {
		double input = -1010;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultFalseInput2000() {
		double input = 2000;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
	@Test
	public void testResultFalseInputMinus() {
		double input = -2000;
		boolean expected = false;
		boolean actual = object.isBound(input);
		assertEquals(expected,actual);
	}
		@Test
		public void testResult0Input0() {
			double input = 0;
			double expected = 0;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult1Input1() {
			double input = 1;
			double expected = 1;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult0InputMinus1() {
			double input = -1;
			double expected = -1;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		
		
		
		@Test
		public void testResult32CalculateFromInput0() {
			double input = 0;
			double expected = 32.00;
			object.input(input);
			object.calculate();
			double actual = object.getFahrenheit();
			assertEquals(expected,actual, 2);
		}
		@Test
		public void testResult32CalculateFromInput1() {
			double input = 1;
			double expected = 33.80;
			object.input(input);
			object.calculate();
			double actual = object.getFahrenheit();
			assertEquals(expected,actual, 2);
		}
		@Test
		public void testResult32CalculateFromInputMinus1() {
			double input = -1;
			double expected = 30.20;
			object.input(input);
			object.calculate();
			double actual = object.getFahrenheit();
			assertEquals(expected,actual, 2);
		}
		@Test
		public void testResult32CalculateFromInput499() {
			double input = 499;
			double expected = 930.20;
			object.input(input);
			object.calculate();
			double actual = object.getFahrenheit();
			assertEquals(expected,actual, 2);
		}
		@Test
		public void testResult32CalculateFromInputMinus499() {
			double input = -499;
			double expected = -866.20;
			object.input(input);
			object.calculate();
			double actual = object.getFahrenheit();
			assertEquals(expected,actual, 2);
		}
		@Test
		public void testResult32CalculateFromInput500() {
			double input = 500;
			double expected = 932.00;
			object.input(input);
			object.calculate();
			double actual = object.getFahrenheit();
			assertEquals(expected,actual, 2);
		}
		@Test
		public void testResult32CalculateFromInputMinus500() {
			double input = -500;
			double expected = -868.00;
			object.input(input);
			object.calculate();
			double actual = object.getFahrenheit();
			assertEquals(expected,actual, 2);
		}
		@Test
		public void testResult32CalculateFromInput501() {
			double input = 501;
			double expected = 933.80;
			object.input(input);
			object.calculate();
			double actual = object.getFahrenheit();
			assertEquals(expected,actual, 2);
		}
		@Test
		public void testResult32CalculateFromInputMinus501() {
			double input = -501;
			double expected = -869.80;
			object.input(input);
			object.calculate();
			double actual = object.getFahrenheit();
			assertEquals(expected,actual, 2);
		}
		@Test
		public void testResult32CalculateFromInput999() {
			double input = 999;
			double expected = 1830.20;
			object.input(input);
			object.calculate();
			double actual = object.getFahrenheit();
			assertEquals(expected,actual, 2);
		}
		@Test
		public void testResult32CalculateFromInputMinus999() {
			double input = -999;
			double expected = -1766.20;
			object.input(input);
			object.calculate();
			double actual = object.getFahrenheit();
			assertEquals(expected,actual, 2);
		}
		@Test
		public void testResult32CalculateFromInput1000() {
			double input = 1000;
			double expected = 1832;
			object.input(input);
			object.calculate();
			double actual = object.getFahrenheit();
			assertEquals(expected,actual, 2);
		}
		@Test
		public void testResult32CalculateFromInputMinus1000() {
			double input = -1000;
			double expected = -1768;
			object.input(input);
			object.calculate();
			double actual = object.getFahrenheit();
			assertEquals(expected,actual, 2);
		}
		@Test
		public void testResult32CalculateFromInput1001() {
			double input = 1001;
			double expected = 1833.80;
			object.input(input);
			object.calculate();
			double actual = object.getFahrenheit();
			assertEquals(expected,actual, 2);
		}
		@Test
		public void testResult32CalculateFromInputMinus1001() {
			double input = -1001;
			double expected = -1769.80;
			object.input(input);
			object.calculate();
			double actual = object.getFahrenheit();
			assertEquals(expected,actual, 2);
		}
		@Test
		public void testResult32CalculateFromInput1010() {
			double input = 1010;
			double expected = 1850.00;
			object.input(input);
			object.calculate();
			double actual = object.getFahrenheit();
			assertEquals(expected,actual, 2);
		}
		@Test
		public void testResult32CalculateFromInputMinus1010() {
			double input = -1010;
			double expected = -1786.00;
			object.input(input);
			object.calculate();
			double actual = object.getFahrenheit();
			assertEquals(expected,actual, 2);
		}
		@Test
		public void testResult32CalculateFromInput2000() {
			double input = 2000;
			double expected = 3632.00;
			object.input(input);
			object.calculate();
			double actual = object.getFahrenheit();
			assertEquals(expected,actual, 2);
		}
		@Test
		public void testResult32CalculateFromInputMinus2000() {
			double input = -2000;
			double expected = -3568.00;
			object.input(input);
			object.calculate();
			double actual = object.getFahrenheit();
			assertEquals(expected,actual, 2);
		}
		
		
		
		@Test
		public void testResultMassageOutputFromInput0() {
			double input = 0;
			String expected = "0 celcius = 32.00 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInput1() {
			double input = 1;
			String expected = "1 celcius = 33.80 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInputMinus1() {
			double input = -1;
			String expected = "-1 celcius = 30.20 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInput499() {
			double input = 499;
			String expected = "499 celcius = 930.20 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInputMinus499() {
			double input = -499;
			String expected = "-499 celcius = -866.20 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInput500() {
			double input = 500;
			String expected = "500 celcius = 932.00 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInputMinus500() {
			double input = -500;
			String expected = "-500 celcius = -868.00 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInput501() {
			double input = 501;
			String expected = "501 celcius = 933.80 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInputMinus501() {
			double input = -501;
			String expected = "-501 celcius = -869.80 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInput999() {
			double input = 999;
			String expected = "999 celcius = 1830.20 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInputMinus999() {
			double input = -999;
			String expected = "-999 celcius = -1766.20 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInput1000() {
			double input = 1000;
			String expected = "1000 celcius = 1832.00 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInputMinus1000() {
			double input = -1000;
			String expected = "-1000 celcius = -1768.00 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInput1010() {
			double input = 1010;
			String expected = "1010 celcius = 1850.00 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInputMinus1010() {
			double input = -1010;
			String expected = "-1010 celcius = -1786.00 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInputM2000() {
			double input = 2000;
			String expected = "2000 celcius = 3632.00 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInputMinus200() {
			double input = -2000;
			String expected = "-2000 celcius = -3568.00 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
}