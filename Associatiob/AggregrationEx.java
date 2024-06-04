package association;
class author{
	private String addres;
	private String name;
	private int age;
	
	public author(String addres, String name, int age) {
		super();
		this.addres = addres;
		this.name = name;
		this.age = age;
	}
	public String getAddres() {
		return addres;
	}
	public void setAddres(String addres) {
		this.addres = addres;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
class book{
	private String bname;
	private int price;
	private author author;
	
	
	public book(String bname, int price, author author) {
		super();
		this.bname = bname;
		this.price = price;
		this.author = author;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public author getAuthor() {
		return author;
	}
	public void setAuthor(author author) {
		this.author = author;
	}
	
}
public class AggregrationEx { 
	public static void main(String args[])
	{
		author a = new author("indore", " me", 24);
		book b = new book("meri book meri marji", 100, a);
		System.out.println("addres="+b.getAuthor().getAddres()+" name="+b.getAuthor().getName()+" age="+b.getAuthor().getAge());
		System.out.println("bname="+b.getBname());
	}

}
