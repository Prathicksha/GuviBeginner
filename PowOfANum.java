import java.util.Scanner;

public class PowOfANum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		System.out.println("Enter the power");
		int power = scanner.nextInt();
		if(power==0){
			System.out.println("The power of the number is 1");
		}
		else{
			System.out.println("The power of the number is "+(int)Math.pow(number, power));
		}
		
		scanner.close();
		
	}
}
