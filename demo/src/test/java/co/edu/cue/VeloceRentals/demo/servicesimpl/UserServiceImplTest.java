package co.edu.cue.VeloceRentals.demo.servicesimpl;

import co.edu.cue.VeloceRentals.demo.model.User;
import co.edu.cue.VeloceRentals.demo.service.impl.UserServiceImpl;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;

@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {

    @Mock
    private UserRepositoryJPA repository;

    @InjectMocks
    private UserServiceImpl service;

    void addUser(){
        User expected = User.builder()
                .id(1L)
                .username("Juan Camilo")
                .password("12233")
                .email("jarias0897@cue.edu.co")
                .build();
        Mockito.when(repository.save(any())).thenReturn(expected);
    }
}
