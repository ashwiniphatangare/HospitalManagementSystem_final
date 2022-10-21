package com.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hms.entity.Appointment;
import com.hms.entity.Doctor;
import com.hms.service.AppointmentService;
import com.hms.service.DoctorService;

@RestController
public class AppointmentController {
	@Autowired
	private AppointmentService eService;
	@GetMapping("/getAppointment")
	public List<Appointment> getAppointment(){
		return eService.getAppointment();
		
	}
	@CrossOrigin(origins = {"http://localhost:4200"})

	@PostMapping("/addAppointment")
	public String addAppointment(@RequestBody Appointment appointment)
	{
		this.eService.addAppointment(appointment);
		return "Appointment added succesfully";
		
	}
//	@CrossOrigin(origins = "http://localhost:4200")
//	@DeleteMapping("/deleteDoctor/{id}")
//	public String getDoctorById(@PathVariable int id) {
//
//	eService.deleteDoctor(id);
//	return "Doctor deleted succesfully";
//	}
}
