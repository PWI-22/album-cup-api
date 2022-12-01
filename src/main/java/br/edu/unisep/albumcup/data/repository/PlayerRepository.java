package br.edu.unisep.albumcup.data.repository;

import br.edu.unisep.albumcup.data.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
}
