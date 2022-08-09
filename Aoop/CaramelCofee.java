package Aoop;

public class CaramelCofee extends Abstractcofee
{
	public CaramelCofee(icofee sc)
	{
		super(sc);
	}
	
	public double getPrice()
	{
		return this.specialcofee.getPrice()+getCaramelCofeePrice();
	}
	
	private double getCaramelCofeePrice()
	{
		return 20*(1.18);
	}

}
