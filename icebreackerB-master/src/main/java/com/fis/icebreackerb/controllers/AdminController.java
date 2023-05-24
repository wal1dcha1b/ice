package com.fis.icebreackerb.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PreAuthorize("hasRole('USER')")
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminController {
    
    @GetMapping("/")
    public String helloAdminController(){
        return "Admin level access";
    }

}
