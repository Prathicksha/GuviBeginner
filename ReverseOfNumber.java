import java.util.Scanner;

public class ReverseOfNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number for which the reverse is to be found");
		int number = scanner.nextInt();
		int rem = 0;
		int reverse = 0;
		while(number!=0){
			rem = number%10;
			number = number/10;
			reverse = (reverse*10)+rem;
		}
		System.out.println("The reverse of the number is "+reverse);
		scanner.close();
	}
}
