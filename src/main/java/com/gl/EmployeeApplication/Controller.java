package com.gl.EmployeeApplication;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    //RestController
    //My Comment
    @GetMapping(value = "/")
    public ResponseEntity<String> get()
    {
        return ResponseEntity.ok("Employee Details");
    }
}
