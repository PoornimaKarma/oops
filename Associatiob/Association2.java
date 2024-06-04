package association;

 class student {
	 private String name;
	 private int id;
	 
	 
	public student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	 
 }
class course{
	private String cname;
	private int cid;
	
	
	public course(String cname, int cid) {
		super();
		this.cname = cname;
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
}
class Association2 {
	private course course;
	private student  student;
	
	
	public Association2(course course, student student) {
		super();
		this.course = course;
		this.student = student;
	}
	course getCourse() {
		return course;
	}
	public void setCourse(course course) {
		this.course = course;
	}
	public student getStudent() {
		return student;
	}
	public void setStudent(student student) {
		this.student = student;
	}	

}
class main{
	public static void main(String args[])
	{
		student s = new student("poornima", 123);
		course c = new course("cs",21);
		Association2 ac = new Association2(c, s);
		System.out.println("student ="+ac.getStudent().getName());
		System.out.println("id="+ac.getStudent().getId());
		System.out.println("cource="+ac.getCourse().getCname());
		System.out.println("cid="+ac.getCourse().getCid());
	}
}
