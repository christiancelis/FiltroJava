package skill.application;

import skill.domain.ServiceSkill;
import skill.domain.Skill;

public class UseCaseCreateSkill {
    ServiceSkill serviceSkill;

    public UseCaseCreateSkill(ServiceSkill serviceSkill) {
        this.serviceSkill = serviceSkill;
    }

    public void execute (Skill skill){
        serviceSkill.CreateSkill(skill);
    }

}
