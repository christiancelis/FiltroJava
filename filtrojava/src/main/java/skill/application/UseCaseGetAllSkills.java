package skill.application;

import java.util.ArrayList;

import skill.domain.ServiceSkill;
import skill.domain.Skill;

public class UseCaseGetAllSkills {
    ServiceSkill serviceSkill;

    public UseCaseGetAllSkills(ServiceSkill serviceSkill) {
        this.serviceSkill = serviceSkill;
    }

    public ArrayList <Skill> execute(){
        return serviceSkill.getAllSkills();
    }    

    
}   
