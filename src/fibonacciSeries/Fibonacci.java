package fibonacciSeries;

public class Fibonacci {

	public static void main(String[] args) {

		Fibonacci f = new Fibonacci();
		int findFib = 7;
		for (int i = 1; i <= findFib; i++) {
			System.out.println(f.fibonacci(i));
		}
	}

	public int fibonacci(int i) {
		if (i == 0) {

			return 0;
		} else if (i == 1 || i == 2) {

			return 1;

		} else {
			int f = fibonacci(i - 1) + fibonacci(i - 2);

			return f;

		}

	}

}
