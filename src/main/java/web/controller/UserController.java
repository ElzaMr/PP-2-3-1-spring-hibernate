package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.model.User;
import web.service.UserService;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping(value = "/users")
    public String getAllUsers(ModelMap model) {
        List<User> list  = userService.getAllUsers();
        model.addAttribute("listOfUsers", list);
        return "users";
    }
}
