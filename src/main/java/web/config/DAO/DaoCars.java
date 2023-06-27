package web.config.DAO;

import web.model.Car;

import java.util.List;

public interface DaoCars {
    public List<Car> getListOfCar(int count);
}
