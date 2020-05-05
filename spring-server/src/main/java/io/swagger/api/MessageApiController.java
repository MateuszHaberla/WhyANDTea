package io.swagger.api;

import io.swagger.model.Body;
import io.swagger.model.Message;
import io.swagger.model.Messages;
import io.swagger.model.Messages2;
import io.swagger.service.messageService;

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
public class MessageApiController implements MessageApi {



    private static final Logger log = LoggerFactory.getLogger(MessageApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public MessageApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Message>> getmessage() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Message>>(objectMapper.readValue("[ {  \"receiverusersId\" : 1,  \"senderusersId\" : 6,  \"id\" : 0,  \"content\" : \"content\"}, {  \"receiverusersId\" : 1,  \"senderusersId\" : 6,  \"id\" : 0,  \"content\" : \"content\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Message>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Message>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Message>> sendmessage(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Body body) {
        String accept = request.getHeader("Accept");

        if (accept != null && accept.contains("application/json")) {
        	return new ResponseEntity<List<Message>>(io.swagger.Swagger2SpringBoot.ListM, HttpStatus.OK);
        }

        return new ResponseEntity<List<Message>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
