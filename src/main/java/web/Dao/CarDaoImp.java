package web.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDaoImp implements CarDao{

    private final List<Car>listOfCars = new ArrayList<>();
    {
        listOfCars.add(new Car("BMW",2,"Masha"));
        listOfCars.add(new Car("Opel",6,"Misha"));
        listOfCars.add(new Car("Mercedes",2,"Max"));
        listOfCars.add(new Car("Toyota",22,"Masha"));
        listOfCars.add(new Car("Niva",2,"Vladimir"));
    }

    @Override
    public List<Car> getListOfCar(int count) {
        if (count >= 5) {
            return listOfCars;
        }
        return listOfCars.stream().limit(count).toList();
    }

}
