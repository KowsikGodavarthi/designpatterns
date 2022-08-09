package AoopLab;

public class PizzaTopins extends AbstractPizza
{
	public PizzaTopins(ipizza sc)
	{
		super(sc);
	}
	
	public double getprice()
	{
		return this.specialpizza.getprice()+getPizzaTopinsPrice();
	}
	
	private double getPizzaTopinsPrice()
	{
		return 50*(1.18);
	}

}
