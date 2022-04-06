package project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import project.controller.Presentation;
import project.notours.DBConnection;

@ComponentScan("project")
public class StartTheApp {

    @Bean
    public DBConnection getDBConnection()
    {
        DBConnection dbConnection =new DBConnection();
        return dbConnection;
    }


    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StartTheApp.class)
                ;
        Presentation presentation=applicationContext.getBean(Presentation.class);

        Presentation presentation12 = applicationContext.getBean(Presentation.class);

        System.out.println(presentation12 == presentation ? " same  " : "not same");

    }

    public static void main1(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StartTheApp.class)
;
        Presentation presentation=applicationContext.getBean(Presentation.class);



        presentation.scenario1();
        presentation.scenario2();


    }

}
