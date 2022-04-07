package theory_jdbcadventures;

public class Person {
	
	private int person_id;
	private String pname,location;
	
	
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(int person_id, String pname, String location) {
		
		this.person_id = person_id;
		this.pname = pname;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", pname=" + pname + ", location=" + location + "]";
	}
	
	

}
