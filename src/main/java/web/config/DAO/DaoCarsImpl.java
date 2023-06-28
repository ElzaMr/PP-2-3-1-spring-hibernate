package web.config.DAO;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class DaoCarsImpl implements DaoCars{
    private List<Car>listOfCars = new ArrayList<>();

    @Override
    public List<Car> getListOfCar(int count) {
        listOfCars.add(new Car("BMW",2,"Masha"));
        listOfCars.add(new Car("Opel",6,"Misha"));
        listOfCars.add(new Car("Mercedes",2,"Max"));
        listOfCars.add(new Car("Toyota",22,"Masha"));
        listOfCars.add(new Car("Niva",2,"Vladimir"));
        return listOfCars.stream().limit(count).toList();
    }
}
