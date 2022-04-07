package theory_jdbcadventures.spring;

public class Person {
	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	private int person_id;
	private String pname,location;
	
		public Person() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", pname=" + pname + ", location=" + location + "]";
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Person(int person_id, String pname, String location) {
		this.person_id = person_id;
		this.pname = pname;
		this.location = location;
	}
}
