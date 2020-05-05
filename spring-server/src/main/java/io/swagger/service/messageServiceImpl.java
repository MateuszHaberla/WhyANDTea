package io.swagger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.swagger.model.Message;

@Service
@Transactional
public class messageServiceImpl implements messageService {
	@Autowired
	private messageRepository messageRepository;
    @Transactional
    public void addmessage(Message message){
        messageRepository.saveAndFlush(message);
    }
	@Override
	public Message addMessage(Message message) {
		return messageRepository.save(message);
	}	

	@Override
	public Message deleteMessageById(long id) {
		Optional<Message> os = messageRepository.findById(id);
		if(os.isPresent()) messageRepository.deleteById(id);
		return os.get();
	}

	@Override
	public List<Message> findAllMessages() {
		return messageRepository.findAll();
	}

	@Override
	public Message findMessageById(long id) {
		Optional<Message> os = messageRepository.findById(id);
		if(os.isPresent()) return os.get();
		else return null;
	}

	@Override
	public Message updateMessage(Message message) {
		messageRepository.updateMessageById(message.getId(), message.getContent(), message.getSenderusersId(), message.getReceiverusersId());
		return message;

		
	}
}
