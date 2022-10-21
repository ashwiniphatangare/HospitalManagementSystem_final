



package com.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hms.entity.Doctor;
import com.hms.entity.Petiont;
import com.hms.service.PetiontService;
import com.hms.service.DoctorService;
@RestController
public class PetiontController {
@Autowired
private PetiontService eService;
@Autowired
private DoctorService e1Service;

@GetMapping("/getPetiont")
public List<Petiont> getPetiont(){
	return eService.getPetiont();
	
}

@CrossOrigin(origins = {"http://localhost:4200"})

@PostMapping("/addPetiont")
public String addPetiont(@RequestBody Petiont petiont)
{
	this.eService.addPetiont(petiont);
	return "petient added succesfully";
	
}
@CrossOrigin(origins = "http://localhost:4200")
@DeleteMapping("/deletePetiont/{id}")
public String getPetiontById(@PathVariable int id) {

eService.deletePetiont(id);
return "Petiont deleted succesfully";
}
//@PostMapping("/addPetiont/{id}")
//public String addPetiont(@RequestBody Petiont petiont,@PathVariable int id)
//{
//	Doctor d=this.e1Service.getDoctorById(id);
//	petiont.setDoctor(d);
//	this.eService.addPetiont(petiont);
//	return "Petiont added succesfully";
//	
//}

//@DeleteMapping("/deletePetiont/{id}")
//public String deleteById(@PathVariable int id) {
//
//eService.deleteById(id);
//return "Petiont deleted succesfully";
//}
//
//@PutMapping("/updatePetiont/{id}")
//public String updatePetiont(@PathVariable int id,@RequestBody Petiont petiont) {
//	eService.updatePetiont(id, petiont);
//	return "Doctor update successfully";
//}




}



