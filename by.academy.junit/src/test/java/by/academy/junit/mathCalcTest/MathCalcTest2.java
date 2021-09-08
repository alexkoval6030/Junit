package by.academy.junit.mathCalcTest;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class MathCalcTest2 extends Assert {

	private double doubleNumber;
	private int miIntegerNumber;

	public MathCalcTest2(double doubleNumber, int miIntegerNumber) {
		this.doubleNumber = doubleNumber;
		this.miIntegerNumber = miIntegerNumber;
	}

	@Parameterized.Parameters(name = "{index} Rounding fraction {0} to nearest larger integer {1}")
	public static Iterable<Object[]> arrayTest() {
		return Arrays.asList(new Object[][] { { 2.2, 3 }, { -0.3, 0 }, { -1.7, -1 } });
	}

	@Test
	public void getMinInteger() {
		assertEquals(miIntegerNumber, (long)Math.ceil(doubleNumber));
	}

}