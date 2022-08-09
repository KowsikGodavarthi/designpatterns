package AoopLab;
import java.util.*;
public class Dominos 
{
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int choice=0;
		boolean repeat= true;
		//double totalCost = 0;
		ipizza i = new SimplePizza();
		while(repeat)
			{
			choice = menu();
				switch (choice)
				{
				
				case 1: i= new PizzaChilliSauce(i); break;
				case 2: i=new PizzaTomatoSauce(i); break;
				case 3: i=new PizzaTopins(i); break;
				case 4: i=new ExtraTopins(i); break;
				default : System.out.println("Thanks for visiting");repeat=false;
				System.out.printf("total amount = %.2f%n",i.getprice());
				break;
				}
			}

	}
	private static int menu()
	{
		System.out.println("1. Chilli sauce");
		System.out.println("2. tomato sauce");
		System.out.println("3. toppins");
		System.out.println("4. Extra toppins");
		System.out.println("Any other key to finalize the order");
		return sc.nextInt();
	}

}
