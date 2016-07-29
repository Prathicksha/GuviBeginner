import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the upper limit for which the sum is to be generated");
		int input = scanner.nextInt();
		for(int i=0;i<=input;i++){
			sum += i;
		}
		System.out.println(sum);
		scanner.close();
	}
}
