package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Dao.CarDao;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImpl implements CarService{

    @Autowired
    private CarDao car;

    @Override
    public List<Car> getListOfCars(int count) {
        return car.getListOfCar(count);
    }
}
