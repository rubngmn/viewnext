package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.VuelosDao;
import com.curso.model.Vuelo;

/**
 * @author Rubén Gimeno
 *
 */
@Service
public class VuelosServiceImpl implements VuelosService {
	@Autowired
	VuelosDao dao;
	
//	@Override
//	public List<Vuelo> findAllVuelos() {
//		return dao.findAll();
//	}
	
	@Override
	public List<Vuelo> getVuelosPlazas(int plazas) {
		return dao.buscarPlaza(plazas);
	}

	@Override
	public void actualizarVuelo(int idVuelo, int plazasReservadas) {
		Vuelo vuelo = dao.findById(idVuelo).orElse(null);
		vuelo.setPlazas(vuelo.getPlazas() - plazasReservadas);
		dao.save(vuelo);
	}

}
