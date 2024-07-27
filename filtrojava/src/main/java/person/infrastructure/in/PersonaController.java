package person.infrastructure.in;

import java.util.ArrayList;
import java.util.Scanner;

import city.application.UseCaseGetAllCities;
import city.domain.City;
import person.application.UseCaseAsignSkillToPerson;
import person.application.UseCaseCreatePerson;
import person.application.UseCaseGetAllGenders;
import person.application.UseCaseGetAllPerson;
import person.domain.Gender;
import person.domain.Person;
import skill.application.UseCaseGetAllSkills;
import skill.domain.Skill;

public class PersonaController {
    private final UseCaseCreatePerson useCaseCreatePerson;
    private final UseCaseGetAllGenders useCaseGetAllGenders;
    private final UseCaseGetAllCities useCaseGetAllCities;
    private final UseCaseAsignSkillToPerson useCaseAsignSkillToPerson;
    private final UseCaseGetAllPerson useCaseGetAllPerson;
    private final UseCaseGetAllSkills useCaseGetAllSkills;


    public PersonaController(UseCaseCreatePerson useCaseCreatePerson, UseCaseGetAllGenders useCaseGetAllGenders,
            UseCaseGetAllCities useCaseGetAllCities, UseCaseAsignSkillToPerson useCaseAsignSkillToPerson,
            UseCaseGetAllPerson useCaseGetAllPerson, UseCaseGetAllSkills useCaseGetAllSkills) {
        this.useCaseCreatePerson = useCaseCreatePerson;
        this.useCaseGetAllGenders = useCaseGetAllGenders;
        this.useCaseGetAllCities = useCaseGetAllCities;
        this.useCaseAsignSkillToPerson = useCaseAsignSkillToPerson;
        this.useCaseGetAllPerson = useCaseGetAllPerson;
        this.useCaseGetAllSkills = useCaseGetAllSkills;
    }

    public void registrarPersona(Scanner scanner){

        try {
            Person persona = new Person();
            System.out.print("Digite el id de la persona: ");
            persona.setId(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Digite el nombre de la persona: ");
            persona.setName(scanner.nextLine());
            scanner.nextLine();

            System.out.print("Digite el apellido de la persona: ");
            persona.setLastname(scanner.nextLine());
            scanner.nextLine();

            imprimirCiudades();
            System.out.print("Digite el id de la ciudad: ");
            persona.setIdCity(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Digite la direccion de la persona: ");
            persona.setAdress(scanner.nextLine());
            scanner.nextLine();

            System.out.print("Digite la edad: ");
            persona.setAge(scanner.nextInt());
            scanner.nextLine();

            System.out.print("Digite el email de la persona: ");
            persona.setEmail(scanner.nextLine());
            scanner.nextLine();

            imprimirGeneros();
            System.out.print("Digite el id del genero la persona: ");
            persona.setIdGender(scanner.nextInt());
            scanner.nextLine();

            useCaseCreatePerson.execute(persona);

        } catch (Exception e) {
            System.out.println("no valido");
            return;
        }

    }

    public void asignarSkillAPersona(Scanner scanner){
        try {
        Person persona = new Person();

        imprimirPersona();

        System.out.print("Digite el id de la persona: ");
            persona.setId(scanner.nextInt());
            scanner.nextLine();

        imprimirSkills();

        System.out.print("Digite el id de la skill: ");
        persona.setId(scanner.nextInt());
        scanner.nextLine();


        System.out.print("Digite la fecha de registro: ");
        persona.setFechaRegistro(scanner.nextLine());
        scanner.nextLine();

       
            useCaseAsignSkillToPerson.execute(persona);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }



public void imprimirGeneros(){
    ArrayList <Gender> genders = useCaseGetAllGenders.execute();
    genders.forEach((e)-> System.out.println("id: " + e.getIdGender() + " nombre: " + e.getGenderName()));
}

public void imprimirCiudades(){
    ArrayList <City> cities = useCaseGetAllCities.execute();
    cities.forEach((e)-> System.out.println("id: " + e.getId() + " nombre: " + e.getName()));
}

public void imprimirPersona(){
    ArrayList <Person> personas = useCaseGetAllPerson.execute();
    personas.forEach((e)-> System.out.println("id: " + e.getId() + " nombre: " + e.getName()));
}


public void imprimirSkills(){
    ArrayList <Skill> skills = useCaseGetAllSkills.execute();
    skills.forEach((e)-> System.out.println("id: " + e.getId() + " nombre: " + e.getNombre()));
}








    
}
