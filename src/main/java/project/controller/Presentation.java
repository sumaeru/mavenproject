package project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import project.model.Model;
import project.service.ServiceImplemntation;
import project.service.ServiceInterface;

@Component
@Scope("prototype")
public class Presentation {

    public Presentation()
    {
        System.out.println("presentation object created");
    }

    @Autowired
    private ServiceInterface serviceInterface;


    public void scenario1() {

        Model model =new Model();
        serviceInterface.addResource(model);
        System.out.println("Based on return type of service ui updates  --scenario 1");

    }

    public void scenario2() {

        Model model = serviceInterface.viewResource();
        System.out.println("Based on return type of service ui updates  --scenario 2");


    }
}
