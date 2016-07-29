import java.util.Scanner;

public class SumOfN {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = scanner.nextInt();
		for(int i=0;i<=n;i++){
			sum += i;
		}
		System.out.println(sum);
		scanner.close();
	}
}
