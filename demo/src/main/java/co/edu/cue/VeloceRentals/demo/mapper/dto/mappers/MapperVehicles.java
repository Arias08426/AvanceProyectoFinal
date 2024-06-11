package co.edu.cue.VeloceRentals.demo.mapper.dto.mappers;

import co.edu.cue.VeloceRentals.demo.mapper.dto.VehiclesDto;
import co.edu.cue.VeloceRentals.demo.model.Vehicles;

public class MapperVehicles {

    public static VehiclesDto mapFrommodels(Vehicles vehicles){
        return new VehiclesDto(vehicles.getId(), vehicles.getType(), vehicles.getPrice(), vehicles.isAvailable());
    }
    public static Vehicles mapFromto(VehiclesDto vehiclesDto){
        return Vehicles.builder()
                .id(vehiclesDto.id())
                .type(vehiclesDto.type())
                .price(vehiclesDto.price())
                .available(vehiclesDto.available())
                .build();
    }
}
