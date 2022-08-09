package facade1;

public class Shopkeeper 
{
	private Mobileshop iphone;
	private Mobileshop samsung;
	private Mobileshop blackberry;
	
	public Shopkeeper()
	{
		iphone = new Iphone();
		samsung = new Samsung();
		blackberry=new Blackberry();
	}
	
	public void IphoneSale()
	{
		iphone.Price();
		iphone.Modelno();
	}
	
	public void SamsungSale()
	{
		samsung.Price();
		samsung.Modelno();
	}
	
	public void BlackberrySale()
	{
		blackberry.Price();
		blackberry.Modelno();
	}
}
