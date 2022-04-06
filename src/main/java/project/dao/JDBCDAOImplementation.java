package project.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import project.model.Model;
import project.notours.DBConnection;

@Component
public class JDBCDAOImplementation implements DAOInterface {


    @Autowired
    private DBConnection dbConnection;




    @Override
    public void storeInDB(Model model) {

        System.out.println("storing in DB by using jdbc");

    }

    @Override
    public Model getResourceFromDB() {
        System.out.println("doing retrievel using jdbc");
        return new Model();
    }
}
