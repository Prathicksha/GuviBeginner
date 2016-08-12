import java.util.Scanner;

public class OddNumInIntervals {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the starting value");
		int from = scanner.nextInt();
		System.out.println("Enter the ending value");
		int to = scanner.nextInt();
		System.out.println("The odd numbers betwen the two values are:");
		for(int i=from;i<=to;i++){
			if(i%2==1){
				System.out.println(i);
			}
		}
		scanner.close();
	}
}
