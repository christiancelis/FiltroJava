package person.application;

import java.util.ArrayList;


import person.domain.Person;
import person.domain.ServicePerson;

public class UseCaseGetAllPerson {
    ServicePerson servicePerson;

    public UseCaseGetAllPerson(ServicePerson servicePerson) {
        this.servicePerson = servicePerson;
    }

    public ArrayList <Person> execute(){
        return servicePerson.getAllPerson();
    }

    
}
