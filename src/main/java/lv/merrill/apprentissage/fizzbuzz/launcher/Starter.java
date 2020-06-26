package lv.merrill.apprentissage.fizzbuzz.launcher;

import lv.merrill.apprentissage.fizzbuzz.FizzBuzz;

public class Starter {

	public static void main(String[] args) {
		FizzBuzz fizzBuzz = FizzBuzz.valueOf(1);

		for (int i = 0; i < 100; i++) {
			String response = fizzBuzz.toString();
			System.out.println(response);
			fizzBuzz = fizzBuzz.next();
		}
	}
}
