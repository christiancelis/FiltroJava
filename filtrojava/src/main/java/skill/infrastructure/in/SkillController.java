package skill.infrastructure.in;

import java.util.Scanner;

import skill.application.UseCaseCreateSkill;
import skill.domain.Skill;

public class SkillController {
    private final UseCaseCreateSkill useCaseCreateSkill;

    public SkillController(UseCaseCreateSkill useCaseCreateSkill) {
        this.useCaseCreateSkill = useCaseCreateSkill;
    }

    public void CrearHabilidad(Scanner scanner){
        
        try {
            Skill habilidad = new Skill();
            System.out.print("Digite el nombre de la habilidad: ");
            habilidad.setNombre(scanner.nextLine());
            scanner.nextLine();
            useCaseCreateSkill.execute(habilidad);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }



    
}
