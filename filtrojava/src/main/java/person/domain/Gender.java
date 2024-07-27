package person.domain;

public class Gender {
    private int idGender;
    private String genderName;
    
    public Gender(int idGender, String genderName) {
        this.idGender = idGender;
        this.genderName = genderName;
    }

    public Gender() {
    }

    public int getIdGender() {
        return idGender;
    }

    public void setIdGender(int idGender) {
        this.idGender = idGender;
    }

    public String getGenderName() {
        return genderName;
    }

    public void setGenderName(String genderName) {
        this.genderName = genderName;
    }
    
}
