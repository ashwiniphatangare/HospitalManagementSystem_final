package com.hms.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hms.entity.Doctor;
import com.hms.repository.DoctorRepository;
import com.hms.service.DoctorService;


@RestController
public class DoctorController {
@Autowired
private DoctorService eService;
@GetMapping("/getDoctor")
public List<Doctor> getDoctor(){
	return eService.getDoctor();
	
}
@CrossOrigin(origins = {"http://localhost:4200"})

@PostMapping("/addDoctor")
public String addDoctor(@RequestBody Doctor doctor)
{
	this.eService.addDoctor(doctor);
	return "Doctor added succesfully";
	
}
@CrossOrigin(origins = "http://localhost:4200")
@DeleteMapping("/deleteDoctor/{id}")
public String getDoctorById(@PathVariable int id) {

eService.deleteDoctor(id);
return "Doctor deleted succesfully";
}

//@PutMapping("/updateDoctor")
//public String updateDoctorById(@PathVariable int id,@RequestBody Doctor doctor) {
//	eService.updateDoctor(id, doctor);
//	return "Doctor update successfully";
//}
@PutMapping("/updateDoctor")
public Doctor updateDoctor(@RequestBody Doctor doctor)
{
	
	
	return this.eService.updateDoctor(doctor);
}
//@PutMapping("/doctors")
//public Doctor update(@RequestBody Doctor doctors)
//{
//
//			eService.saveOrUpdate(doctors);
//			
//			
//			return doctors;
//}
@PutMapping("/doctor/{id}")
public ResponseEntity<?> update(@RequestBody Doctor doctor, @PathVariable Integer id) {
    try {
    	Doctor existDoctor = eService.getDoctorById(id);
        eService.saveOrUpdate(doctor);
        return new ResponseEntity<>(HttpStatus.OK);
    } catch (NoSuchElementException e) {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }      
}

//}
//@GetMapping("/getEmployeebyid/{eid}")
//public Employee getEmployeebyid(@PathVariable int eid) {
//return eService.getEmployeebyid(eid);
//}
//@GetMapping("/search/{ename}")
//public List<Employee> searchName(@PathVariable String ename){
//	return this.eService.searchbyname(ename);	
//}
}
