import java.util.Scanner;

public class LeapYearOrNot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year");
		int input = scanner.nextInt();
		if(input%4==0){
			System.out.println("Leap Year");
		}
		else{
			System.out.println("Not a leap year");
		}
		scanner.close();
		
	}
}
