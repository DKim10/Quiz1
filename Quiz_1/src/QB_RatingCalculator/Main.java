package QB_RatingCalculator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//Given the inputs, it calculates the player's passer rating
		// Parameters: None
		//Returns: None
		
		//user_input- Scanner that gets imput form user
		Scanner user_input = new Scanner(System.in);
		
		//Prompts user for football player's passing attempts
		//Takes it in as a double
		System.out.println("What is the number of passing attempts?");
		double ATT = user_input.nextDouble();
		
		//Prompts user for football player's number of completions
		//Takes it in as a double 
		System.out.println("What is the number of completions?");
		double COMP = user_input.nextDouble();
		
		//Prompts user for football player's number of passing yards 
		//Takes it in as a double 
		System.out.println("What is the number of passing yards?");
		double YDS = user_input.nextDouble();
		
		//Prompts user for football player's number of touchdown passes 
		//Takes it in as a double
		System.out.println("What is the number of touchdown passes?");
		double TD = user_input.nextDouble();
		 
		//Prompts user for football player's number of interceptions  
		//Takes it in as a double
		System.out.println("What is the number of interceptions?");
		double INT = user_input.nextDouble();
		
		user_input.close();
		
		//Calculation of part a formula, using variables: number of completions and attempted passes
		//Stored as double
		double part_a = ((COMP/ATT)-.3)*5;
		
		//Checks calculation of part a formula, if solution is negative number part_a = 0.0
		//If solution is greater than 2.375 than it caps it so part_a = 2.375
		if (part_a < 0.0) {
			part_a = 0.0;
		} else if (part_a > 2.375) {
			part_a = 2.375;
		} 
		
		//Calculation of part b formula, using variables: number of passing yards 
		//and attempted passes
		//Stored as double
		double part_b = ((YDS/ATT)-3)*.25;
		
		//Checks calculation of part b formula, if solution is negative number part_b = 0.0
		//If solution is greater than 2.375 than it caps it so part_b = 2.375
		if (part_b < 0.0) {
			part_b = 0.0;
		} else if (part_b > 2.375) {
			part_b = 2.375;
		} 
		

		//Calculation of part c formula, using variables: number of touchdown passes
		//and attempted passes
		//Stored as double
		double part_c = (TD/ATT)*20;
		
		//Checks calculation of part c formula, if solution is negative number part_c = 0.0
		//If solution is greater than 2.375 than it caps it so part_c = 2.375
		if (part_c < 0.0) {
			part_c = 0.0;
		} else if (part_c > 2.375) {
			part_c = 2.375;
		} 
		
		//Calculation of part d formula, using variables: number of interceptions
		//and attempted passes
		//Stored as double
		double part_d = 2.375-((INT/ATT)*25);
		
		//Checks calculation of part d formula, if solution is negative number part_d = 0.0
		//If solution is greater than 2.375 than it caps it so part_d = 2.375
		if (part_d < 0.0) {
			part_d = 0.0;
		} else if (part_d > 2.375) {
			part_d = 2.375;
		} 
		
		//Takes all values of calculations from part a-d and uses it in formula
		//to calculate passer rating
		//Stores as double
		double passer_rating = ((part_a + part_b + part_c + part_d)/6)*100;
		
		//Prints football player's passer rating as a double
		System.out.printf("The player's passer rating is %.1f.\n ", passer_rating);
	}

}
