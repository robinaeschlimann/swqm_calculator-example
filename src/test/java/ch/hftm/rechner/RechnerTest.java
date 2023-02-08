package ch.hftm.rechner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class RechnerTest {

	private Rechner rechner;

	@BeforeEach
	public void setUp() throws Exception {
		rechner = new Rechner();
	}

	@Test
	public void addierePositiveGanzzahlen() {
		double result = rechner.addiere(5, 2);
		Assertions.assertEquals(7, result, 0);
	}

	@Test
	public void addiereVerschiedene() {
		double result = rechner.addiere(-5.24, 4.1);
		Assertions.assertEquals(-1.14, result, 0.001);
	}

	@Test
	public void subtrahiere() {
		double result = rechner.subtrahiere(92, 1.2);
		Assertions.assertEquals(90.8, result, 0);
	}

	@Test
	public void multipliziere() {
		double result = rechner.multipliziere(2.5, -10);
		Assertions.assertEquals(-25, result, 0);
	}

	@Test
	public void dividiere() {
		double result = rechner.dividiere(20, 5);
		Assertions.assertEquals(4, result, 0.001);
	}

	@Test
	public void dividiereDurchNull() {
		Assertions.assertThrows(ArithmeticException.class, () -> {
			rechner.dividiere(12, 0);
		  });
	}
}
