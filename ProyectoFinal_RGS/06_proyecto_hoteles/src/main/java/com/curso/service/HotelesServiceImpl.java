package com.curso.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.HotelesDao;
import com.curso.model.Hotel;

/**
 * @author Rubén Gimeno
 *
 */
@Service
public class HotelesServiceImpl implements HotelesService {
	@Autowired
	HotelesDao dao;

	@Override
	public List<Hotel> hotelesDisponibles() {
		List<Hotel> hoteles = dao.findAll();
		return hoteles.stream().filter(Hotel::getDisponibilidad).collect(Collectors.toList());
	}

	@Override
	public Hotel getHotelesNombre(String nombre) {
		return dao.buscarNombre(nombre);
	}
}
