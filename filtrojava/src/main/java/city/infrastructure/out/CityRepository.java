package city.infrastructure.out;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import city.domain.City;
import city.domain.ServiceCity;
import config.DataBaseConfig;

public class CityRepository implements ServiceCity{

    @Override
    public ArrayList<City> getAllCities() {
        ArrayList <City> listaCiudades = new ArrayList<>();
        String sql = "select id, name, idregion From city";

        try(Connection connection = DataBaseConfig.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql)){
        
           try(ResultSet rs = statement.executeQuery()){
                while(rs.next()){
                    City ciudad = new City();
                    ciudad.setId(rs.getInt("id"));
                    ciudad.setName(rs.getString("name"));
                    ciudad.setIdRegion(rs.getInt("idregion"));
                    listaCiudades.add(ciudad);
                }  
           }    

        } catch (SQLException e) {
            System.out.println("-----Error al obtener ciudades-----");
            System.out.println(e);
        }

        return listaCiudades;
    }

}
