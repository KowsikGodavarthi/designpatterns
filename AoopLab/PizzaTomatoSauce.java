package AoopLab;
public class PizzaTomatoSauce extends AbstractPizza
{
	public PizzaTomatoSauce(ipizza sc)
	{
		super(sc);
	}
	
	public double getprice()
	{
		return this.specialpizza.getprice()+getPizzaTomatoSaucePrice();
	}
	
	private double getPizzaTomatoSaucePrice()
	{
		return 50*(1.18);
	}
}
