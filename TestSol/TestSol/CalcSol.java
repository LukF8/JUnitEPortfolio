package TestSol;

public class CalcSol {

	private int a;
	private int b;
	
	public CalcSol(int a, int b) {
		this.a = a;
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
	public int div() {
		return a / b;
	}
}
