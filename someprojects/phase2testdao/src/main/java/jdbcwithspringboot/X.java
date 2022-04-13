package jdbcwithspringboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class X {
	
	
	private JdbcTemplate jt;
	
	@Autowired
	public void setnobodycares(JdbcTemplate x)
	{
		System.out.println("is wiring happending");
		jt = x;
		
	}

	public void insertCommand() {
		// Assume Resource object is got from service layer..
		Resource r =new Resource(24,"b",false);
		String tqlcmd =
				"insert into resource(resourceId,resourceName,avaialability) values "
				+ " (? ,?, ?)";
		Object params[]= {r.getResourceId(),r.getResourceName(),r.isAvaialability()}; //new to you.. 
		try {
			jt.update(tqlcmd,params);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			System.out.println("entertianment with insert  becuase of constraint violation." );
			e.printStackTrace();
		}
		
		
		/*
		 * String msg = jt != null ? " jdbc template is not null": "it is null";
		 * System.out.println(msg);
		 */
		
	}

	public void updateCommand() {
		// we want to update the resoruce name and availablitly..
		String sql=
				"update resource set resourceName=?,avaialability=? where resourceId=?";
		//in real life hw will you get input for update.  it will be a object of REsource.
		
		Resource x = new Resource(23,"Xyz",true);
		//this object will come from servcie layer you have to assume.
		
		Object[] fillupQuestionMark = {x.getResourceName(),x.isAvaialability(),x.getResourceId()};
		
		int ra = jt.update(sql,fillupQuestionMark);
		
		if(ra >0)
			System.out.println("update suceeded");
		else
			System.out.println("update failed");
		
		
		
		
		
		
		
		
	}

	public void singleselect() {
		// 
		int x =1;
		String sql="select resourceId,resourceName,avaialability from resource where resourceId=?";
		Object[] params= {x};
		try {
			
			BeanPropertyRowMapper<Resource> br =new BeanPropertyRowMapper<Resource>(Resource.class);
			
			Resource r = jt.queryForObject(sql,params,br);
			System.out.println(r.getResourceName());
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			System.out.println(" resourceId not found");
			e.printStackTrace();
		
		}
		
			
	}

	public void multiSelect() {
		// TODO Auto-generated method stub
		System.out.println("hey are inside the function");
		
		String sql =
				" select resourceId,resourceName,avaialability from resource where avaialability=?";
		boolean res = false;
		Object[] params= { res };
		BeanPropertyRowMapper<Resource> br =new BeanPropertyRowMapper<Resource>(Resource.class);
		try {
			List<Resource> l = jt.query(sql,br,params);
			System.out.println(l.size());
			for(Resource x:l)
			{
				System.out.println(x.getResourceId());
			}
			if(l.size() ==0)
			{
				System.out.println("no resource with that status");
			}
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			System.out.println("no resource with that status");
			//e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	

}
