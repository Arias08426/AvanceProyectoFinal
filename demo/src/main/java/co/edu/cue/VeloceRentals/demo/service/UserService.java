package co.edu.cue.VeloceRentals.demo.service;

import co.edu.cue.VeloceRentals.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> getUser();
    void removeUser(Long id);
    void addUser(User user);

}
