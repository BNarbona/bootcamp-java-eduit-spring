package ar.com.educacionit.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.educacionit.domain.Cupon;
import ar.com.educacionit.domain.Socios;
import ar.com.educacionit.repository.CuponRepository;
import ar.com.educacionit.repository.SociosRepository;

@Service
public class CuponService {

	
	@Autowired
	private CuponRepository repository;
	
	public List<Cupon> buscarTodos(){
		
		return this.repository.findAll();
	}

	public void eliminar(Long id) {
		this.repository.deleteById(id);
		
	}


	public Cupon buscarCupon(Long id) {
		Optional<Cupon> entity = this.repository.findById(id);
		
		if(entity.isPresent()) {
			return entity.get();
		} else {
			return null;
		}
	}
}