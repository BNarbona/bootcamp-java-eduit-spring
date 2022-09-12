package ar.com.educacionit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.educacionit.domain.Cupon;

public interface CuponRepository extends JpaRepository<Cupon, Long> {

}
