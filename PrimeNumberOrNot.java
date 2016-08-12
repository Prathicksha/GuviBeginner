import java.util.Scanner;

public class PrimeNumberOrNot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		int count = 0;
		if(number==0||number==1){
			System.out.println("The number is neither prime nor composite");
		}
		else if(number==2){
			System.out.println(number+" is a prime number");
		}
		else if(number>2){
		for(int i=2;i<number;i++){
			if(number%i==0){
				count = 0;
				break;
			}
			else{
				count++;
			}
		
		}
		if(count==0){
			System.out.println(number+" is not a prime number");
		}
		else{
			System.out.println(number+" is a prime number");
		}
		}
		scanner.close();
	}
}
