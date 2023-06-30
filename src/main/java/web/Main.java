package web;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.AppConfig;
import web.service.CarService;
import web.service.UserService;

public class Main {
    AnnotationConfigApplicationContext context111 =
            new AnnotationConfigApplicationContext(AppConfig.class);
    CarService carService = context111.getBean(CarService.class);


}
