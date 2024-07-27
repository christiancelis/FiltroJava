package stack.infrastructure.in;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.DataBaseConfig;
import stack.domain.ServiceStack;
import stack.domain.Stack;

public class StackRepository implements ServiceStack{

    @Override
    public void createStack(Stack stack) {
        String sql = "insert into stack (id, name) VALUES(?,?)";
        try(Connection connection = DataBaseConfig.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)){
            statement.setInt(1, stack.getId());
            statement.setString(2, stack.getName());
            int rowsUpdated = statement.executeUpdate();
            if(rowsUpdated>0){
                System.out.println("stack insertado con exito");
            }else{
                System.out.println("Error al insertar stack");
            }
        } catch (SQLException e) {
            System.out.println("-----Error al insertar Stacks-----");
            System.out.println(e);
        }

    }

    @Override
    public void deleteStack(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteStack'");
    }

    @Override
    public ArrayList<Stack> getAllStacks() {
          ArrayList <Stack> listaStacks = new ArrayList<>();
        String sql = "select id, name, , From stack";
        try(Connection connection = DataBaseConfig.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)){
        
           try(ResultSet rs = statement.executeQuery()){
                while(rs.next()){
                    Stack stack = new Stack();
                    stack.setId(rs.getInt("id"));
                    stack.setName(rs.getString("name"));

                    listaStacks.add(stack);
                }  
           }    

        } catch (SQLException e) {
            System.out.println("-----Error al obtener Stacks-----");
            System.out.println(e);
        }

        return listaStacks;
    }
}


