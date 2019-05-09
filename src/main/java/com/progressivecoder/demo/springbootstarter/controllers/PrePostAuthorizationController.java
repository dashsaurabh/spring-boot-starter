package com.progressivecoder.demo.springbootstarter.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class PrePostAuthorizationController {

    @GetMapping(value = "/preAuth/admin")
    @ResponseStatus(HttpStatus.OK)
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> getPreAuthAdminResponse(){
        System.out.println("Inside the Get Response Method");
        return new ResponseEntity<>("This is the admin response", HttpStatus.OK);
    }

    @GetMapping(value = "/preAuth/user")
    @ResponseStatus(HttpStatus.OK)
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<String> getPreAuthUserResponse(){
        System.out.println("Inside the Get Response Method");
        return new ResponseEntity<>("This is the user response", HttpStatus.OK);
    }

    @GetMapping(value = "/preAuth/general")
    @ResponseStatus(HttpStatus.OK)
    @PreAuthorize("hasRole('USER') AND hasRole('ADMIN')")
    public ResponseEntity<String> getPreAuthGeneralResponse(){
        System.out.println("Inside the Get Response Method");
        return new ResponseEntity<>("This is the general response", HttpStatus.OK);
    }

    @GetMapping(value = "/postAuth/admin")
    @ResponseStatus(HttpStatus.OK)
    @PostAuthorize("hasRole('ADMIN')")
    public ResponseEntity<String> getPostAuthAdminResponse(){
        System.out.println("Inside the Get Response Method");
        return new ResponseEntity<>("This is the admin response", HttpStatus.OK);
    }

    @GetMapping(value = "/postAuth/user")
    @ResponseStatus(HttpStatus.OK)
    @PostAuthorize("hasRole('USER')")
    public ResponseEntity<String> getPostAuthUserResponse(){
        System.out.println("Inside the Get Response Method");
        return new ResponseEntity<>("This is the user response", HttpStatus.OK);
    }

    @GetMapping(value = "/postAuth/general")
    @ResponseStatus(HttpStatus.OK)
    @PostAuthorize("hasRole('USER') AND hasRole('ADMIN')")
    public ResponseEntity<String> getPostAuthGeneralResponse(){
        System.out.println("Inside the Get Response Method");
        return new ResponseEntity<>("This is the general response", HttpStatus.OK);
    }

}
