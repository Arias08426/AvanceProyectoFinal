package co.edu.cue.VeloceRentals.demo.service.impl;

import co.edu.cue.VeloceRentals.demo.mapper.dto.mappers.MapperUser;
import co.edu.cue.VeloceRentals.demo.model.User;
import co.edu.cue.VeloceRentals.demo.repository.UserRepository;
import co.edu.cue.VeloceRentals.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    public List<User> getUser() {
        return repository.listUsers();
    }

    @Override
    public void removeUser(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void addUser(User user) {

        return MapperUser.mapFrommodels(
                repository.save(MapperUser.mapFromDto(user))
        );
    }
}


