package io.swagger.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonValue;

public class Messages2 extends Messages {


	private static final long serialVersionUID = 1L;
	
    @JsonValue
	public List<Message> getMessages() {
		return messages;
	}

	
}