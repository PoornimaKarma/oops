package encapsulation;

public class text 
{
	public static void main(String args[])
	{
		employee em = new employee();
		em.setName1("punam");
		em.setSalary(10000);
		System.out.println(em.getName1());
		System.out.println(em.getSalary());
	}

}
