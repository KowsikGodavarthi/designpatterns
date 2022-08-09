package facade;

public class ShapeMaker
{
	private IShape circle;
	private IShape rectangle;
	private IShape square;
	
	public ShapeMaker()
	{
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	
	public void drawcircle()
	{
		circle.draw();
	}
	
	public void drawrectangle()
	{
		rectangle.draw();
	}
	
	public void drawsquare()
	{
		square.draw();
	}

}
