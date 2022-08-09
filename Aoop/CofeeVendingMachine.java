package Aoop;
import java.util.*;
public class CofeeVendingMachine 
{
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int choice=0;
		boolean repeat= true;
		//double totalCost = 0;
		icofee i = new Simple_cofee();
		while(repeat)
			{
			choice = menu();
				switch (choice)
				{
				
				case 1: i= new CaramelCofee(i); break;
				case 2: i=new ChocolateCofee(i); break;
				default : System.out.println("Thanks for visiting");repeat=false;
				System.out.printf("total amount = %.2f%n",i.getPrice());
				break;
				}
			}

	}
	private static int menu()
	{
		System.out.println("1. Caramel short");
		System.out.println("2. Chocolate short");
		System.out.println("Any other number to complete the order");
		return sc.nextInt();
	}

}
