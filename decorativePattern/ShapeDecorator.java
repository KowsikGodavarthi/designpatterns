package decorativePattern;

public abstract class ShapeDecorator implements Shape
{
	public Shape colouredshape;
	
	public ShapeDecorator(Shape sc)
	{
		this.colouredshape=sc;
	}

}
