package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.User;
import web.services.UserService;

import javax.validation.Valid;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getListUser(Model model) {
        model.addAttribute("user", userService.listUsers());
        return "users";
    }

    @GetMapping("/adduser")
    public String CreateUser(@ModelAttribute("user") User user) {
        return "adduser";
    }

    @PostMapping("/adduser")
    public String addUser(@ModelAttribute("user") @Valid User user) {
        userService.addUser(user);
        return "redirect:/";
    }

    @GetMapping("/modifyuser")
    public String modifyUser(Model model, @RequestParam("id") int id) {
        model.addAttribute("user", userService.findById(id));
        return "modifyuser";
    }

    @PostMapping("/modifyuser")
    public String modifyUser(@ModelAttribute("user") @Valid User user) {
        userService.updateUser(user);
        return "redirect:/";
    }

    @GetMapping("/deleteUser")
    public String deleteUser(@RequestParam("id") int id) {
        userService.deleteUser(id);
        return "redirect:/";
    }
}
