package com.prog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prog.entity.Userdtls;

public interface UserRepository extends JpaRepository<Userdtls, Integer>{
	
	
	public Userdtls findByEmail(String em);

}
