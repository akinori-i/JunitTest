package junit.tutorial;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class CalculatorTests {
	@Test
	public void GetResult_Multiply_3_4() {
		Calculator calc = new Calculator();
		int expected = 12;
		int actual = calc.multiply(3, 4);
		assertThat(actual, is(expected));
	}

	@Test
	public void GetResult_Multiply_5_7() {
		Calculator calc = new Calculator();
		int expected = 35;
		int actual = calc.multiply(5, 7);
		assertThat(actual, is(expected));
	}

	@Test
	public void GetResult_Divide_3_2() {
		Calculator calc = new Calculator();
		float expected = 1.5f;
		float actual = calc.divide(3, 2);
		assertThat(actual, is(expected));
	}	


	@Test(expected = IllegalArgumentException.class)
	public void Send_IllegalArgumentexception_5_0() {
		Calculator calc = new Calculator();
		calc.divide(5, 0);
	}		
}
