package com.fola.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @RequestMapping(value = "/hello", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<AppResponse> helloAttribute(@RequestAttribute("filterUUID") String filterUUID,
                                                      @RequestAttribute("handlerUUID") String handlerUUID) {
        AppResponse appResponse = new AppResponse(filterUUID, handlerUUID);
        return new ResponseEntity<>(appResponse, HttpStatus.OK);
    }

}
