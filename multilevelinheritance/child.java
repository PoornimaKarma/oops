package multilevelinheritance;

public class child extends father{
 
	static String name =" rohan";
	
	
	@Override
	void names() {
		System.out.println(name+","+surname);
		}
	
  public class main{
   public static void main(String args[]) {
	child c = new child();	
	c.names();
	father f =new father();
	f.names();
} }
}
