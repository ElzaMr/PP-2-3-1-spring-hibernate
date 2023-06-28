package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.config.DAO.DaoCars;
import web.config.DAO.DaoCarsImpl;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImpl implements CarService{

    @Autowired
    DaoCarsImpl daoCars= new DaoCarsImpl();
    @Override
    public List<Car> getListOfCars(int count) {
        return daoCars.getListOfCar(count);
    }
}
