import cs1.Keyboard;
import java.util.Scanner;

//You are traveling to King's Island for the day.
//Everyone in the group has agreed to split the cost evenly.
//Write a program to determine the total cost of the trip and the cost per person.
//Assume that each ticket is $32.99


public class KingsIsland
{
	public static void main(String[] args)
	{
		//Declare variables for the number of people, parking cost, food cost, total cost, cost per person
		int people;
		double parkingcost, foodcost, totalcost, costperperson, parkticket;


		//Prompt for and read in the number of people in the group
		System.out.println("How many people are in your group? ");
		people = Keyboard.readInt();
		parkticket = people * 32.99;


		//Prompt for and read in the cost of parking
		System.out.println("What is the cost of parking? ");
		parkingcost = Keyboard.readDouble();


		//Prompt for and read in the amount spent on food
		System.out.println("What is the amount you spent on food? ");
		foodcost = Keyboard.readDouble();


		//Calculate the total expenses
		totalcost = parkingcost + foodcost + parkticket;


		//Calculate the average per person
		costperperson = totalcost/people;



		//Display results
		System.out.println("KingsIsland Cost Report");
		System.out.println("Total Cost = " + totalcost);
		System.out.println("Cost Per Person = " + costperperson);



	}
}