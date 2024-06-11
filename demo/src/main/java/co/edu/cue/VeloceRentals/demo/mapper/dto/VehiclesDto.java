package co.edu.cue.VeloceRentals.demo.mapper.dto;

public record VehiclesDto(
        long id,
        String type,
        int price,
        boolean available
)
{

}