 package io.swagger.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.Doctor;

public interface doctorRepository extends JpaRepository<Doctor,Long> {
	@Modifying
	//@Query("update Doctor s set s.id = ?1, s.doctorname = ?2, s.firstName = ?3, s.lastName = ?4, s.email = ?5, s.password = ?6, s.phone = ?7, s.avatarUrl = ?8, s.doctorvotes = ?9")
	@Query(value = "update Doctor s set s.id = ?1, s.doctorname = ?2, s.firstName = ?3, s.lastName = ?4, s.email = ?5, s.password = ?6, s.phone = ?7, s.avatarUrl = ?8, s.doctorvotes = ?9", nativeQuery = true)
	//public List<Object[]> transactions();
	void updateDoctorById(Integer id, String doctorname, String firstName, String lastName, String email,
			String password, String phone, String avatarUrl, Integer doctorvotes);
}
