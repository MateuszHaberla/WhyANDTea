package io.swagger.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.Message;

public interface messageRepository extends JpaRepository<Message,Long> {
	@Modifying
	//@Query("update Message s set s.id = ?1, s.content = ?2, s.senderusersId = ?3, s.receiverusersId = ?4")
	@Query(value = "update Message s set s.id = ?1, s.content = ?2, s.senderusersId = ?3, s.receiverusersId = ?4", nativeQuery = true)

	void updateMessageById(Integer id, String content, Integer senderusersId, Integer receiverusersId);
}
