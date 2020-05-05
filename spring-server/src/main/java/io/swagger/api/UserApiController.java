package io.swagger.api;

import io.swagger.model.User;
import io.swagger.model.Users;
import io.swagger.model.Users2;

import io.swagger.service.userService;

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
public class UserApiController implements UserApi {
	@Autowired
	private userService userService;

	
    private static final Logger log = LoggerFactory.getLogger(UserApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public UserApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<User> addUser(@ApiParam(value = "Created User object" ,required=true )  @Valid @RequestBody User body) {
        String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {

			io.swagger.Swagger2SpringBoot.ListU.add(body);
			return new ResponseEntity<User>(body, HttpStatus.OK );
		}
        return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
    }

	public ResponseEntity<User> deleteUserById(
			@ApiParam(value = "Numeric ID of the user to get.", required = true) @PathVariable("id") Long id) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			return ResponseEntity.ok(userService.deleteUserById(id));

		}
		return new ResponseEntity<User>(HttpStatus.NOT_IMPLEMENTED);
	}

    public ResponseEntity<Users> findAllUsers() {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {

			Users sts = new Users2();
			sts.setUsers(userService.findAllUsers());
			return ResponseEntity.ok(sts);
		}

		return new ResponseEntity<Users>(HttpStatus.NOT_IMPLEMENTED);
    }



}
