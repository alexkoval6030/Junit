package by.academy.junit.mathCalcTest;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class MathCalcTest1 extends Assert {

	private int firstNumber;
	private int secondNumber;

	public MathCalcTest1(int firstNumber, int secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	@Parameterized.Parameters(name = "{index} result {0} >= {1}")
	public static Iterable<Object[]> arrayTest() {
		return Arrays.asList(new Object[][] { { 10, 2 }, { 5, 5 }, { -2, -21 } });
	}

	@Test
	public void getMax() {
		assertEquals(firstNumber, Math.max(firstNumber, secondNumber));
	}

}
