package theory_jdbcadventures.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DAOPOC {
	
	@Autowired
	private JdbcTemplate t;
	
	public void dhc()
	{
		System.out.println(t != null);
		
	}

	public void add() {
		// TODO Auto-generated method stub
		String sql = "insert into  person(personid,pname,location) values (?,?,?) ";
		

		int x=3;
		String  y="abc";
		String z ="mys";
		
		Object[] params = {x, y,z};
		
		try {
			t.update(sql,params);
			System.out.println("successful adding");
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			System.out.println("personid is not unique");
		}

		
		
		
		
		
		
	}

	public void update() {
		// TODO Auto-generated method stub
		
	}

	public void singleSelect() {
		// TODO Auto-generated method stub
		
		
		
		String sql = "select person_id, pname,location from person where person_id=?";
		int x=3;
		Object[] params = {x};
		
		BeanPropertyRowMapper<Person> 
				bpm =new BeanPropertyRowMapper<Person>(Person.class);
		
		Person p;
		try {
			p = t.queryForObject(sql, params,bpm);
			System.out.println(p);
			
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
System.out.println("personid not found");
		}
		
		
		
		
		
	}

	public void multiSelect() {
		// TODO Auto-generated method stub
		String sql = "select person_id,pname,location from person where location=?";
		
		String x="mang";
Object[] params = {x};
		
		BeanPropertyRowMapper<Person> 
				bpm =new BeanPropertyRowMapper<Person>(Person.class);
		
	
		try {
			List<Person> l  = t.query(sql, params,bpm);
			System.out.println(l);
			
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
System.out.println("personid not found");
		}
		
		
		
	}
	
	

}
