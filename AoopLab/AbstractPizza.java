package AoopLab;

public abstract class AbstractPizza implements ipizza
{
	public ipizza specialpizza;
	
	public AbstractPizza(ipizza sc)
	{
		this.specialpizza=sc;
	}

}
