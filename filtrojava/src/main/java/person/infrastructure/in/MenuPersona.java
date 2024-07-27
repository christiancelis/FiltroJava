package person.infrastructure.in;

import java.util.Scanner;

import com.example.filtrojava.Main;

import city.application.UseCaseGetAllCities;
import city.domain.ServiceCity;
import city.infrastructure.out.CityRepository;
import person.application.UseCaseAsignSkillToPerson;
import person.application.UseCaseCreatePerson;
import person.application.UseCaseGetAllGenders;
import person.application.UseCaseGetAllPerson;
import person.domain.ServicePerson;
import person.infrastructure.out.PersonRepository;
import skill.application.UseCaseGetAllSkills;
import skill.domain.ServiceSkill;
import skill.infrastructure.out.SkillRepository;

public class MenuPersona {

    public void start(Scanner scanner){

        

        ServicePerson servicePerson = new PersonRepository();
        ServiceCity serviceCity = new CityRepository();
        ServiceSkill serviceSkill = new SkillRepository();

    UseCaseCreatePerson createPerson = new UseCaseCreatePerson(servicePerson);
    UseCaseGetAllGenders getAllGenders = new UseCaseGetAllGenders(servicePerson);
    UseCaseGetAllCities getAllCities = new UseCaseGetAllCities(serviceCity);
    UseCaseAsignSkillToPerson asignSkillToPerson = new UseCaseAsignSkillToPerson(servicePerson);
    UseCaseGetAllPerson getAllPerson = new UseCaseGetAllPerson(servicePerson);
    UseCaseGetAllSkills getAllSkills = new UseCaseGetAllSkills(serviceSkill);


    PersonaController pc  = new PersonaController(createPerson,getAllGenders, getAllCities, asignSkillToPerson, getAllPerson, getAllSkills);


    

    while(true){
        imprimirMenu();
        int op = 0;
        try {
            System.out.print("Digite una opcion: ");
            op = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("error de menu");
        }

        switch (op) {
            case 1:
                pc.registrarPersona(scanner);
                break;
            case 2:
                pc.asignarSkillAPersona(scanner);
                break;
            case 3:
                System.out.println("Saliendo....");
                    return;

           
            default:
                System.out.println("Error Opcion no valida");
                break;
        }
    }
    

}
    private void imprimirMenu(){
        System.out.println("Menu Persona");
        System.out.println("1.Registrar Persona");
        System.out.println("2. Asignar Habilidad a Persona");
        System.out.println("3. Salir");
    }
}
