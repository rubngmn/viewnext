package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.ReservasDao;
import com.curso.model.Reserva;

/**
 * @author Rubén Gimeno
 *
 */
@Service	
public class ReservasServiceImpl implements ReservasService {

	@Autowired
	RestTemplate template;

	@Autowired
	ReservasDao dao;	

	private String urlHotel = "http://localhost:1201/";
//	private String urlVuelo = "http://localhost:1203/";

	@Override	
    public List<Reserva> buscarReservasHotelNombre(String nombre) {
        List<Integer> idHoteles = template.getForObject(urlHotel + "hoteles" + nombre, List.class);
        List<Reserva> reservas = dao.findById(idHoteles);
        return reservas;
    }
	
}
