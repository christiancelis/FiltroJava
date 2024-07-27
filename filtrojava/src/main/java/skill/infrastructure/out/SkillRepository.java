package skill.infrastructure.out;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.DataBaseConfig;
import skill.domain.ServiceSkill;
import skill.domain.Skill;


public class SkillRepository implements ServiceSkill{

    @Override
    public void CreateSkill(Skill skill) {
          String sql = "insert into skill (name) VALUES(?)";
        try(Connection connection = DataBaseConfig.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS)){
            statement.setString(1, skill.getNombre());
            int rowsUpdated = statement.executeUpdate();
            try(ResultSet generateKeys = statement.getGeneratedKeys()){;
                if(generateKeys.next()){
                    skill.setId(generateKeys.getInt(1));
                }
            }
            if(rowsUpdated>0){
                System.out.println("skill insertado con exito");
            }else{
                System.out.println("Error al insertar skill");
            }
        } catch (SQLException e) {
            System.out.println("-----Error al insertar skill-----");
            System.out.println(e);
        }
    }

    @Override
    public ArrayList<Skill> getAllSkills() {
          ArrayList <Skill> listaSkill = new ArrayList<>();
        String sql = "select id, name From skill";

        try(Connection connection = DataBaseConfig.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)){
        
           try(ResultSet rs = statement.executeQuery()){
                while(rs.next()){
                    Skill skill = new Skill();
                    skill.setId(rs.getInt("id"));
                    skill.setNombre(rs.getString("name"));

                    listaSkill.add(skill);
                }  
           }    

        } catch (SQLException e) {
            System.out.println("-----Error al obtener Stacks-----");
            System.out.println(e);
        }
        return listaSkill;
    }


    
}
