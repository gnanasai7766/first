import java.util.Scanner;

public class UserMainCode {
	
	
	static int sumOfSquaresOfEvenDigits(int number) {
	
		
		int sum=0;
		while(number!=0) {
			int remainder=number%10;
			if(remainder%2==0) {
				sum=sum + ( remainder * remainder );
			}
			number = number / 10; 
		}
		System.out.println("The sum of squares of Entered number is: " +sum);
		return sum;
	}

}
 class Main {
	public static void main(String[] args) {
		
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
UserMainCode.sumOfSquaresOfEvenDigits(number);

		
	}
	

}
