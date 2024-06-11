package co.edu.cue.VeloceRentals.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "vehicles")
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Vehicles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String type;
    private int price;
    private boolean available;

    @Enumerated(EnumType.STRING)
    private Category category;
}