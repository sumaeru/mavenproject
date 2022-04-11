package basic.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;


public class SpringJDBCPOC {

    @Autowired
    private JdbcTemplate jdbcTemplate;



    public void check() {

        String message = jdbcTemplate != null ?  " got object " : "did not get object";
        System.out.println(message);






    }

    public void add() {

        //String sql ="create table country1(pincode integer primary key,area varchar(15), city varchar(15))";
        //jdbcTemplate.update(sql);
        Country country =new Country();
        String sql ="insert into country1(pincode, area, city) values  (?,?,?)";
        Object[] params= {23,"afdo","cfdo"};
        int ra= jdbcTemplate.update(sql,params);
        if(ra > 0)
            System.out.println("insert working");
        else
            System.out.println("insert failed");



    }

    public void viewAll() {

        String sql ="select pincode, area,city from country1";
        BeanPropertyRowMapper<Country>
                bpm =new BeanPropertyRowMapper<Country>(Country.class);
        try {
            List<Country> l  = jdbcTemplate.query(sql,bpm);
            System.out.println(l);

        } catch (DataAccessException e) {
            // TODO Auto-generated catch block
            System.out.println("personid not found");
        }

    }

    public void viewParticular() {

        String sql = "select pincode, area,city from country where pincode=?";
        int x=3;
        Object[] params = {x};

        BeanPropertyRowMapper<Country>
                bpm =new BeanPropertyRowMapper<Country>(Country.class);

        Country p;
        try {
            p = jdbcTemplate.queryForObject(sql, params,bpm);
            System.out.println(p);

        } catch (DataAccessException e) {
            // TODO Auto-generated catch block
            System.out.println("pincode not found");
        }


    }
}
