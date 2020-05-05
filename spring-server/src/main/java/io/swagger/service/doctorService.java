package io.swagger.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import io.swagger.model.Doctor;
@Service

public interface doctorService {
    public Doctor addDoctor(Doctor doctor);
    public Doctor deleteDoctorById(long id);
	public List<Doctor> findAllDoctors();
	public Doctor updateDoctor(Doctor doctor);
	@Cacheable ("doctors")
	public Doctor findDoctorById(long id);
}
