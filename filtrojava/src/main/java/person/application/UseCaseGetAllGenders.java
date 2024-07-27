package person.application;



import java.util.ArrayList;

import person.domain.Gender;
import person.domain.ServicePerson;

public class UseCaseGetAllGenders {
    ServicePerson servicePerson;

    public UseCaseGetAllGenders(ServicePerson servicePerson) {
        this.servicePerson = servicePerson;
    }
    
    public ArrayList <Gender> execute(){
        return servicePerson.getAllGenders();
    };
}
