package ch.hftm.rechner;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RechnerTest {

	private Rechner rechner;

	@Before
	public void setUp() throws Exception {
		rechner = new Rechner();
	}

	@Test
	public void addierePositiveGanzzahlen() {
		double result = rechner.addiere(5, 2);
		assertEquals(7, result, 0);
	}

	@Test
	public void addiereVerschiedene() {
		double result = rechner.addiere(-5.24, 4.1);
		assertEquals(-1.14, result, 0.001);
	}

	@Test
	public void subtrahiere() {
		double result = rechner.subtrahiere(92, 1.2);
		assertEquals(90.8, result, 0);
	}

	@Test
	public void multipliziere() {
		double result = rechner.multipliziere(2.5, -10);
		assertEquals(-25, result, 0);
	}

	@Test
	public void dividiere() {
		double result = rechner.dividiere(20, 5);
		assertEquals(4, result, 0.001);
	}

	@Test(expected = ArithmeticException.class)
	public void dividiereDurchNull() {
		rechner.dividiere(12, 0);
	}
}
