package person.domain;

public class Person extends Gender{
    private int id;
    private String name;
    private String lastname;
    private int idCity;
    private String adress;
    private int age;
    private String email;
    private int idSkill;
    private String fechaRegistro;

    


    public Person(int idGender, String genderName, int id, String name, String lastname, int idCity, String adress,
            int age, String email, int idSkill, String fechaRegistro) {
        super(idGender, genderName);
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.idCity = idCity;
        this.adress = adress;
        this.age = age;
        this.email = email;
        this.idSkill = idSkill;
        this.fechaRegistro = fechaRegistro;
    }

    public Person(){
        super();
    }

    public int getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(int idSkill) {
        this.idSkill = idSkill;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

  


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getIdCity() {
        return idCity;
    }

    public void setIdCity(int idCity) {
        this.idCity = idCity;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
