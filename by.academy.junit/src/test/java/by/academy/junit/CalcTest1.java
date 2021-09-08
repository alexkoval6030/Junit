package by.academy.junit;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class CalcTest1<Itenger> extends Assert {

	private int number1;
	private int number2;
	private int result;

	public CalcTest1(int number1, int number2, int result) {
		this.number1 = number1;
		this.number2 = number2;
		this.result = result;
	}

	@Parameterized.Parameters(name = "{index} resultTest1 {2} = {0} + {1}")
	public static Iterable<Object[]> arrayTest1() {
		return Arrays.asList(new Object[][] { { 2, 0, 2 }, { 1, 1, 2 }, { -3, 1, -2 } });
	}

	@Test
	public void calcSumTest() {
		assertEquals(result, Calculator.getSum(number1, number2));
	}
}
