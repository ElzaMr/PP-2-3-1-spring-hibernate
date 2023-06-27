package web.service;

import web.config.DAO.DaoCars;
import web.config.DAO.DaoCarsImpl;
import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService{
    DaoCars daoCars = new DaoCarsImpl();
    @Override
    public List<Car> getListOfCars(int count) {
        return daoCars.getListOfCar(count);
    }
}
