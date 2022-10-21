package com.hms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hms.entity.Doctor;
import com.hms.entity.Petiont;

@Repository
public interface PetiontRepository extends JpaRepository<Petiont,Integer> {
	
}

