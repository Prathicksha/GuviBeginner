import java.util.Scanner;

public class LargestOfThree {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int input1 = scanner.nextInt();
		System.out.println("Enter the second number");
		int input2 = scanner.nextInt();
		System.out.println("Enter the third number");
		int input3 = scanner.nextInt();
		if(input1>input2&&input1>input3){
			System.out.println(input1+" is largest of three numbers");
		}
		else if(input2>input3){
			System.out.println(input2+" is largest of three numbers");
		}
		else{
			System.out.println(input3+" is largest of three numbers");
		}
		scanner.close();
	}
}
