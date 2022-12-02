package br.edu.unisep.albumcup.data.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "stickers")
public class Sticker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_sticker")
    private Integer id;

    @OneToOne
    @JoinColumn(name = "id_player")
    private Player player;

    @Column(name = "tp_legendary")
    private boolean legendary;
}
