import java.util.Scanner;

public class AmstrongNumber {
	public String Amstrong(int n){
		int temp=n;
		int sum=0;
		int rem=0;
		while(temp>0){
			rem=temp%10;
			temp=temp/10;
			sum+=rem*rem*rem;
		}
		if(sum==n){
		return "Amstrong number";
		}
		else{
			return "Not an Amstrong number";
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enetr the number to check whether it is an amstrong number:");
		int number=scanner.nextInt();
		AmstrongNumber amstrongNumber=new AmstrongNumber();
		System.out.println(amstrongNumber.Amstrong(number));
		scanner.close();
	}
}
