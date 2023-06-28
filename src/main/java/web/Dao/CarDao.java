package web.Dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    public List<Car> getListOfCar(int count);
}
