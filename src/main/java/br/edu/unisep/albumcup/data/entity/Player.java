package br.edu.unisep.albumcup.data.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "countries")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_player")
    private Integer id;

    @Column(name = "nm_player")
    private String name;

    @Column(name = "vl_height")
    private Double height;

    @Column(name = "vl_weight")
    private Double weight;

    @Column(name = "dt_birth")
    private LocalDate birthday;

}
