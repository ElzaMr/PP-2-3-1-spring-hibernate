package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private final CarService carService = new CarServiceImpl();
    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count",defaultValue = "5")int count, ModelMap model) {
        List<Car> list = new ArrayList<>();
        list = carService.getListOfCars(count);
        model.addAttribute("listOfCars",list);
        return "cars";
    }
}
