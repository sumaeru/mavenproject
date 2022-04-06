package x.controller;

import x.service.ServiceInterface;

public class Presentation {

    private ServiceInterface serviceInterface;  //association

    public Presentation(ServiceInterface serviceInterface)
    {
        this.serviceInterface = serviceInterface;
    }


}
