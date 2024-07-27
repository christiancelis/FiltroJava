package skill.domain;

public class Skill {
    private int id;
    private String nombre;
    private int idStackSkill;
    private int idStack;
    private int nombreStack;
    
    public Skill(int id, String nombre, int idStackSkill, int idStack, int nombreStack) {
        this.id = id;
        this.nombre = nombre;
        this.idStackSkill = idStackSkill;
        this.idStack = idStack;
        this.nombreStack = nombreStack;
    }

    public Skill() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdStackSkill() {
        return idStackSkill;
    }

    public void setIdStackSkill(int idStackSkill) {
        this.idStackSkill = idStackSkill;
    }

    public int getIdStack() {
        return idStack;
    }

    public void setIdStack(int idStack) {
        this.idStack = idStack;
    }

    public int getNombreStack() {
        return nombreStack;
    }

    public void setNombreStack(int nombreStack) {
        this.nombreStack = nombreStack;
    }

    

    



    
    

    
}
