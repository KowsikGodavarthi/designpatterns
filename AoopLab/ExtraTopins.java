package AoopLab;

public class ExtraTopins extends AbstractPizza
{
	public ExtraTopins(ipizza sc)
	{
		super(sc);
	}
	
	public double getprice()
	{
		return this.specialpizza.getprice()+getTopinsPrice();
	}
	
	private double getTopinsPrice()
	{
		return 50*(1.18);
	}

}
