package city.application;

import java.util.ArrayList;

import city.domain.City;
import city.domain.ServiceCity;


public class UseCaseGetAllCities {
   ServiceCity serviceCity; 

    public UseCaseGetAllCities(ServiceCity serviceCity) {
        this.serviceCity = serviceCity;
    }

    public ArrayList<City> execute(){
        return  serviceCity.getAllCities();
    }
    
}
