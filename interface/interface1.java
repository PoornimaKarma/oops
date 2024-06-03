package interfacepkg;

 interface shape{
	double area();
    double perimeter();

}
class rectangle implements shape{
    
	    double width;
	    double height;
	   
	   public void rectangle(double width , double height)
	   {
		   this.height = height;
		   this.width = width;
	   }
	 @Override  
	public double area() {
		
		 return width * height;
	}
	@Override
	 public double perimeter() {
		
		 return 2 * (width + height);
	}
}
 class circle implements shape{

	private double radius;

    public void Circle(double radius) {
        this.radius = radius;
    }
	public double area() {
		
		 return Math.PI * radius * radius;
	}

	public double perimeter() {
		
		 return 2 * Math.PI * radius;
	}

}

public class interface1 {
		public static  void main(String args[])
		{
			rectangle r =new rectangle();
			
			System.out.println("rectangle area"+r.area());
			System.out.println("rectangle circle"+ r.perimeter());
			
			circle c = new circle();
			System.out.println("circle area"+ c.area());
			System.out.println("circle area"+ c.perimeter());
		}

	}
