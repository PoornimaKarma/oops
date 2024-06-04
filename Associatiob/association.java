package association;

import java.util.ArrayList;
import java.util.List;

class mobile{
	 private int mobileno;

	public int getMobileno() {
		return mobileno;
	}

	public void setMobileno(int mobileno) {
		this.mobileno = mobileno;
	}

	@Override
	public String toString() {
		return "mobile [mobileno=" + mobileno + "]";
	}
	 
 }
 class employee{
	 private String name;
	 List<mobile> mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<mobile> getMobile() {
		return mobile;
	}
	public void setMobile(List<mobile> mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", mobile=" + mobile + "]";
	}
	 
 }
public class association {
  public static void main(String args[])
  {
	  employee e = new employee();
	  e.setName("punam");
	  mobile m = new mobile();
	  m.setMobileno(677689098);
	  mobile m1 = new mobile();
	  m1.setMobileno(78666665);
	  List<mobile> number = new ArrayList<mobile>();
	  number.add(m1);
	  number.add(m);
	  e.setMobile(number);
	  System.out.println(e.getName()+""+e.getMobile()  );
  }
}
