package person.application;

import person.domain.Person;
import person.domain.ServicePerson;

public class UseCaseAsignSkillToPerson {
    ServicePerson servicePerson;

    public UseCaseAsignSkillToPerson(ServicePerson servicePerson) {
        this.servicePerson = servicePerson;
    }

    public boolean execute(Person person){
        return servicePerson.AsignSkillToPerson(person);
    }

    
}
