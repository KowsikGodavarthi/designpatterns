package Aoop;

public class ChocolateCofee extends Abstractcofee
{
	public ChocolateCofee(icofee sc) 
	{
		super(sc);
	}
	
	public double getPrice()
	{
		return this.specialcofee.getPrice()+getChocolateCofeePrice();
	}
	
	private double getChocolateCofeePrice()
	{
		return 30*(1.15);
	}
}
