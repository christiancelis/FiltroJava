package person.application;

import person.domain.Person;
import person.domain.ServicePerson;

public class UseCaseCreatePerson {


    ServicePerson servicePerson;

    public UseCaseCreatePerson(ServicePerson servicePerson) {
        this.servicePerson = servicePerson;
    }
    
    public boolean execute(Person persona){
        return servicePerson.createPerson(persona);
    };

}
