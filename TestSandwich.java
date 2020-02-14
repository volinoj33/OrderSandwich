//James Volino
//TestSandwich.java
//Date: 2/14/2020

import java.util.Scanner;

public class TestSandwich
{
	public static void main(String[] args)
	{
		// Variables and Constants
		String custIngredients;
		String custBread;
	//Objects(Scanner and Pizza)
		Scanner input = new Scanner(System.in);
		Sandwich mySandwich = new Sandwich(); //PIZZA
		
	// Input Phase
		System.out.print("Hello, What kind of sandwich would you like >> ");
		custIngredients = input.nextLine();
		
		System.out.print("What kind of bread would you like >> ");
		custBread = input.nextLine();
	
	//Calculation phase
		mySandwich.enterIngredient(custIngredients);
		mySandwich.typeOfBread(custBread);
		mySandwich.finalPrice(12.99);
		
	//Output
		System.out.println("You have ordered a " + custIngredients + " with " + custBread + " bread sandwich. Your total is $12.99. Thank You");
	}
}