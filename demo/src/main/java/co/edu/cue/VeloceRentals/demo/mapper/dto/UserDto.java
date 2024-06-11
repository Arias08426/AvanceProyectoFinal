package co.edu.cue.VeloceRentals.demo.mapper.dto;

import org.antlr.v4.runtime.misc.NotNull;

public record UserDto(
        long user_id,
        @NotNull

        String username,

        int age,
        String cellphone,
        String password,

        String email) {
}
