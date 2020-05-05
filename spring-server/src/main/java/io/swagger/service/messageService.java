package io.swagger.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;

import io.swagger.model.Message;

public interface messageService {
    public Message addMessage(Message message);
    public Message deleteMessageById(long id);
	public List<Message> findAllMessages();
	public Message updateMessage(Message message);
	@Cacheable ("messages")
	public Message findMessageById(long id);
}
