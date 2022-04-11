package basic.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmbeddedDatabaseAdventures {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void check()
    {
        System.out.println(jdbcTemplate != null ?"got successfully " :"failed");


        String sql ="select * from users";
        BeanPropertyRowMapper<User>
                bpm =new BeanPropertyRowMapper<User>(User.class);
        try {
            List<User> l  = jdbcTemplate.query(sql,bpm);
            System.out.println(l);

        } catch (DataAccessException e) {
            // TODO Auto-generated catch block
            System.out.println("personid not found");
        }

    }








}
