package decorativePattern;

public class RedShapeDecorator extends ShapeDecorator
{
	public RedShapeDecorator(Shape colouredshape)
	{
		super(colouredshape);
	}
	public void draw() 
	{
		colouredshape.draw();
		Setredborder(colouredshape);
		
	}
	
	 private void Setredborder(Shape colouredshape){
	      System.out.println("Border Color: Red");
	   }
}
