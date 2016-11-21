import java.util.Scanner;

public class AmstrongNumInIntervals {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the starting value");
		int n1 = scanner.nextInt();
		System.out.println("Enter the ending value");
		int n2 = scanner.nextInt();
		int temp = 0;
		int sum = 0;
		int rem = 0;
		for (int i = n1; i <= n2; i++) {
			temp = i;
			sum = 0;
			while (temp > 0) {
				rem = temp % 10;
				temp = temp / 10;
				sum += rem * rem * rem;
			}
			if (sum == i) {
				System.out.println(sum);
			}
		}
		scanner.close();
	}
}
