package io.swagger.model;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Messages")
public class Messages implements Serializable {

	private static final long serialVersionUID = 1L;

	@JacksonXmlProperty(localName = "Message")
	@JacksonXmlElementWrapper(useWrapping = false)
	protected List<Message> messages = null;

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}
	
}