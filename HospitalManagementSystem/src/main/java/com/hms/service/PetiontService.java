package com.hms.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entity.Doctor;
import com.hms.entity.Petiont;
import com.hms.repository.PetiontRepository;
import com.hms.repository.DoctorRepository;

@Service
public class PetiontService {
@Autowired
private PetiontRepository eRepository;

public List<Petiont> getPetiont(){
	return eRepository.findAll();
}
public Petiont addPetiont(Petiont petiont) {
	return eRepository.save(petiont);
}



public void deletePetiont(int id) {
	
	 eRepository.deleteById(id);
	
}

}
