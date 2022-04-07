package theory_jdbcadventures;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestJDBC {
	
	public static void main(String[] args) {

		
		Connection con =null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			String url ="jdbc:mariadb://localhost:3309/test";
			
			String userid ="root";
			
			String password="1234";
			
			 con = DriverManager.getConnection(url,userid,password);
			
			System.out.println("connection is working");
			
			
			String sql = "select personid,pname,location from person where location=?";
			
			
			PreparedStatement  stmt = con.prepareStatement(sql) ;
			
			String location="abc";
			
		
			stmt.setString(1, location);
			ResultSet ra =stmt.executeQuery();
			List<Person> pl =new ArrayList<Person>();
			//since i am using update
			if( ra.next())
			{
			
				do {
					Person p = new Person();
					p.setPerson_id(ra.getInt("personid"));
					p.setPname(ra.getString("pname"));
					p.setLocation(ra.getString("location"));
					pl.add(p);
				} while (ra.next());
				System.out.println(pl);
				
			}else
				System.out.println("no rows where found");
			
			
			
			
			
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}
	
	
	public static void main4(String[] args) {
		

		Connection con =null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			String url ="jdbc:mariadb://localhost:3309/test";
			
			String userid ="root";
			
			String password="1234";
			
			 con = DriverManager.getConnection(url,userid,password);
			
			System.out.println("connection is working");
			
			
			String sql = "select personid, pname,location from person where personid=?";
			
			
			PreparedStatement  stmt = con.prepareStatement(sql) ;
			
			int x=3;
			
		
			stmt.setInt(1, x);
			ResultSet ra =stmt.executeQuery();
			//since i am using update
			if( ra.next())
			{
			
				Person p =new Person();
				p.setPerson_id(ra.getInt("personid"));
				p.setPname(ra.getString("pname"));
				p.setLocation(ra.getString("location"));
				System.out.println(p);

				
			}else
				System.out.println("where condition failed");
			
			
			
			
			
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
	}
	
public static void main3(String[] args) {
		
		Connection con =null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			String url ="jdbc:mariadb://localhost:3309/test";
			
			String userid ="root";
			
			String password="1234";
			
			 con = DriverManager.getConnection(url,userid,password);
			
			System.out.println("connection is working");
			
			
			String sql = "update person set pname=? , location=? where personid=? ";
			
			
			PreparedStatement  stmt = con.prepareStatement(sql) ;
			
			int x=3;
			String  y="def";
			String z ="mang";
			
			stmt.setString(2, z);
			stmt.setInt(3, x);
			stmt.setString(1, y);
			int ra =stmt.executeUpdate();
			//since i am using update
			if( ra > 0)
						System.out.println("update success");
			else
				System.out.println("update failed because where condition failed");
			
			
			
			
			
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}



	
	public static void main2(String[] args) {
		
		Connection con =null;
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			String url ="jdbc:mariadb://localhost:3309/test";
			
			String userid ="root";
			
			String password="1234";
			
			 con = DriverManager.getConnection(url,userid,password);
			
			System.out.println("connection is working");
			
			
			String sql = "insert into  person(personid,pname,location) values (?,?,?) ";
			
			
			PreparedStatement  stmt = con.prepareStatement(sql) ;
			
			int x=3;
			String  y="abc";
			String z ="mys";
			
			stmt.setString(3, z);
			stmt.setInt(1, x);
			stmt.setString(2, y);
			int ra =stmt.executeUpdate();
			//since i am using insert
			
			System.out.println("insert success");
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			String url ="jdbc:mariadb://localhost:3309/test";
			
			String userid ="root";
			
			String password="1234";
			
			Connection con = DriverManager.getConnection(url,userid,password);
			
			System.out.println("connection is working");
			
		} catch (ClassNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	
	

}
