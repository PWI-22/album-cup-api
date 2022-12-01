package br.edu.unisep.albumcup.domain.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PlayerDto {

    private Integer id;
    private String name;
    private Double height;
    private Double weight;
    private LocalDate birthday;

}
