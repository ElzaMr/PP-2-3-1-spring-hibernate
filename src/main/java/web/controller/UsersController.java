package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UserService userService;
    @GetMapping()
    public String getAllUsers(Model model) {
        List<User> list  = userService.getAllUsers();
        model.addAttribute("listOfUsers", list);
        return "users";
    }
    @GetMapping(value = "/{id}")
    public String getUser(@PathVariable("id")int id,Model model) {//id задается in url и приходит в инт айди
        User user = userService.getUserById(id);
        model.addAttribute("listOfUser",user);//создаем модель которую передаем в отображение вью
        return "user";
    }
    @GetMapping(value = "/new")
    public String newUser( User user,Model model) {//гет запрос, запрашиваем данные для объекта юзер
        model.addAttribute("user1", user);
        return "new";

    }
    //@ModelAttribute ("user")User user то же самое что и Model.addAttribute("user") user и в параметрах метода User user!!!!!!!!!!!!!
    //наблюдение №2 совершенно срать как назвать метод контроллера
    @PostMapping()
    public String create(@ModelAttribute ("user")User user,Model model) {
        userService.save(user);
        return "redirect:/users";
    }
    @GetMapping("/update/{id}")
    public String update(Model model,@PathVariable("id")int id) {
        model.addAttribute("user",userService.getUserById(id));
        return "update";
    }
    @PatchMapping ("/{id}")
    public String update1(@ModelAttribute("user")User user, @PathVariable("id") int id){
        userService.update(user,id);
        return "redirect:/users";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id")int id){
        userService.delete(id);//находим юзера по айди закидываем его в метод
        return "redirect:/users";
    }
}
