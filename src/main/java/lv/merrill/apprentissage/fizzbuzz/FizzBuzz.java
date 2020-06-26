package lv.merrill.apprentissage.fizzbuzz;

public final class FizzBuzz {

	private int value;

	private FizzBuzz(int value) {
		this.value = value;
	}

	public static FizzBuzz valueOf(int value) {
		return new FizzBuzz(value);
	}

	private boolean isFizz() {
		return value % 3 == 0 || String.valueOf(value).contains("3");
	}

	private boolean isBuzz() {
		return value % 5 == 0 || String.valueOf(value).contains("5");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		if (isFizz()) {
			sb.append("Fizz");
		}
		if (isBuzz()) {
			sb.append("Buzz");
		}
		if (!isFizz() && !isBuzz()) {
			sb.append(value);
		}

		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FizzBuzz other = (FizzBuzz) obj;
		if (value != other.value)
			return false;
		return true;
	}

	public FizzBuzz next() {
		return new FizzBuzz(value + 1);
	}

	public FizzBuzz previous() {
		return new FizzBuzz(value - 1);
	}
}
