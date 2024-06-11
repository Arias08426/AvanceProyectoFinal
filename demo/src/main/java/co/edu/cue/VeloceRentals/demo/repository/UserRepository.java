package co.edu.cue.VeloceRentals.demo.repository;

import co.edu.cue.VeloceRentals.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u")
    List<User> listUsers();

    @Modifying
    @Transactional
    @Query("DELETE FROM User u WHERE u.id = :id")
    void removeUser(@Param("id") Long id);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO users (username, password, email) VALUES (:username, :password, :email)", nativeQuery = true)
    void addUser(@Param("username") String username, @Param("password") String password, @Param("email") String email);
}


