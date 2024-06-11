package co.edu.cue.VeloceRentals.demo.repository;

import co.edu.cue.VeloceRentals.demo.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

public interface UserRepositoryImpl implements UserRepository{
@PersistenceContext
    private EntityManager entityManager;
@Override
    public List<User> ListUser(){
    String query = "FROM User";
    return entityManager.createQuery(query).getResultList();
}
@Override
    public void removeUser(Long id){
    User user = entityManager.find(User.class,id);
    entityManager.remove(user);
}
@Override
    public void addUser(User user){
    entityManager.merge(user);
}
}
