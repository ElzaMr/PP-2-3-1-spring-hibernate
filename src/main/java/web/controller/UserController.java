package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.Car;
import web.model.User;
import web.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping()
    public String getAllUsers(ModelMap model) {
        List<User> list  = userService.getAllUsers();
        model.addAttribute("listOfUsers", list);
        return "users";
    }
    @GetMapping(value = "/user")
    public String getAllUsers(@RequestParam(value = "id")int id,ModelMap model) {
        List<User> list1  = userService.getUserById(id);
        model.addAttribute("listOfUser",list1);
        return "user";

    }
    @GetMapping(value = "/new")
    public String newUser(ModelMap model) {
        model.addAttribute("user",new User());
        return "new";

    }
    @PostMapping()
    public String create(@ModelAttribute ("user")User user,ModelMap model) {
        userService.save(user);
        return "redirect:/users";

    }
}
