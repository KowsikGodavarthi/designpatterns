package AoopLab;

public class PizzaChilliSauce extends AbstractPizza 
{
	public PizzaChilliSauce(ipizza sc)
	{
		super(sc);
	}
	
	public double getprice()
	{
		return this.specialpizza.getprice()+getPizzaChilliSaucePrice();
	}
	
	private double getPizzaChilliSaucePrice()
	{
		return 50*(1.18);
	}

}
