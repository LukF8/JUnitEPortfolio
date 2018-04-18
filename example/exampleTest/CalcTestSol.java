package exampleTest;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import example.Calc;

public class CalcTestSol {

	public static Calc cal;
	
	@BeforeClass
	public static void init() {
		cal = new Calc(2, 2);
		
	}
	
	@Test
	public void CalcTest() {
		
		int add = cal.add();
		assertEquals(add, 4);
		
		int sub = cal.sub();
		assertEquals(sub, 0);
		
		int mul = cal.mul();
		assertEquals(mul, 4);
		
		int div = cal.div();
		assertEquals(div, 1);
	}

}
