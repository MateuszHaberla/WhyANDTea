package io.swagger.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonValue;

public class Doctors2 extends Doctors {


	private static final long serialVersionUID = 1L;
	
    @JsonValue
	public List<Doctor> getDoctors() {
		return doctors;
	}

	
}