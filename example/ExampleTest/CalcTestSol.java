package ExampleTest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import example.Calc;
import example.CalcException;

public class CalcTestSol {

	public static Calc cal;

	@BeforeClass
	public static void init() {
		cal = new Calc();

	}

	@Before
	public void set() {
		cal.setA(2);
		cal.setB(2);
	}
	
	@Test
	public void additionTest() {
		int add = cal.add();
		assertEquals(add, 4);
	}

	@Test
	public void subtractionTest() {
		int sub = cal.sub();
		assertEquals(sub, 0);
	}

	@Test
	public void multiplicationTest() {
		int mul = cal.mul();
		assertEquals(mul, 4);
	}

	@Test
	public void divisionTest() throws CalcException {
		int div = cal.div();
		assertEquals(div, 1);
	}

}
