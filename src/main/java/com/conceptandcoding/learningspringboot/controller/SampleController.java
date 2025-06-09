package com.conceptandcoding.learningspringboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.DataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.conceptandcoding.learningspringboot.dto.User;
import com.conceptandcoding.learningspringboot.service.FirstNamePropertyEditor;


@RestController
@RequestMapping(value = "/api/")
public class SampleController {

    @InitBinder
    protected void initBinder(DataBinder binder) {
        binder.registerCustomEditor(String.class, "firstName", new FirstNamePropertyEditor());
    }

    // RequestParam example
    @GetMapping(path = "/fetchUser")
    public String getUserDetails(@RequestParam(value = "firstName") String firstName,
                                @RequestParam(name = "lastName", required = false) String lastName) {
        return "fetched User details of "+ firstName + " and lastName: " + lastName;
    }

    // PathVariable example
    @GetMapping(path = "/fetchUser/{firstName}")
    public String getUserDetails(@PathVariable(value = "firstName") String firstName) {
        return "fetching and returning User details based on first name: "+ firstName;
    }

    // RequestBody example
    @PostMapping(path = "/saveUser")
    public String getUserDetails(@RequestBody User user) {
        return "User created " + user.getUsername() + ":" + user.getEmail();
    }

    // @ResponseEntity example
    @GetMapping(path = "/retrieveUser")
    public ResponseEntity<String> getUserDetail(@RequestParam(value = "firstName") String firstName) {
        String output =  "fetched User details of "+ firstName;
        return ResponseEntity.status(HttpStatus.OK).body(output);
    }
}
