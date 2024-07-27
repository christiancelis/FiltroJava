package person.domain;

import java.util.ArrayList;

public interface ServicePerson {
    ArrayList <Gender> getAllGenders();
    boolean createPerson(Person persona);
    boolean AsignSkillToPerson(Person persona);
    ArrayList <Person> getAllPerson();
    // void UpdatePerson (Person persona);


}
