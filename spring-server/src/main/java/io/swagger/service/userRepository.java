package io.swagger.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.User;

public interface userRepository extends JpaRepository<User,Long> {
	@Modifying
//	@Query("update User s set s.id = ?1, s.username = ?2, s.firstName = ?3, s.lastName = ?4, s.email = ?5, s.password = ?6, s.phone = ?7, s.avatarUrl = ?8, s.patientcard = ?9")
	@Query(value = "update User s set s.id = ?1, s.username = ?2, s.firstName = ?3, s.lastName = ?4, s.email = ?5, s.password = ?6, s.phone = ?7, s.avatarUrl = ?8, s.patientcard = ?9", nativeQuery = true)
	void updateUserById(Integer id, String username, String firstName, String lastName, String email, String password,
			String phone, String avatarUrl, String patientcard);


}
