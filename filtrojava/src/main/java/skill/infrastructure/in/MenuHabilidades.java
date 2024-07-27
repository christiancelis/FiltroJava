package skill.infrastructure.in;

import java.util.Scanner;

import skill.application.UseCaseCreateSkill;
import skill.domain.ServiceSkill;
import skill.infrastructure.out.SkillRepository;

public class MenuHabilidades {
    public void start(Scanner scanner){

        ServiceSkill serviceSkill = new SkillRepository();

        UseCaseCreateSkill createSkill = new UseCaseCreateSkill(serviceSkill);

        SkillController skillController = new SkillController(createSkill);



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
                    skillController.CrearHabilidad(scanner);
                    break;
                case 2:
                    System.out.println("Mantenimiento");
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
        System.out.println("Menu Habilidades");
        System.out.println("1.Crear Habilidad");
        System.out.println("3. Salir");
    }
}   
