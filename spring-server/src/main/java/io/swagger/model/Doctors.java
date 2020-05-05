package io.swagger.model;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Doctors")
public class Doctors implements Serializable {

	private static final long serialVersionUID = 1L;

	@JacksonXmlProperty(localName = "Doctor")
	@JacksonXmlElementWrapper(useWrapping = false)
	protected List<Doctor> doctors = null;

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}
	
}