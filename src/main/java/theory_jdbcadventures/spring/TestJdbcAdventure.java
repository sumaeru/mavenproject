package theory_jdbcadventures.spring;

import java.sql.Driver;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@ComponentScan("jdbcadventures.spring")
public class TestJdbcAdventure {
	
	
	
	@Bean
	public JdbcTemplate f1()
	{
		
		
		Driver d =new org.mariadb.jdbc.Driver();
		
		
		String url ="jdbc:mariadb://localhost:3309/test";
		
		String userid ="root";
		
		String password="1234";
		
		SimpleDriverDataSource sd =
				new SimpleDriverDataSource(d, url, userid, password);
		
		JdbcTemplate t =new JdbcTemplate(sd);
		return t;
		
		
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 AnnotationConfigApplicationContext ac
		=new AnnotationConfigApplicationContext(TestJdbcAdventure.class);
		DAOPOC temp=ac.getBean(DAOPOC.class);
		//temp.dhc();
		//temp.add();
		//temp.update();
		//temp.singleSelect();
		temp.multiSelect();
		
		
		

	}

}
