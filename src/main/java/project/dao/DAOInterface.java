package project.dao;

import project.model.Model;

public interface DAOInterface {
    void storeInDB(Model model);

    Model getResourceFromDB();
}
