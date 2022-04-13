package basic.spring;

import basic.jdbc.JDBCAdventurees;
import org.apache.derby.jdbc.ClientDriver;
import org.h2.Driver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:jdbc.properties")
@ComponentScan("basic.spring")
public class SpringJDBC {


        @Value("${driverClassName}")
        private String driverClassName;



        @Value("${url}")
        private String url;
        @Value("${username}")
        private String username;
        @Value("${password}")
        private String password;


        @Bean
    public JdbcTemplate getJDBCTemplateEmbedded()
    {
        EmbeddedDatabaseBuilder dbBuilder = new EmbeddedDatabaseBuilder();
        DataSource dataSource =  dbBuilder.setType(EmbeddedDatabaseType.H2)
                .addScripts("classpath:schema.sql", "classpath:test-data.sql").build();
        //database url created jdbc:h2:mem:testdb
        JdbcTemplate jdbcTemplate =new JdbcTemplate(dataSource);
        return jdbcTemplate;

    }

    public static void main(String[] args) {

        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringJDBC.class);
        EmbeddedDatabaseAdventures embeddedDatabaseAdventures = ac.getBean(EmbeddedDatabaseAdventures.class);
        embeddedDatabaseAdventures.check();




    }







    //@Bean
    public JdbcTemplate getJDBCTemplateWithDerby()
    {
        ClientDriver clientDriver =new ClientDriver();
        String url="jdbc:derby://localhost:1527/myDB";
        String userid="me";
        String password="mine";
        SimpleDriverDataSource simpleDriverDataSource =new SimpleDriverDataSource(clientDriver,url,userid,password);
        JdbcTemplate jdbcTemplate =new JdbcTemplate(simpleDriverDataSource);
        System.out.println("Database name is"  + this.url);
        return jdbcTemplate;


    }



    public JdbcTemplate getJDBCTemplateWithH2()
    {
        Driver d = new Driver();
        String url ="jdbc:h2:mem:pocdb";
        String username="sa";
        String password="";
        SimpleDriverDataSource simpleDriverDataSource =new SimpleDriverDataSource(d,url,username,password);
        JdbcTemplate jdbcTemplate =new JdbcTemplate(simpleDriverDataSource);
        System.out.println("Database name is"  + this.url);
        return jdbcTemplate;


    }


    public static void main1(String[] args) {


        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringJDBC.class);
        SpringJDBCPOC springJDBCPOC = ac.getBean(SpringJDBCPOC.class);
        springJDBCPOC.check();
        springJDBCPOC.add();
        springJDBCPOC.viewAll();
        springJDBCPOC.update();

        springJDBCPOC.viewParticular();





    }



}
