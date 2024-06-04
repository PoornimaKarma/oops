package association;
class address {
	private String Aname;
	private int pin;
	
	public address(String aname, int pin) {
		super();
		Aname = aname;
		this.pin = pin;
	}
	public String getAname() {
		return Aname;
	}
	public void setAname(String aname) {
		Aname = aname;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}	
} 
class employee1{
	private String ename;
	private address address;
	
	
	public employee1(String ename, address address) {
		super();
		this.ename = ename;
		this.address = address;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public address getAddress() {
		return address;
	}
	public void setAddress(address address) {
		this.address = address;
	}	
}
public class Aggregration {
	public static void main(String args[])
	{
		address a = new address("sanawad",451111 );
		employee1 e = new employee1("poornima", a);
		System.out.println("employee="+e.getEname());
		System.out.println("address="+e.getAddress().getAname());
		System.out.println("pin="+e.getAddress().getPin());
	}

}
