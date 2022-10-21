package com.hms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import com.hms.entity.Doctor;
import com.hms.repository.DoctorRepository;

@Service
public class DoctorService {
@Autowired
private DoctorRepository eRepository;
public List<Doctor> getDoctor(){
	return eRepository.findAll();
}
public Doctor addDoctor(Doctor doctor) {
	return eRepository.save(doctor);
}
public void deleteDoctor(int id) {
	
	 eRepository.deleteById(id);
	
}
public Doctor updateDoctor(Doctor doctor) {
	// TODO Auto-generated method stub
	/*
	 * list.forEach(e -> { if(e.getId()==course.getId()) {
	 * e.setTitle(course.getTitle()); e.setDescription(course.getDescription()); }
	 * }); //list.add(course); return course;
	 */	
	return eRepository.save(doctor);
}
//public Doctor updateDoctor(int id,Doctor doctor)
//{
//	doctor.setId(id);
//	return eRepository.save(doctor);
//}

//public Doctor updateDoctor(Doctor doctor) {
//	// TODO Auto-generated method stub
//	/*
//	 * list.forEach(e -> { if(e.getId()==course.getId()) {
//	 * e.setTitle(course.getTitle()); e.setDescription(course.getDescription()); }
//	 * }); //list.add(course); return course;
//	 */	
//	return eRepository.save(doctor);
//
//}
public void saveOrUpdate(Doctor doctors) {
	eRepository.save(doctors);
}
public void update(Doctor doctors,int id) {
	eRepository.save(doctors);
}
//public void delCourse(int parseInt) {
//	//list = this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
//	
//Doctor entity;
//try {
//	entity = DoctorRepository.getById(parseInt);
//} catch (Exception e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}
//eRepository.delete(entity);
//	
//}
public Doctor getDoctorById(Integer id) {
	return  eRepository.findById(id).get();
}
//public List<Employee> searchbyname(String ename){
//	return this.eRepository.findByEmpName(ename);
//			
//}
//public Doctor getDoctorById(int id) {
//	// TODO Auto-generated method stub
//	return  eRepository.findById(id).get();
//}

}
