package com.hms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entity.Appointment;
import com.hms.entity.Doctor;
import com.hms.repository.AppointmentRepository;


@Service

public class AppointmentService {
	@Autowired
	private AppointmentRepository eRepository;
	public List<Appointment> getAppointment(){
		return eRepository.findAll();
	}
	public Appointment addAppointment(Appointment appointment) {
		return eRepository.save(appointment);
	}
}
