package by.academy.junit;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class CalcTest2<Itenger> extends Assert {

	private int number1;
	private int number2;
	private int result;

	public CalcTest2(int number1, int number2, int result) {
		this.number1 = number1;
		this.number2 = number2;
		this.result = result;
	}

	@Parameterized.Parameters(name = "{index} resultTest2 {2} = {0} / {1}")
	public static Iterable<Object[]> arrayTest2() {
		return Arrays.asList(new Object[][] { { 4, 2, 2 }, { 6, 3, 2 }, { -2, 2, -1 } });
	}

	@Test
	public void calcDivTest() {
		assertEquals(result, Calculator.getDivide(number1, number2));
	}
}
