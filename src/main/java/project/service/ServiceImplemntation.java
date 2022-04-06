package project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import project.dao.DAOInterface;
import project.dao.JDBCDAOImplementation;
import project.model.Model;

@Component
public class ServiceImplemntation implements ServiceInterface {

    @Autowired
    private DAOInterface daoInterface;


    @Override
    public void addResource(Model model) {

        daoInterface.storeInDB(model);

    }

    @Override
    public Model viewResource() {
        return daoInterface.getResourceFromDB();
    }
}
