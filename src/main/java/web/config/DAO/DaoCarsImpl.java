package web.config.DAO;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class DaoCarsImpl implements DaoCars{
    private List<Car>listOfCars = new ArrayList<>();

    public static void main(String[] args) {
        List<Car> s = new DaoCarsImpl().getListOfCar(10);
        System.out.println(s);
    }
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
