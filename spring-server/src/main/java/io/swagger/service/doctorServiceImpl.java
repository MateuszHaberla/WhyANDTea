package io.swagger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.swagger.model.Doctor;


@Service
@Transactional
public class doctorServiceImpl implements doctorService {
	@Autowired
	private doctorRepository doctorRepository;
    @Transactional
    public void adddoctor(Doctor doctor){
        doctorRepository.saveAndFlush(doctor);
    }
	@Override
	public Doctor addDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}	

	@Override
	public Doctor deleteDoctorById(long id) {
		Optional<Doctor> os = doctorRepository.findById(id);
		if(os.isPresent()) doctorRepository.deleteById(id);
		return os.get();
	}

	@Override
	public List<Doctor> findAllDoctors() {
		return doctorRepository.findAll();
	}
	

	@Override
	public Doctor findDoctorById(long id) {
		Optional<Doctor> os = doctorRepository.findById(id);
		if(os.isPresent()) return os.get();
		else return null;
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		doctorRepository.updateDoctorById(doctor.getId(), doctor.getDoctorname(), doctor.getFirstName(), doctor.getLastName(), doctor.getEmail(), doctor.getPassword(), doctor.getPhone(), doctor.getAvatarUrl(), doctor.getDoctorvotes());
		return doctor;
//// if you want to check rollNo first:
//		Optional<Doctor> os = DoctorRepository.findById(Doctor.getRollNo());
//		if(os.isPresent())
//		{ os.get().setName(Doctor.getName());
//		  os.get().setSurname(Doctor.getSurname());
//		  DoctorRepository.save(os.get());
//		  return os.get();}
//		else return null;
		
	}
}
