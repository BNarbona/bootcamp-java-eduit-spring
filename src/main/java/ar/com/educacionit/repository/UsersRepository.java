package ar.com.educacionit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ar.com.educacionit.domain.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{ //EX DAO

	//ctrl+o+o
	//select * from useres where username='dato' 
	Users findByUsername(String username);
	
	/*
	@Query(
		value="Select u.category from Users where u.id = 2",
		nativeQuery = true)
	UsersCategory getUser2();
	*/
	
	
}
