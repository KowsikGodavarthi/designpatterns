package decorativePattern;

public class decoratorPattenDemo 
{

	public static void main(String[] args) 
	{
		Shape circle = new Circle();
		Shape rectangle = new Rectangle();
		Shape rcircle = new RedShapeDecorator(new Circle());
		Shape rrectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with regular border");
		circle.draw();
		System.out.println("Rectangle with normal border");
		rectangle.draw();
		System.out.println("Circle with red border");
		rcircle.draw();
		System.out.println("Rectangle with red border");
		rrectangle.draw();

	}

}
