package io.swagger.api;

import io.swagger.model.Doctor;
import io.swagger.model.Doctors;
import io.swagger.model.Doctors2;
import io.swagger.service.doctorService;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-19T11:38:27.027Z")

@Controller
public class DoctorApiController implements DoctorApi {
	@Autowired
	private doctorService doctorService;
	
    private static final Logger log = LoggerFactory.getLogger(DoctorApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public DoctorApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Doctor> addDooctor(@ApiParam(value = "Created doctor object" ,required=true )  @Valid @RequestBody Doctor body) {
        String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {

			io.swagger.Swagger2SpringBoot.ListD.add(body);
			//return new ResponseEntity<Doctor>(body, HttpStatus.OK );
			return ResponseEntity.ok(doctorService.addDoctor(body));
		}
        return new ResponseEntity<Doctor>(HttpStatus.NOT_IMPLEMENTED);

    }


	public ResponseEntity<Doctor> deleteDoctorById(
			@ApiParam(value = "Numeric ID of the user to get.", required = true) @PathVariable("id") Long id) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			return ResponseEntity.ok(doctorService.deleteDoctorById(id));

		}
		return new ResponseEntity<Doctor>(HttpStatus.NOT_IMPLEMENTED);
	}
    public ResponseEntity<Doctors> findAllDoctors() {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {

			Doctors sts = new Doctors2();
			sts.setDoctors(doctorService.findAllDoctors());
			return ResponseEntity.ok(sts);
		}

		return new ResponseEntity<Doctors>(HttpStatus.NOT_IMPLEMENTED);
    }


    public ResponseEntity<List<Doctor>> updateDoctor(@ApiParam(value = "name that need to be updated",required=true) @PathVariable("Doctorname") String Doctorname,@ApiParam(value = "Updated Doctor object" ,required=true )  @Valid @RequestBody Doctor body) {
        String accept = request.getHeader("Accept");

        if (accept != null && accept.contains("application/json")) {
        	return new ResponseEntity<List<Doctor>>(io.swagger.Swagger2SpringBoot.ListD, HttpStatus.OK);
        }

        return new ResponseEntity<List<Doctor>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
