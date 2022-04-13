package basic.jdbc;

import basic.spring.Country;
import org.apache.derby.jdbc.ClientDriver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCAdventurees {

    public static void main(String[] args) {





/*


        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
            String url="jdbc:derby://localhost:1527/myDB";
            String userid="me";
            String password="mine";
            Connection connection = DriverManager.getConnection(url,userid,password);
            System.out.println("connection got");




        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException | SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
*/







        try {
            Class.forName("org.h2.Driver");
            String url ="jdbc:h2:mem:hidb";
            String username="sa";
            String password="";

            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("connection got");

            String sql ="create table country(pincode integer primary key,area varchar(15), city varchar(15))";
            PreparedStatement  stmt = con.prepareStatement(sql);
            stmt.execute();
            sql = "insert into country values (15,'X','A')";
            stmt = con.prepareStatement(sql);
            stmt.execute();
            sql = "insert into country values (16,'Y','B')";
            stmt = con.prepareStatement(sql);
            stmt.execute();
            sql = "insert into country values (17,'Z','B')";
            stmt = con.prepareStatement(sql);
            stmt.execute();

            //update scenario

            sql = "update country set area=? , city=? where pincode =?";

            String area="abc";
            String city ="def";
            int pin = 15;
            stmt = con.prepareStatement(sql);
            stmt.setString(1,area);
            stmt.setString(2,city);
            stmt.setInt(3,pin);
            int ra = stmt.executeUpdate();
            if(ra > 0)
                System.out.println("updated ");
            else
                System.out.println("no pin found");

                 stmt.close();

            //select all
            sql = "select pincode,area,city from country";
            stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            List<Country> listofAreas = new ArrayList<>();
            Country country = null;
            while(rs.next())
            {
                pin = rs.getInt("pincode");
                area = rs.getString("area");
                city = rs.getString("city");
                country =new Country(pin,area,city);
                listofAreas.add(country);
                System.out.println(pin  + "  " + area  + "" + city);



            }
            rs.close();
            stmt.close();


            //single select
            sql = "select pincode,area,city from country where pincode =?";
            pin =15;
            stmt = con.prepareStatement(sql);
            stmt.setInt(1,pin);
             rs = stmt.executeQuery();
            if(rs.next())
            {
                pin = rs.getInt("pincode");
                area = rs.getString("area");
                city = rs.getString("city");
                System.out.println("Found " + pin  + "  " + area  + "" + city);



            }
            else
                System.out.println("not found");
            rs.close();



            stmt.close();



            con.close();





            System.out.println("working properly");











            con.close();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
