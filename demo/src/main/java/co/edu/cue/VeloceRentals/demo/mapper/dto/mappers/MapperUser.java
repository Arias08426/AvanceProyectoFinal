package co.edu.cue.VeloceRentals.demo.mapper.dto.mappers;

import co.edu.cue.VeloceRentals.demo.mapper.dto.UserDto;
import co.edu.cue.VeloceRentals.demo.model.User;

public class MapperUser {

    public static UserDto mapFrommodels(User user){
        return new UserDto(user.getId(), user.getUsername(), user.getPassword(), user.getEmail());

    }

    private static User mapFromDto(UserDto userDto){
        return User.builder()
                .id(userDto.user_id())
                .username(userDto.username())
                .password(userDto.password())
                .email(userDto.email())
                .build();
    }
}
