import java.util.Scanner;

public class MultiplicatonTable {
	public void Table(int n, int l) {
		int mul = 0;
		for (int i = 1; i <= l; i++) {
			mul = i * n;
			System.out.println(n + " * " + i + " = " + mul);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Enter the number to which the table is to be generated:");
		int number = scanner.nextInt();
		System.out.println("Enter the limit:");
		int limit = scanner.nextInt();
		MultiplicatonTable multiplicatonTable = new MultiplicatonTable();
		multiplicatonTable.Table(number, limit);
		scanner.close();
	}
}
