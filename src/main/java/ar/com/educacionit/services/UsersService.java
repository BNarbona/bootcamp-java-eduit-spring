package ar.com.educacionit.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.educacionit.domain.Cupon;
import ar.com.educacionit.domain.Socios;
import ar.com.educacionit.domain.Users;
import ar.com.educacionit.repository.CuponRepository;
import ar.com.educacionit.repository.SociosRepository;
import ar.com.educacionit.repository.UsersRepository;

@Service
public class UsersService {

	
	@Autowired
	private UsersRepository repository;
	
	public List<Users> buscarTodos(){
		
		return this.repository.findAll();
	}

	public Users buscarPorNombreDeUsuario(String username) {
		// TODO Auto-generated method stub
		return null;
	}


}
