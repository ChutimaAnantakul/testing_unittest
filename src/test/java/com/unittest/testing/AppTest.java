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
		public void testResult499Input499() {
			double input = 499;
			double expected = 499;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult499InputMinus499() {
			double input = -499;
			double expected = -499;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult500Input500() {
			double input = 500;
			double expected = 500;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult500InputMinus500() {
			double input = -500;
			double expected = -500;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult501Input501() {
			double input = 501;
			double expected = 501;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult501InputMinus501() {
			double input = -501;
			double expected = -501;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult999Input999() {
			double input = 999;
			double expected = 999;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult999InputMinus999() {
			double input = -999;
			double expected = -999;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult1000Input1000() {
			double input = 1000;
			double expected = 1000;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult1000InputMinus1000() {
			double input = -1000;
			double expected = -1000;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult1001Input1001() {
			double input = 1001;
			double expected = 1001;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult1001InputMinus1001() {
			double input = -1001;
			double expected = -1001;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult1010Input1010() {
			double input = 1010;
			double expected = 1010;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult1010InputMinus1010() {
			double input = -1010;
			double expected = -1010;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult2000Input2000() {
			double input = 2000;
			double expected = 2000;
			object.input(input);
			double actual = object.getCelcius();
			assertEquals(expected,actual,2);
		}
		@Test
		public void testResult2000InputMinus2000() {
			double input = -2000;
			double expected = -2000;
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
		public void testResultMassageOutputFromInput0() {
			double input = 0;
			String expected = "0 celcius = 32 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInput1() {
			double input = 1;
			String expected = "1 celcius = 34 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInputMinus1() {
			double input = -1;
			String expected = "-1 celcius = 30 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInput499() {
			double input = 499;
			String expected = "499 celcius = 930 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInputMinus499() {
			double input = -499;
			String expected = "-499 celcius = -866 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInput500() {
			double input = 500;
			String expected = "500 celcius = 932 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInputMinus500() {
			double input = -500;
			String expected = "-500 celcius = -868 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInput501() {
			double input = 501;
			String expected = "501 celcius = 934 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInputMinus501() {
			double input = -501;
			String expected = "-501 celcius = -870 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInput999() {
			double input = 999;
			String expected = "999 celcius = 1830 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInputMinus999() {
			double input = -999;
			String expected = "-999 celcius = -1766 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInput1000() {
			double input = 1000;
			String expected = "1000 celcius = 1832 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInputMinus1000() {
			double input = -1000;
			String expected = "-1000 celcius = -1768 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInput1010() {
			double input = 1010;
			String expected = "1010 celcius = 1850 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInputMinus1010() {
			double input = -1010;
			String expected = "-1010 celcius = -1786 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInputM2000() {
			double input = 2000;
			String expected = "2000 celcius = 3632 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
		@Test
		public void testResultMassageOutputFromInputMinus200() {
			double input = -2000;
			String expected = "-2000 celcius = -3568 Fahrengeit";
			object.input(input);
			object.calculate();
			String actual = object.toString();
			assertEquals(expected,actual);
		}
}