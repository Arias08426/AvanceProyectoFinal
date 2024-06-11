package co.edu.cue.VeloceRentals.demo.controllers;

import co.edu.cue.VeloceRentals.demo.model.User;
import co.edu.cue.VeloceRentals.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/get-users")
public List<User> getAllUser(){
        return userService.getUser();
    }
    @DeleteMapping(value = "/delete-user/{id}")
    public void removeUser(@PathVariable Long id){
        userService.removeUser(id);
    }
    @PostMapping(value = "/add-user")
    public void removeUser(@RequestBody User user){
        userService.addUser(user);
    }
}
