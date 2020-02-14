//James Volino
//SANDWICH.JAVA
//DATE: 2/14/20

public class Sandwich{
	
	//Instance Variables
	private String mainIngredient;
	private String breadType;
	private double finalPrice;
	
	//Default constructor for this class
	public Sandwich()
	{
		mainIngredient = "Tuna"; //orderName
		breadType = "Wheat"; //toppings
		finalPrice = 12.99;
	}
	//Mutator method for the orderName
	public void enterIngredient(String ingredient)
	{
		mainIngredient = ingredient;
	}
	
	//Mutator method for toppings
	public void typeOfBread(String bread)
	{
		breadType = bread;
	}
	
	//Calculate the order price
	public void finalPrice(double amount)
	{
		finalPrice = 12.99;
	}
	
	//Accessor method that summarizes the pizza data
	public void summary()
	{
		System.out.println("Thank You!" );
		System.out.println("A sandwich with " + mainIngredient + " on " + breadType + " bread will cost $ " + finalPrice);
	}
}