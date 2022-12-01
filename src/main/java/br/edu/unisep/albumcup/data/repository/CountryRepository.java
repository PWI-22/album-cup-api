package br.edu.unisep.albumcup.data.repository;

import br.edu.unisep.albumcup.data.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
