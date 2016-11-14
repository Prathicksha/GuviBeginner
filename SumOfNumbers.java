import java.util.Scanner;

public class SumOfNumbers {
	public int Sum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Enter the number to find the sum of all the numbers below it:");
		int number = scanner.nextInt();
		SumOfNumbers sumOfNumbers = new SumOfNumbers();
		System.out.println(sumOfNumbers.Sum(number));
		scanner.close();
	}
}
