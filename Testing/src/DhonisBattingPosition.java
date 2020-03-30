import java.util.Scanner;
public class DhonisBattingPosition {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
		  System.out.println("The number of the over when the last wicket fell:");
		  int number_of_the_over=sc.nextInt();
		  
		  System.out.println("The ball in over when the wicket fell:");
		  int ball_in_the_over=sc.nextInt();
		  
		  System.out.println("Total overs in the innings:");
		  int total_overs=sc.nextInt();
		  
		  float result=((number_of_the_over*6)+ball_in_the_over)*100f;
		  float result2= (result/(total_overs*6))/100f;
		  
		 System.out.println(result2);
		  if(result2>=0.75) {
			  System.out.println("YES");
		  }else {
			  System.out.println("NO");
		  }
		}
		

	}


