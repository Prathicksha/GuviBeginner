import java.util.Scanner;

public class CountOfDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to find its digits");
		int n = scanner.nextInt();
		int length = (int)Math.log10(n)+1;
		System.out.println("The number of digits in "+n+" is "+length);
		scanner.close();
	}
}
