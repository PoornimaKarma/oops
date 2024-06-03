package polymorphim;

 class eleven
{
	public void maths()
	{
		System.out.println("11th maths class");
	}
}
 class twelve extends eleven
{
	
	public void maths()
	{
		System.out.println("12th math class");
	}
}
public class override {

	public static void main(String[] args) {
		twelve t = new twelve();
		t.maths();

	}

}
