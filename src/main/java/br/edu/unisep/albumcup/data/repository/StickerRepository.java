package br.edu.unisep.albumcup.data.repository;

import br.edu.unisep.albumcup.data.entity.Sticker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StickerRepository extends JpaRepository<Sticker, Integer> {

    @Query("select s from Sticker s where s.legendary = true")
    List<Sticker> findAllLegendary();

    @Query("select s from Sticker s where s.player.country.id = :countryId")
    List<Sticker> findByCountry(Integer countryId);

}
