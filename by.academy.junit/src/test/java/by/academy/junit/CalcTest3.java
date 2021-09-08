package by.academy.junit;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class CalcTest3<Itenger> extends Assert {

	private int number1;
	private int number2;
	private int result;

	public CalcTest3(int number1, int number2, int result) {
		this.number1 = number1;
		this.number2 = number2;
		this.result = result;
	}

	@Parameterized.Parameters(name = "{index} resultTest3 {2} = {0} * {1}")
	public static Iterable<Object[]> arrayTest3() {
		return Arrays.asList(new Object[][] { { 10, 2, 20 }, { 5, 5, 25 }, { -7, 3, -21 } });
	}

	@Test
	public void calcMultTest() {
		assertEquals(result, Calculator.getMultiple(number1, number2));
	}
}
