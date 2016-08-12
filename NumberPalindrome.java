import java.util.Scanner;

public class NumberPalindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is a palindrome or not");
		int number = scanner.nextInt();
		int rem = 0;
		int sum = 0;
		int number1 = number;
		while(number1!=0){
			rem = number1%10;
			number1 = number1/10;
			sum = (sum*10)+rem;
		}
		if(number==sum){
			System.out.println("the given number ia a palindrome");
		}
		else{
			System.out.println("The given number is not a palindrome");
		}
		scanner.close();
	
	}
}
