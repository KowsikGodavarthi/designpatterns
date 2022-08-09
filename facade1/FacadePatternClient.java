package facade1;

import java.util.Scanner;

public class FacadePatternClient 
{

	public static void main(String[] args) 
	{
		Shopkeeper s = new Shopkeeper();
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{
			System.out.println("Select mobile");
			System.out.println("1. Iphone");
			System.out.println("2. Blackberry");
			System.out.println("3. Samsung");
			System.out.println("4. end the shopping");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				s.IphoneSale();break;
			case 2:
				s.BlackberrySale();break;
			case 3:
				s.SamsungSale();break;
			case 4: 
				System.out.println("Thank you!!! Visit Again");break;
			default :break;
			}
		}while(choice!=4);
		
		sc.close();
	}

}
