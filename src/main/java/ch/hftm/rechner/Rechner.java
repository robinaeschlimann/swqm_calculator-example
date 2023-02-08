package ch.hftm.rechner;

public class Rechner {

	public double addiere(double a, double b) {
		return a + b;
	}

	public double subtrahiere(double a, double b) {
		return a - b;
	}

	public double multipliziere(double a, double b) {
		return a * b;
	}

	public double dividiere(double a, double b) {
		if (b == 0) {
			throw new ArithmeticException();
		}
		return a / b;
	}

	public double untgetesteteOperation(double a) {
		return a;
	}

}
