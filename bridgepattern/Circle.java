package bridgepattern;

public class Circle extends Shape
{
	private int x, y, radius;

	   public Circle(int x, int y, int radius, DrawAPI drawapi) {
	      super(drawapi);
	      this.x = x;  
	      this.y = y;  
	      this.radius = radius;
	   }

	   public void draw() 
	   {
	      drawapi.drawCircle(radius,x,y);
	   }

}
