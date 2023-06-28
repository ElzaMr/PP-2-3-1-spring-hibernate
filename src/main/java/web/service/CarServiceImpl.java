package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Dao.CarDao;
import web.Dao.CarDaoImp;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImpl implements CarService{

    @Autowired
    CarDao car;
    @Override
    public List<Car> getListOfCars(int count) {
        return car.getListOfCar(count);
    }
}
