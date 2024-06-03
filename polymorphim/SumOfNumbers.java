package polymorphim;

public class SumOfNumbers {	
 
	public int add(int a,int b)
   {
	   return a+b;
   }
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public String add(String p,String q,String r)
	{
		return p+q+r;
	}
	public String concatinate(String m,String n)
	{
		return m+n;
	}
    public static void main(String args[])
    {
    	SumOfNumbers sum = new SumOfNumbers();
    	System.out.println(sum.add(5, 9));
    	System.out.println(sum.add(4, 7, 9));
    	System.out.println(sum.add("i ", "am ", "poornima"));
    	System.out.println(sum.concatinate("hello ","hy"));
    
       }
}
 
