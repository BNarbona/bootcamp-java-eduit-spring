package ar.com.educacionit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.educacionit.domain.Socios;

@Repository
/*
 * T: es la entidad sobre la que voy a trabajar 
 * ID: tipo de datos de la PK (id del Entity) 
 * */

public interface SociosRepository extends JpaRepository<Socios, Long>{ //EX DAO

	//ctrl+o+o me muestra los metodos disponibles
	
	
}
