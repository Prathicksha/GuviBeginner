public class SumOfOddNumbers {
	public static void main(String[] args) {
		int a = 0;
		do {
			System.out.println(++a);
		} while (a < 15);
		int sum = 0;
		for (int i = 15; i <= 45; i = i + 2) {
			sum += i;
		}
		System.out.println("Sum of odd numbers between 15 and 45: " + sum);
	}
}
