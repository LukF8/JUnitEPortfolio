package example;

public class Calc {

	
	private int a;
	private int b;
	
	public  Calc() {
		
	}
	
	public Calc(int a, int b) {
		this.a = a;
		this.b = b;
		
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public int add() {
		return a + b;
	}
	public int sub() {
		
		return a - b;
	}


	public int mul() {
		return a*b;
	}
	public int div() throws CalcException {
		if(b==0) {
			throw new CalcException("No division by zero ! ");
		} else {
			return a / b;
		}
		
		
	}
	
	
}
