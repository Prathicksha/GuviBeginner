import java.util.Scanner;

public class FibonacciSeries {
	public void Fibonnaci(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3;
		int limit = n;
		if (limit == 0) {
			System.out.print(n1);
		} else if (limit == 1) {
			System.out.print(n2);
		} else {
			System.out.print(n1 + " " + n2);
			for (int i = 2; i < limit; i++) {
				n3 = n2 + n1;
				n1 = n2;
				n2 = n3;
				System.out.print(" " + n3);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Enter the number for which the fibonacci series is to be generated:");
		int number = scanner.nextInt();
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.Fibonnaci(number);
		scanner.close();
	}
}
