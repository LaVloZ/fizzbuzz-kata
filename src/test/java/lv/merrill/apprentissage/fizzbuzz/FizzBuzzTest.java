package lv.merrill.apprentissage.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

	@Test
	public void toStringShouldReturnOne() {
		FizzBuzz fizzBuzz = FizzBuzz.valueOf(1);

		String expected = "1";
		String actual = fizzBuzz.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void toStringShouldReturnFizz() {
		FizzBuzz fizzBuzz = FizzBuzz.valueOf(3);

		String expected = "Fizz";
		String actual = fizzBuzz.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void toStringShouldReturnBuzz() {
		FizzBuzz fizzBuzz = FizzBuzz.valueOf(5);

		String expected = "Buzz";
		String actual = fizzBuzz.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void toStringShouldReturnFizzBuzz() {
		FizzBuzz fizzBuzz = FizzBuzz.valueOf(15);

		String expected = "FizzBuzz";
		String actual = fizzBuzz.toString();
		assertEquals(expected, actual);
	}

	@Test
	public void shouldReturnTwo() {
		FizzBuzz fizzBuzz = FizzBuzz.valueOf(2);

		String expected = "2";
		String actual = fizzBuzz.toString();
		assertEquals(expected, actual);
	}

}
