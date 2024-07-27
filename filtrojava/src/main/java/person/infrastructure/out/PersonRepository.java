package person.infrastructure.out;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.DataBaseConfig;
import person.domain.Gender;
import person.domain.Person;
import person.domain.ServicePerson;


public class PersonRepository implements ServicePerson {

    @Override
    public ArrayList<Gender> getAllGenders() {
        ArrayList <Gender> listaGender = new ArrayList<>();
        String sql = "select id, name  From gender";

        try(Connection connection = DataBaseConfig.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)){
        
           try(ResultSet rs = statement.executeQuery()){
                while(rs.next()){
                    Gender gender = new Gender();
                    gender.setIdGender(rs.getInt("id"));
                    gender.setGenderName(rs.getString("name"));

                    listaGender.add(gender);
                }  
           }    

        } catch (SQLException e) {
            System.out.println("-----Error al obtener Stacks-----");
            System.out.println(e);
        }

        return listaGender;
    }

    @Override
    public boolean createPerson(Person persona) {
        String sql = "insert into person (name , lastname , idcity , address , age , email ,idgender) VALUES(?,?,?,?,?,?,?)";
        try(Connection connection = DataBaseConfig.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS)){
            statement.setString(1, persona.getName());
            statement.setString(2, persona.getLastname());
            statement.setInt(3, persona.getIdCity());
            statement.setString(4, persona.getAdress());
            statement.setInt(5, persona.getAge());
            statement.setInt(6, persona.getIdCity());
            statement.setInt(7, persona.getIdGender());
            
            int rowsUpdated = statement.executeUpdate();

            try(ResultSet generateKeys = statement.getGeneratedKeys()){;
                if(generateKeys.next()){
                    persona.setId(generateKeys.getInt(1));
                }
            }

            
            if(rowsUpdated>0){
                System.out.println("Persona insertado con exito");
                return true;
            }else{
                System.out.println("Error al insertar persona");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("-----Error al insertar persona-----");
            System.out.println(e);
        }

        return false;
    }

    @Override
    public boolean AsignSkillToPerson(Person persona) {
        String sql = "insert into persons_skill (registration_date, idperson , idskill) VALUES(?,?,?)";
        try(Connection connection = DataBaseConfig.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS)){
            statement.setString(1, persona.getFechaRegistro());
            statement.setInt(2, persona.getId());
            statement.setInt(3, persona.getIdSkill());
            int rowsUpdated = statement.executeUpdate();
            try(ResultSet generateKeys = statement.getGeneratedKeys()){;
                    if(generateKeys.next()){
                        persona.setId(generateKeys.getInt(1));
                    }
            }
            if(rowsUpdated>0){
                System.out.println("Skill asignado a persona  con exito");
                return true;
            }else{
                System.out.println("Error al asignar skill a persona");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("-----Error al asignar skill a persona-----");
            System.out.println(e);
        }

        return false;
    }

    @Override
    public ArrayList<Person> getAllPerson() {
        ArrayList <Person> listaPersona = new ArrayList<>();
        String sql = "select id, name From person";

        try(Connection connection = DataBaseConfig.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)){
        
           try(ResultSet rs = statement.executeQuery()){
                while(rs.next()){
                    Person persona = new Person();
                    persona.setId(rs.getInt("id"));
                    persona.setName(rs.getString("name"));

                    listaPersona.add(persona);
                }  
           }    

        } catch (SQLException e) {
            System.out.println("-----Error al obtener Personas-----");
            System.out.println(e);
        }

        return listaPersona;
    }

}
