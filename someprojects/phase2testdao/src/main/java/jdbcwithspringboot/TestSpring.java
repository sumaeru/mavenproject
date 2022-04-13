package jdbcwithspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class TestSpring  implements CommandLineRunner{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			SpringApplication.run(TestSpring.class, args);
		

	}
	
	@Autowired
	private X x;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//x.insertCommand();
		
				//x.updateCommand();
				
				//x.singleselect();
				
				x.multiSelect();
		
		
	}

}
