import java.util.Scanner;

public class AlphabetOrNot {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character to check whether it is an alphabet or not");
		char input = scanner.next().charAt(0); 
		int inp = (int)input;
		if((inp>=65&&inp<=90)||(inp>=97&&inp<=122)){
			System.out.println("The character is an alphabet");
		}
		else{
			System.out.println("The character is not an alphabet");
		}
		scanner.close();
	}
}
