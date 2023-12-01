package com.curso.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.curso.model.Vuelo;

/**
 * @author Rubén Gimeno
 *
 */
public interface VuelosDao extends JpaRepository<Vuelo, Integer> {
	@Query("SELECT v FROM Vuelo v WHERE v.plazas >= :plazas")
	List<Vuelo> buscarPlaza	(@Param("plazas") int plazas);
}
